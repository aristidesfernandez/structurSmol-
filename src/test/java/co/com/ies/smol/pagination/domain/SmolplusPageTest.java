package co.com.ies.smol.pagination.domain;

import static org.assertj.core.api.Assertions.*;
import static co.com.ies.smol.pagination.domain.SmolplusPagesFixture.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import co.com.ies.smol.UnitTest;
import co.com.ies.smol.error.domain.MissingMandatoryValueException;

@UnitTest
class SmolplusPageTest {

  @Test
  void shouldGetEmptySinglePageWithoutContent() {
    SmolplusPage<String> page = SmolplusPage.singlePage(null);

    assertEmptyPage(page);
  }

  @Test
  void shouldGetEmptySinglePageFromBuilderWithoutContent() {
    SmolplusPage<?> page = SmolplusPage.builder(null).build();

    assertEmptyPage(page);
  }

  private void assertEmptyPage(SmolplusPage<?> page) {
    assertThat(page.content()).isEmpty();
    assertThat(page.currentPage()).isZero();
    assertThat(page.pageSize()).isZero();
    assertThat(page.totalElementsCount()).isZero();
  }

  @Test
  void shouldGetSinglePage() {
    SmolplusPage<String> page = SmolplusPage.singlePage(List.of("test", "dummy"));

    assertSinglePage(page);
  }

  @Test
  void shouldGetSinglePageFromBuilderWithContentOnly() {
    SmolplusPage<String> page = SmolplusPage.builder(List.of("test", "dummy")).build();

    assertSinglePage(page);
  }

  private void assertSinglePage(SmolplusPage<String> page) {
    assertThat(page.content()).containsExactly("test", "dummy");
    assertThat(page.currentPage()).isZero();
    assertThat(page.pageSize()).isEqualTo(2);
    assertThat(page.totalElementsCount()).isEqualTo(2);
    assertThat(page.pageCount()).isEqualTo(1);
  }

  @Test
  void shouldGetFullPage() {
    SmolplusPage<String> page = pageBuilder().build();

    assertThat(page.content()).containsExactly("test");
    assertThat(page.currentPage()).isEqualTo(2);
    assertThat(page.pageSize()).isEqualTo(10);
    assertThat(page.totalElementsCount()).isEqualTo(21);
    assertThat(page.pageCount()).isEqualTo(3);
  }

  @Test
  void shouldNotMapWithoutMapper() {
    assertThatThrownBy(() -> pageBuilder().build().map(null))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("mapper");
  }

  @Test
  void shouldMapPage() {
    SmolplusPage<String> page = pageBuilder().build().map(entry -> "hey");

    assertThat(page.content()).containsExactly("hey");
    assertThat(page.currentPage()).isEqualTo(2);
    assertThat(page.pageSize()).isEqualTo(10);
    assertThat(page.totalElementsCount()).isEqualTo(21);
    assertThat(page.pageCount()).isEqualTo(3);
  }

  @Test
  void shouldNotBeLastForFirstPage() {
    assertThat(pageBuilder().currentPage(0).build().isNotLast()).isTrue();
  }

  @Test
  void shouldBeLastWithOnePage() {
    assertThat(SmolplusPage.singlePage(List.of("d")).isNotLast()).isFalse();
  }

  @Test
  void shouldBeLastPageWithoutContent() {
    SmolplusPage<Object> page = SmolplusPage.builder(List.of()).currentPage(0).pageSize(1).totalElementsCount(0).build();
    assertThat(page.isNotLast()).isFalse();
  }

  @Test
  void shouldBeLastForLastPage() {
    assertThat(pageBuilder().currentPage(2).build().isNotLast()).isFalse();
  }

  @Test
  void shouldGetPageFromElements() {
    SmolplusPage<String> page = SmolplusPage.of(List.of("hello", "java", "world"), new SmolplusPageable(1, 1));

    assertThat(page.currentPage()).isEqualTo(1);
    assertThat(page.hasNext()).isTrue();
    assertThat(page.hasPrevious()).isTrue();
    assertThat(page.pageCount()).isEqualTo(3);
    assertThat(page.pageSize()).isEqualTo(1);
    assertThat(page.content()).containsExactly("java");
  }

  @Test
  void shouldGetEmptyPageFromOutOfBoundElements() {
    SmolplusPage<String> page = SmolplusPage.of(List.of("hello", "java", "world"), new SmolplusPageable(4, 1));

    assertThat(page.currentPage()).isEqualTo(4);
    assertThat(page.hasNext()).isFalse();
    assertThat(page.hasPrevious()).isTrue();
    assertThat(page.pageCount()).isEqualTo(3);
    assertThat(page.pageSize()).isEqualTo(1);
    assertThat(page.content()).isEmpty();
  }

  @Test
  void shouldGetPageWithLessThanExpectedElements() {
    SmolplusPage<String> page = SmolplusPage.of(List.of("hello", "java", "world"), new SmolplusPageable(0, 4));

    assertThat(page.currentPage()).isZero();
    assertThat(page.hasNext()).isFalse();
    assertThat(page.hasPrevious()).isFalse();
    assertThat(page.pageCount()).isEqualTo(1);
    assertThat(page.pageSize()).isEqualTo(4);
    assertThat(page.content()).hasSize(3);
  }
}

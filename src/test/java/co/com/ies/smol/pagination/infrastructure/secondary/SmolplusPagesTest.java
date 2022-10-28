package co.com.ies.smol.pagination.infrastructure.secondary;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.function.Function;

import org.junit.jupiter.api.Test;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import co.com.ies.smol.UnitTest;
import co.com.ies.smol.error.domain.MissingMandatoryValueException;
import co.com.ies.smol.pagination.domain.SmolplusPage;
import co.com.ies.smol.pagination.domain.SmolplusPageable;

@UnitTest
class SmolplusPagesTest {

  @Test
  void shouldNotBuildPageableFromNullSmolplusPageable() {
    assertThatThrownBy(() -> SmolplusPages.from(null))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("pagination");
  }

  @Test
  void shouldBuildPageableFromSmolplusPageable() {
    Pageable pagination = SmolplusPages.from(pagination());

    assertThat(pagination.getPageNumber()).isEqualTo(2);
    assertThat(pagination.getPageSize()).isEqualTo(15);
    assertThat(pagination.getSort()).isEqualTo(Sort.unsorted());
  }

  @Test
  void shouldNotBuildWithoutSort() {
    assertThatThrownBy(() -> SmolplusPages.from(pagination(), null))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("sort");
  }

  @Test
  void shouldBuildPageableFromSmolplusPageableAndSort() {
    Pageable pagination = SmolplusPages.from(pagination(), Sort.by("dummy"));

    assertThat(pagination.getPageNumber()).isEqualTo(2);
    assertThat(pagination.getPageSize()).isEqualTo(15);
    assertThat(pagination.getSort()).isEqualTo(Sort.by("dummy"));
  }

  private SmolplusPageable pagination() {
    return new SmolplusPageable(2, 15);
  }

  @Test
  void shouldNotConvertFromSpringPageWithoutSpringPage() {
    assertThatThrownBy(() -> SmolplusPages.from(null, source -> source))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("springPage");
  }

  @Test
  void shouldNotConvertFromSpringPageWithoutMapper() {
    assertThatThrownBy(() -> SmolplusPages.from(springPage(), null))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("mapper");
  }

  @Test
  void shouldConvertFromSpringPage() {
    SmolplusPage<String> page = SmolplusPages.from(springPage(), Function.identity());

    assertThat(page.content()).containsExactly("test");
    assertThat(page.currentPage()).isEqualTo(2);
    assertThat(page.pageSize()).isEqualTo(10);
    assertThat(page.totalElementsCount()).isEqualTo(30);
  }

  private PageImpl<String> springPage() {
    return new PageImpl<>(List.of("test"), PageRequest.of(2, 10), 30);
  }
}

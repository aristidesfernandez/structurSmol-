package co.com.ies.smol.pagination.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.com.ies.smol.UnitTest;
import co.com.ies.smol.error.domain.NumberValueTooHighException;
import co.com.ies.smol.error.domain.NumberValueTooLowException;

@UnitTest
class SmolplusPageableTest {

  @Test
  void shouldNotBuildWithNegativePage() {
    assertThatThrownBy(() -> new SmolplusPageable(-1, 10))
      .isExactlyInstanceOf(NumberValueTooLowException.class)
      .hasMessageContaining("page");
  }

  @Test
  void shouldNotBuildWithPageSizeAtZero() {
    assertThatThrownBy(() -> new SmolplusPageable(0, 0))
      .isExactlyInstanceOf(NumberValueTooLowException.class)
      .hasMessageContaining("pageSize");
  }

  @Test
  void shouldNotBuildWithPageSizeOverHundred() {
    assertThatThrownBy(() -> new SmolplusPageable(0, 101))
      .isExactlyInstanceOf(NumberValueTooHighException.class)
      .hasMessageContaining("pageSize");
  }

  @Test
  void shouldGetFirstPageInformation() {
    SmolplusPageable pageable = new SmolplusPageable(0, 15);

    assertThat(pageable.page()).isZero();
    assertThat(pageable.pageSize()).isEqualTo(15);
    assertThat(pageable.offset()).isZero();
  }

  @Test
  void shouldGetPageableInformation() {
    SmolplusPageable pageable = new SmolplusPageable(2, 15);

    assertThat(pageable.page()).isEqualTo(2);
    assertThat(pageable.pageSize()).isEqualTo(15);
    assertThat(pageable.offset()).isEqualTo(30);
  }
}

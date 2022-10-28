package co.com.ies.smol.pagination.infrastructure.primary;

import static co.com.ies.smol.BeanValidationAssertions.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.com.ies.smol.UnitTest;
import co.com.ies.smol.pagination.domain.SmolplusPageable;

@UnitTest
class RestSmolplusPageableTest {

  @Test
  void shouldConvertToDomain() {
    SmolplusPageable pageable = pageable().toPageable();

    assertThat(pageable.page()).isEqualTo(1);
    assertThat(pageable.pageSize()).isEqualTo(15);
  }

  @Test
  void shouldNotValidateWithPageUnderZero() {
    RestSmolplusPageable pageable = pageable();
    pageable.setPage(-1);

    assertThatBean(pageable).hasInvalidProperty("page");
  }

  @Test
  void shouldNotValidateWithSizeAtZero() {
    RestSmolplusPageable pageable = pageable();
    pageable.setPageSize(0);

    assertThatBean(pageable).hasInvalidProperty("pageSize").withParameter("value", 1L);
  }

  @Test
  void shouldNotValidateWithPageSizeOverHundred() {
    RestSmolplusPageable pageable = pageable();
    pageable.setPageSize(101);

    assertThatBean(pageable).hasInvalidProperty("pageSize");
  }

  private RestSmolplusPageable pageable() {
    return new RestSmolplusPageable(1, 15);
  }
}

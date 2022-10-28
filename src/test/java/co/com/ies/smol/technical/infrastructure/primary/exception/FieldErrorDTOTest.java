package co.com.ies.smol.technical.infrastructure.primary.exception;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import co.com.ies.smol.UnitTest;

@UnitTest
class FieldErrorDTOTest {

  @Test
  void shouldBuild() {
    FieldErrorDTO fieldErrorDTO = new FieldErrorDTO("dto", "field", "message");

    assertThat(fieldErrorDTO.getObjectName()).isEqualTo("dto");
    assertThat(fieldErrorDTO.getField()).isEqualTo("field");
    assertThat(fieldErrorDTO.getMessage()).isEqualTo("message");
  }
}

package co.com.ies.smol.account.infrastructure.primary;

import static co.com.ies.smol.account.domain.AccountsFixture.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import co.com.ies.smol.UnitTest;

@UnitTest
class RestAccountTest {

  private static final ObjectMapper json = new ObjectMapper();

  @Test
  void shouldSerializeToJson() throws JsonProcessingException {
    assertThat(json.writeValueAsString(RestAccount.from(account()))).isEqualTo(json());
  }

  private String json() {
    return """
        {\
        "username":"user",\
        "name":"Paul DUPOND",\
        "email":"email@company.fr",\
        "roles":["ROLE_ADMIN"]\
        }\
        """;
  }

}

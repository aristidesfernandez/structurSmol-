package co.com.ies.smolplus.account.domain;

import static co.com.ies.smolplus.useridentity.domain.UsersIdentitiesFixture.*;

import java.util.List;

import co.com.ies.smolplus.authentication.domain.Role;

public final class AccountsFixture {

  private AccountsFixture() {
  }

  public static Account account() {
    return Account.builder()
        .username(username())
        .firstname(firstname())
        .lastname(lastname())
        .email(email())
        .roles(List.of(Role.ADMIN.key()))
        .build();
  }

}

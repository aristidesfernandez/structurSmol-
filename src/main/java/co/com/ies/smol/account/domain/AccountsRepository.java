package co.com.ies.smol.account.domain;

import java.util.Optional;

public interface AccountsRepository {
  Optional<Account> authenticatedUserAccount();
}

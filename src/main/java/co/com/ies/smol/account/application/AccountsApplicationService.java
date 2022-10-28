package co.com.ies.smol.account.application;

import co.com.ies.smol.account.domain.Account;
import co.com.ies.smol.account.domain.AccountsRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class AccountsApplicationService {

  private final AccountsRepository accounts;

  public AccountsApplicationService(AccountsRepository accounts) {
    this.accounts = accounts;
  }

  public Optional<Account> authenticatedUserAccount() {
    return accounts.authenticatedUserAccount();
  }
}

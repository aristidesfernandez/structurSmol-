package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.currencytype;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.currencytype.CurrencyTypeRepository;


@Repository
public class SpringDataCurrencyTypeRepository implements CurrencyTypeRepository {

  private final JpaCurrencyTypeRepository jpaCurrencyTypeRepository;

  public SpringDataCurrencyTypeRepository(JpaCurrencyTypeRepository jpaCurrencyTypeRepository) {
    this.jpaCurrencyTypeRepository = jpaCurrencyTypeRepository;
  }
}

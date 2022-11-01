package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.country;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.country.CountryRepository;


@Repository
public class SpringDataCountryRepository implements CountryRepository {

  private final JpaCountryRepository jpaCountryRepository;

  public SpringDataCountryRepository(JpaCountryRepository jpaCountryRepository) {
    this.jpaCountryRepository = jpaCountryRepository;
  }
}

package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.keyoperatingproperty;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.keyoperatingproperty.KeyOperatingPropertyRepository;


@Repository
public class SpringDataKeyOperatingPropertyRepository implements KeyOperatingPropertyRepository {

  private final JpaKeyOperatingPropertyRepository jpaKeyOperatingPropertyRepository;

  public SpringDataKeyOperatingPropertyRepository(JpaKeyOperatingPropertyRepository jpaKeyOperatingPropertyRepository) {
    this.jpaKeyOperatingPropertyRepository = jpaKeyOperatingPropertyRepository;
  }
}

package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.municipality;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.municipality.MunicipalityRepository;


@Repository
public class SpringDataMunicipalityRepository implements MunicipalityRepository {

  private final JpaMunicipalityRepository jpaMunicipalityRepository;

  public SpringDataMunicipalityRepository(JpaMunicipalityRepository jpaMunicipalityRepository) {
    this.jpaMunicipalityRepository = jpaMunicipalityRepository;
  }
}

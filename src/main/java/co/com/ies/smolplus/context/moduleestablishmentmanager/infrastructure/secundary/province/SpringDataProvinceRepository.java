package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.province;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.province.ProvinceRepository;


@Repository
public class SpringDataProvinceRepository implements ProvinceRepository {

  private final JpaProvinceRepository jpaProvinceRepository;

  public SpringDataProvinceRepository(JpaProvinceRepository jpaProvinceRepository) {
    this.jpaProvinceRepository = jpaProvinceRepository;
  }
}

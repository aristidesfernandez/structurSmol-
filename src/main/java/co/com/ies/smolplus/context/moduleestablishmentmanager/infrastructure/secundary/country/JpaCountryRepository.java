package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.country;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCountryRepository extends JpaRepository<CountryEntity, Long>, JpaSpecificationExecutor<CountryEntity> {}

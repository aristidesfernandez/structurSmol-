package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.municipality;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaMunicipalityRepository extends JpaRepository<MunicipalityEntity, Long>, JpaSpecificationExecutor<MunicipalityEntity> {}

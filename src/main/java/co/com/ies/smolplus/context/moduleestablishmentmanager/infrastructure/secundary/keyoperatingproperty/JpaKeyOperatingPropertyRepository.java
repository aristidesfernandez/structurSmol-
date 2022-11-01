package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.keyoperatingproperty;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaKeyOperatingPropertyRepository extends JpaRepository<KeyOperatingPropertyEntity, Long>, JpaSpecificationExecutor<KeyOperatingPropertyEntity> {}

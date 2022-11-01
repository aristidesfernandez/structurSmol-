package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.operationalpropertiesestablishment;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaOperationalPropertiesEstablishmentRepository extends JpaRepository<OperationalPropertiesEstablishmentEntity, Long>, JpaSpecificationExecutor<OperationalPropertiesEstablishmentEntity> {}

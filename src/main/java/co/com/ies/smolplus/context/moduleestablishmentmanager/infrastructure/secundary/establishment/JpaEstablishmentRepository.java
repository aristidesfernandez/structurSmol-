package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.establishment;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEstablishmentRepository extends JpaRepository<EstablishmentEntity, Long>, JpaSpecificationExecutor<EstablishmentEntity> {}

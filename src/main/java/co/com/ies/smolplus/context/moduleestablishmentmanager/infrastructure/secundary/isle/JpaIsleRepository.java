package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.isle;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaIsleRepository extends JpaRepository<IsleEntity, Long>, JpaSpecificationExecutor<IsleEntity> {}

package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.operator;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaOperatorRepository extends JpaRepository<OperatorEntity, Long>, JpaSpecificationExecutor<OperatorEntity> {}

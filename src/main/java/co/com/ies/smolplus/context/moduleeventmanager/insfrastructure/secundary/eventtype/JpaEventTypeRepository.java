package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventtype;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEventTypeRepository extends JpaRepository<EventTypeEntity, Long>, JpaSpecificationExecutor<EventTypeEntity> {}

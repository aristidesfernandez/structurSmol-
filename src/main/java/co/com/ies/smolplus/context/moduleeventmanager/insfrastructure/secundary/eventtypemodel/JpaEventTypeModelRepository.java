package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventtypemodel;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEventTypeModelRepository extends JpaRepository<EventTypeModelEntity, Long>, JpaSpecificationExecutor<EventTypeModelEntity> {}

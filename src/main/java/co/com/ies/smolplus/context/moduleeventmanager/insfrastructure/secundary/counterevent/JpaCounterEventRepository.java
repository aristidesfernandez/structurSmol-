package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.counterevent;

import java.util.UUID;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCounterEventRepository extends JpaRepository<CounterEventEntity, UUID>, JpaSpecificationExecutor<CounterEventEntity> {}

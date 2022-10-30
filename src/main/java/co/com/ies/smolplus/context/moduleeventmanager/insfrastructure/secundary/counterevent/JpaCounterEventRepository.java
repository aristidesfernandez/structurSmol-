package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.counterevent;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCounterEventRepository extends JpaRepository<CounterEventEntity, Long>, JpaSpecificationExecutor<CounterEventEntity> {}

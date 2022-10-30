package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventdevice;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEventDeviceRepository extends JpaRepository<EventDeviceEntity, Long>, JpaSpecificationExecutor<EventDeviceEntity> {}

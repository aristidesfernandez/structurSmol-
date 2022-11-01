package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.device;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaDeviceRepository extends JpaRepository<DeviceEntity, Long>, JpaSpecificationExecutor<DeviceEntity> {
    
}

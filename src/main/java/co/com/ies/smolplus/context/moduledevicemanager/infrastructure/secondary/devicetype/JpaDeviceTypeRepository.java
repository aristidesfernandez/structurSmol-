package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.devicetype;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaDeviceTypeRepository extends JpaRepository<DeviceTypeEntity, Long>, JpaSpecificationExecutor<DeviceTypeEntity> {
    
}
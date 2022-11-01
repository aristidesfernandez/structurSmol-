package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.deviceinterface;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaDeviceInterfaceRepository extends JpaRepository<DeviceInterfaceEntity, Long>, JpaSpecificationExecutor<DeviceInterfaceEntity> {
    
}

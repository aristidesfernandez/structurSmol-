package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.deviceestablishment;


import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaDeviceEstablishmentRepository extends JpaRepository<DeviceEstablishmentEntity, Long>, JpaSpecificationExecutor<DeviceEstablishmentEntity> {
    
}

package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.deviceestablishment;


import co.com.ies.smolplus.context.moduledevicemanager.domain.deviceestablishment.DeviceEstablishment;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface JpaDeviceEstablishmentRepository extends JpaRepository<DeviceEstablishmentEntity, Long>, JpaSpecificationExecutor<DeviceEstablishmentEntity> {

  List<DeviceEstablishmentEntity> findAllByEstablishmentId(UUID id);
}

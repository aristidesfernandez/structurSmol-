package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.deviceestablishment;

import org.springframework.stereotype.Repository;
import co.com.ies.smolplus.context.moduledevicemanager.domain.deviceestablishment.DeviceEstablishmentRepository;


@Repository
public class SpringDataDeviceEstablishmentRepository implements DeviceEstablishmentRepository {  

  private final JpaDeviceEstablishmentRepository jpaDeviceEstablishmentRepository;
 
  public SpringDataDeviceEstablishmentRepository(JpaDeviceEstablishmentRepository jpaDeviceEstablishmentRepository) {
    this.jpaDeviceEstablishmentRepository = jpaDeviceEstablishmentRepository;

  }


 
}

package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.manufacturer;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduledevicemanager.domain.manufacturer.ManufacturerRepository;



@Repository
public class SpringDataManufacturerRepository implements ManufacturerRepository {  

  private final JpaManufacturerRepository jpaDeviceRepository;
  
 
  public SpringDataManufacturerRepository(JpaManufacturerRepository jpaDeviceRepository) {
    this.jpaDeviceRepository = jpaDeviceRepository;

  }
 
}

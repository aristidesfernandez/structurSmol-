package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.manufacturer;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduledevicemanager.domain.manufacturer.ManufacturerRepository;



@Repository
public class SpringDataManufacturerRepository implements ManufacturerRepository {  

  private final JpaManufacturerRepository jpaManufacturerRepository;
  
 
  public SpringDataManufacturerRepository(JpaManufacturerRepository jpaManufacturerRepository) {
    this.jpaManufacturerRepository = jpaManufacturerRepository;
  }
 
}

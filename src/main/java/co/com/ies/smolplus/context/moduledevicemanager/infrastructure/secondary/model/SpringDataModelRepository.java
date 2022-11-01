package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.model;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduledevicemanager.domain.model.ModelRepository;



@Repository
public class SpringDataModelRepository implements ModelRepository {  

  private final JpaModelRepository jpaDeviceRepository;

  
 
  public SpringDataModelRepository(JpaModelRepository jpaDeviceRepository) {
    this.jpaDeviceRepository = jpaDeviceRepository;

  }


 
}

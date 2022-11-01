package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.devicecategory;

import org.springframework.stereotype.Repository;
import co.com.ies.smolplus.context.moduledevicemanager.domain.devicecategory.DeviceCategoryRepository;




@Repository
public class SpringDataDeviceCategoryRepository implements DeviceCategoryRepository {  

  private final JpaDeviceCategoryRepository jpaDeviceCategoryRepository;
  
 
  public SpringDataDeviceCategoryRepository(JpaDeviceCategoryRepository jpaDeviceCategoryRepository) {
    this.jpaDeviceCategoryRepository = jpaDeviceCategoryRepository;

  }
 
}

package co.com.ies.smolplus.context.moduleusermanager.infrastructure.secondary;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleusermanager.domain.useraccess.UserAccessRepository;


@Repository
public class SpringDataUserAccessRepository implements  UserAccessRepository {  

  private final JpaUserAccessRepository jpaDeviceRepository;

  public SpringDataUserAccessRepository(JpaUserAccessRepository jpaDeviceRepository) {
    this.jpaDeviceRepository = jpaDeviceRepository;

  }
 
}

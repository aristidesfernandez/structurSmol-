package co.com.ies.smolplus.context.moduleusermanager.infrastructure.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.moduleusermanager.application.UserManagerService;

@RestController
@RequestMapping("/api")
public class UserAccessResource {

  private final Logger log = LoggerFactory.getLogger(UserAccessResource.class);
  private final UserManagerService userManagerService;

  public UserAccessResource(UserManagerService userManagerService) {
    this.userManagerService = userManagerService;
  } 

}

package co.com.ies.smolplus.context.moduleorchestrator.moduleusermanager.insfrastructure.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.moduleorchestrator.moduleusermanager.application.UserManagerRequest;

@RestController
@RequestMapping("/api")
public class UserManagerResource {

  private final Logger log = LoggerFactory.getLogger(UserManagerResource.class);

  private final UserManagerRequest userManagerRequest;

  public UserManagerResource(UserManagerRequest userManagerRequest) {
    this.userManagerRequest = userManagerRequest;
  }
}

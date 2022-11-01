package co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.insfrastructure.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.moduleorchestrator.moduleusermanager.application.UserManagerRequest;

@RestController
@RequestMapping("/api")
public class EstablishmentManagerResource {

  private final Logger log = LoggerFactory.getLogger(EstablishmentManagerResource.class);

  private final UserManagerRequest userManagerRequest;

  public EstablishmentManagerResource(UserManagerRequest userManagerRequest) {
    this.userManagerRequest = userManagerRequest;
  }
}

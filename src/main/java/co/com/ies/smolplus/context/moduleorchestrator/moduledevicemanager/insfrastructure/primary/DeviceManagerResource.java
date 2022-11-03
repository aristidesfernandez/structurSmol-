package co.com.ies.smolplus.context.moduleorchestrator.moduledevicemanager.insfrastructure.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.moduleorchestrator.moduleusermanager.application.UserManagerRequest;

@RestController
@RequestMapping("/api")
public class DeviceManagerResource {

  private final Logger log = LoggerFactory.getLogger(DeviceManagerResource.class);

  private final UserManagerRequest userManagerRequest;

  public DeviceManagerResource(UserManagerRequest userManagerRequest) {
    this.userManagerRequest = userManagerRequest;
  }

}

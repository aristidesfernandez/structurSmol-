package co.com.ies.smolplus.context.moduleorchestrator.modulecentralcommunication.insfrastructure.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.moduleorchestrator.modulecentralcommunication.application.CentralCommInternalRequest;

@RestController
@RequestMapping("/api")
public class CentralCommManagerResource {

  private final Logger log = LoggerFactory.getLogger(CentralCommManagerResource.class);

  private final CentralCommInternalRequest centralCommInternalRequest;

  public CentralCommManagerResource(CentralCommInternalRequest centralCommInternalRequest) {
    this.centralCommInternalRequest = centralCommInternalRequest;
  }
}

package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.moduleestablishmentmanager.application.EstablishmentManagerService;

@RestController
@RequestMapping("/api")
public class OperationalPropertiesEstablishmentResource {
    
    private final Logger log = LoggerFactory.getLogger(OperationalPropertiesEstablishmentResource.class);

    private final EstablishmentManagerService establishmentManagementService;
  
    public OperationalPropertiesEstablishmentResource(EstablishmentManagerService establishmentManagementService) {
      this.establishmentManagementService = establishmentManagementService;
    }
}

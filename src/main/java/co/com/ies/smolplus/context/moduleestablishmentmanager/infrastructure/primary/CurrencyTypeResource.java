package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.moduleestablishmentmanager.application.EstablishmentManagementService;

@RestController
@RequestMapping("/api")
public class CurrencyTypeResource {
    
    private final Logger log = LoggerFactory.getLogger(CurrencyTypeResource.class);

    private final EstablishmentManagementService establishmentManagementService;
  
    public CurrencyTypeResource(EstablishmentManagementService establishmentManagementService) {
      this.establishmentManagementService = establishmentManagementService;
    }
}

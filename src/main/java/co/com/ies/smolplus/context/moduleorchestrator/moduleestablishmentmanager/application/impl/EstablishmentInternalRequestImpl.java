package co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.application.impl;

import co.com.ies.smolplus.context.moduleestablishmentmanager.application.EstablishmentManagerService;
import co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.application.EstablishmentInternalRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class EstablishmentInternalRequestImpl implements EstablishmentInternalRequest {

    private final EstablishmentManagerService establishmentManagerService;

    public EstablishmentInternalRequestImpl(EstablishmentManagerService establishmentManagerService) {
        this.establishmentManagerService = establishmentManagerService;
    }    
    
}

package co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.application.impl;

import co.com.ies.smolplus.context.moduleestablishmentmanager.application.EstablishmentManagerService;
import co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.application.EstablishmentInternalRequest;

public class EstablishmentInternalRequestImpl implements EstablishmentInternalRequest {

    private final EstablishmentManagerService establishmentManagerService;

    public EstablishmentInternalRequestImpl(EstablishmentManagerService establishmentManagerService) {
        this.establishmentManagerService = establishmentManagerService;
    }    
    
}

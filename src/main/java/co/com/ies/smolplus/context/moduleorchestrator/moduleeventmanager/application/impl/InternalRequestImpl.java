package co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.application.impl;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.application.InternalRequest;

public class InternalRequestImpl implements InternalRequest {

    private final EventManagerService eventManagerService;

    public InternalRequestImpl(EventManagerService eventManagerService) {
        this.eventManagerService = eventManagerService;
    }
    
    
}

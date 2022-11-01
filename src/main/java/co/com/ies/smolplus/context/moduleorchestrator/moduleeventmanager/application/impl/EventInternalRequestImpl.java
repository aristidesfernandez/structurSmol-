package co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.application.impl;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.application.EventInternalRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class EventInternalRequestImpl implements EventInternalRequest {

    private final EventManagerService eventManagerService;

    public EventInternalRequestImpl(EventManagerService eventManagerService) {
        this.eventManagerService = eventManagerService;
    }
    
    
}

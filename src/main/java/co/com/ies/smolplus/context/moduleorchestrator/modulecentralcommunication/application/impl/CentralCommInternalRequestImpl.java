package co.com.ies.smolplus.context.moduleorchestrator.modulecentralcommunication.application.impl;

import co.com.ies.smolplus.context.modulecentralcommunication.application.CentralCommunicationService;
import co.com.ies.smolplus.context.moduleorchestrator.modulecentralcommunication.application.CentralCommInternalRequest;

public class CentralCommInternalRequestImpl implements CentralCommInternalRequest {

    private final CentralCommunicationService centralCommunicationService;

    public CentralCommInternalRequestImpl(CentralCommunicationService centralCommunicationService) {
        this.centralCommunicationService = centralCommunicationService;
    }    
    
}

package co.com.ies.smolplus.context.moduleorchestrator.modulecentralcommunication.application.impl;

import co.com.ies.smolplus.context.modulecentralcommunication.application.CentralCommunicationService;
import co.com.ies.smolplus.context.moduleorchestrator.modulecentralcommunication.application.CentralCommInternalRequest;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CentralCommInternalRequestImpl implements CentralCommInternalRequest {

    private final CentralCommunicationService centralCommunicationService;

    public CentralCommInternalRequestImpl(CentralCommunicationService centralCommunicationService) {
        this.centralCommunicationService = centralCommunicationService;
    }    
    
}

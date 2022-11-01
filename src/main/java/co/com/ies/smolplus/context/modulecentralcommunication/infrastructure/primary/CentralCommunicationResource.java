package co.com.ies.smolplus.context.modulecentralcommunication.infrastructure.primary;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.modulecentralcommunication.application.CentralCommunicationService;



@RestController
@RequestMapping("/api")
public class CentralCommunicationResource {

    private final Logger log = LoggerFactory.getLogger(CentralCommunicationResource.class);

    private final CentralCommunicationService centralCommunicationServiceService;

    public CentralCommunicationResource(CentralCommunicationService centralCommunicationServiceService) {
        this.centralCommunicationServiceService = centralCommunicationServiceService;
    }
    
}

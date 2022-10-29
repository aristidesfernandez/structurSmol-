package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary;


import java.net.URISyntaxException;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

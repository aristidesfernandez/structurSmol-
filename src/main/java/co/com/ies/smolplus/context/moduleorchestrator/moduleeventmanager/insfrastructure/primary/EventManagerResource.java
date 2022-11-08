package co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.insfrastructure.primary;

import co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.application.EventManagerRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class EventManagerResource {

  private final Logger log = LoggerFactory.getLogger(EventManagerResource.class);

  private final EventManagerRequest eventManagerRequest;

  public EventManagerResource(EventManagerRequest eventManagerRequest) {
    this.eventManagerRequest = eventManagerRequest;
  }



}

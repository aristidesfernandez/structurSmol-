package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;

@RestController
@RequestMapping("/api")
public class EventTypeModelResource {

  private final Logger log = LoggerFactory.getLogger(EventTypeModelResource.class);

  private final EventManagerService eventManagerService;

  public EventTypeModelResource(EventManagerService eventManagerService) {
    this.eventManagerService = eventManagerService;
  }  
}

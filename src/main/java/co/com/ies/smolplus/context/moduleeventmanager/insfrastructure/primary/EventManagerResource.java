package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EventManagerResource {

  private final Logger log = LoggerFactory.getLogger(EventManagerResource.class);

  private final EventManagerService eventManagerService;

  public EventManagerResource(EventManagerService eventManagerService) {
    this.eventManagerService = eventManagerService;
  }
}

package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;

@RestController
@RequestMapping("/api")
public class CounterEventResource {

  private final Logger log = LoggerFactory.getLogger(CounterEventResource.class);

  private final EventManagerService eventManagerService;

  public CounterEventResource(EventManagerService eventManagerService) {
    this.eventManagerService = eventManagerService;
  }  

}

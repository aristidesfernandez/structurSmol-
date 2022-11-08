package co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.insfrastructure.secondary;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.domain.ForeingEventManager;
import org.springframework.stereotype.Service;



@Service
public class ForeingEventManagerImpl implements ForeingEventManager {
  private EventManagerService eventManagerService;

  public ForeingEventManagerImpl(EventManagerService eventManagerService) {
    this.eventManagerService = eventManagerService;
  }

}

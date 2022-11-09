package co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.application.impl;

import co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.application.EventManagerRequest;
import co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.domain.ForeingEventManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class EventManagerRequestImpl implements EventManagerRequest {


  private final ForeingEventManager foreingEventManager;


  public EventManagerRequestImpl(ForeingEventManager foreingEventManager) {
    this.foreingEventManager = foreingEventManager;
  }


}

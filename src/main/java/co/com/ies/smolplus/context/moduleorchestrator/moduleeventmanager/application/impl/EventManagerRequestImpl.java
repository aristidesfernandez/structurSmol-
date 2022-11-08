package co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.application.impl;

import co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.application.EventManagerRequest;
import co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.domain.BuildF18;
import co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.domain.ForeingEventManager;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;


@Service
@Transactional
public class EventManagerRequestImpl implements EventManagerRequest {


  private final ForeingEventManager foreingEventManager;


  public EventManagerRequestImpl(ForeingEventManager foreingEventManager) {
    this.foreingEventManager = foreingEventManager;
  }


}

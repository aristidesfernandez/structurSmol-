package co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.insfrastructure.secondary;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.domain.ForeingEventManager;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class ForeingEventManagerImpl implements ForeingEventManager {
  private EventManagerService eventManagerService;

  public ForeingEventManagerImpl(EventManagerService eventManagerService) {
    this.eventManagerService = eventManagerService;
  }

  @Override
  public List<EventDeviceDTO> getEventDeviceByDate(ZonedDateTime liquidationDate) {
    return eventManagerService.getEventDeviceByDate(liquidationDate);
  }

  @Override
  public List<CounterEventDTO> getCounterEventByEventDeviceId(UUID id) {
    return eventManagerService.getCounterEventByEventDeviceId(id);
  }
}

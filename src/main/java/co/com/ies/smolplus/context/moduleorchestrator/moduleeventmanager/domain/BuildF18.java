package co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.domain;

import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

public class BuildF18 {

  private final ForeingEventManager foreingEventManager;

  public BuildF18(ForeingEventManager foreingEventManager) {
    this.foreingEventManager = foreingEventManager;
  }

  public List<EventDeviceDTO> getEventDeviceByDate(){
    ZonedDateTime controlTime = ZonedDateTime.now().withHour(6)
      .withMinute(0).withSecond(0);
    return foreingEventManager.getEventDeviceByDate(controlTime);
  }

  public List<CounterEventDTO> getCounterEventByEventDeviceId(UUID id){
    return foreingEventManager.getCounterEventByEventDeviceId(id);
  }

}

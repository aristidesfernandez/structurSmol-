package co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.domain;

import co.com.ies.smolplus.dto.moduleestablishmentmanager.EstablishmentDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

public class BuildF18 {

  private final ForeingEstablishmentManager foreingEstablishmentManager;

  public BuildF18(ForeingEstablishmentManager foreingEstablishmentManager) {
    this.foreingEstablishmentManager = foreingEstablishmentManager;
  }

  public EventDeviceDTO buildF18(){
    ZonedDateTime controlTime = ZonedDateTime.now().withHour(6)
      .withMinute(0).withSecond(0);

    List<EventDeviceDTO> eventDeviceDTOList = foreingEstablishmentManager.getEventDeviceByDate(controlTime);
    List<CounterEventDTO> counterEventDTOList = foreingEstablishmentManager.getCounterEventByEventDeviceId(null);

    //List<EstablishmentDTO> establishmentDTOList = foreingEstablishmentManager.



    return null;
  }

}

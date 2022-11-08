package co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.domain;

import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

public interface ForeingEstablishmentManager {

  List<EventDeviceDTO> getEventDeviceByDate(ZonedDateTime liquidationDate);

  List<CounterEventDTO> getCounterEventByEventDeviceId(UUID id);
}

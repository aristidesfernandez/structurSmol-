package co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.application;

import co.com.ies.smolplus.context.moduleeventmanager.domain.eventdevice.EventDevice;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;


public interface EventManagerRequest {

  List<EventDeviceDTO> getEventDeviceByDate();

  List<CounterEventDTO> getCounterEventByEventDeviceId(UUID id);


}

package co.com.ies.smolplus.context.moduleeventmanager.application;

import javax.validation.Valid;

import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventTypeDTO;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

public interface EventManagerService {
    EventTypeDTO createEventType(@Valid EventTypeDTO eventTypeDTO);

    List<EventDeviceDTO> getEventDeviceByDate(ZonedDateTime liquidationDate);

    List<CounterEventDTO> getCounterEventByEventDeviceId(UUID id);


}

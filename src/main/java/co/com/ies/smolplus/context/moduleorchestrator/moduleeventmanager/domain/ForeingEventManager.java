package co.com.ies.smolplus.context.moduleorchestrator.moduleeventmanager.domain;

import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

public interface ForeingEventManager {
    List<EventDeviceDTO> getEventDeviceByDate(ZonedDateTime liquidationDate);
    List<CounterEventDTO> getCounterEventByEventDeviceId(UUID id);
}

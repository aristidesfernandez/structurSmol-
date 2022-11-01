package co.com.ies.smolplus.context.moduleeventmanager.application;

import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventTypeDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventTypeModelDTO;

public interface EventManagerService {

    CounterEventDTO save(@Valid CounterEventDTO counterEventDTO);

    CounterEventDTO update(@Valid CounterEventDTO counterEventDTO);

    Optional<CounterEventDTO> findOneCounterEventDTO(UUID id);

    void delete(UUID id);


    EventDeviceDTO save(@Valid EventDeviceDTO eventDeviceDTO);

    EventDeviceDTO update(@Valid EventDeviceDTO eventDeviceDTO);

    Optional<EventDeviceDTO> findOneEventDeviceDTO(UUID id);


    EventTypeModelDTO save(@Valid EventTypeModelDTO eventTypeModelDTO);

    EventTypeModelDTO update(@Valid EventTypeModelDTO eventTypeModelDTO);

    Optional<EventTypeModelDTO> findOneEventTypeModelDTO(UUID id);


    EventTypeDTO save(@Valid EventTypeDTO eventTypeDTO);

    EventTypeDTO update(@Valid EventTypeDTO eventTypeDTO);

    Optional<EventTypeDTO> findOneEventEventTypeDTO(UUID id);

}

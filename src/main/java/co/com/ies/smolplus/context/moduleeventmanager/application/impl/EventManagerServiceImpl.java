package co.com.ies.smolplus.context.moduleeventmanager.application.impl;

import co.com.ies.smolplus.context.moduleeventmanager.application.counterevent.CounterEventService;
import co.com.ies.smolplus.context.moduleeventmanager.application.eventdevice.EventDeviceService;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.context.moduleeventmanager.application.eventtype.EventTypeService;
import co.com.ies.smolplus.dto.moduleeventmanager.EventTypeDTO;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EventManagerServiceImpl implements EventManagerService {


    private final EventTypeService eventTypeService;

    private final EventDeviceService eventDeviceService;

    private final CounterEventService counterEventService;


    public EventManagerServiceImpl(EventTypeService eventTypeService, EventDeviceService eventDeviceService, CounterEventService counterEventService) {
        this.eventTypeService = eventTypeService;
        this.eventDeviceService = eventDeviceService;
        this.counterEventService = counterEventService;
    }


    @Override
    public EventTypeDTO createEventType(EventTypeDTO eventTypeDTO) {
        return eventTypeService.createEventType(eventTypeDTO);
    }

    @Override
    public List<EventDeviceDTO> getEventDeviceByDate(ZonedDateTime liquidationDate) {
      return eventDeviceService.getEventDeviceByDate(liquidationDate);
    }

  @Override
  public List<CounterEventDTO> getCounterEventByEventDeviceId(UUID id) {
    return counterEventService.getCounterEventByEventDeviceId(id);
  }

}

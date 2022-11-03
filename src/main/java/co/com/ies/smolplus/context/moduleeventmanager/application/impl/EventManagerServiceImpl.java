package co.com.ies.smolplus.context.moduleeventmanager.application.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.context.moduleeventmanager.application.counterevent.CounterEventService;
import co.com.ies.smolplus.context.moduleeventmanager.application.eventdevice.EventDeviceService;
import co.com.ies.smolplus.context.moduleeventmanager.application.eventtype.EventTypeService;
import co.com.ies.smolplus.context.moduleeventmanager.application.eventtypemodel.EventTypeModelService;
import co.com.ies.smolplus.dto.moduleeventmanager.EventTypeDTO;

@Service
@Transactional
public class EventManagerServiceImpl implements EventManagerService {


    private final EventTypeService eventTypeService;
    private final CounterEventService counterEventService;
    private final EventDeviceService eventDeviceService;
    private final EventTypeModelService eventTypeModelService;

  
    public EventManagerServiceImpl(EventTypeService eventTypeService, CounterEventService counterEventService,
            EventDeviceService eventDeviceService, EventTypeModelService eventTypeModelService) {
        this.eventTypeService = eventTypeService;
        this.counterEventService = counterEventService;
        this.eventDeviceService = eventDeviceService;
        this.eventTypeModelService = eventTypeModelService;
    }


    @Override
    public EventTypeDTO createEventType(EventTypeDTO eventTypeDTO) {
        return eventTypeService.createEventType(eventTypeDTO);
    }

   

}

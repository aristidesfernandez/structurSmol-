package co.com.ies.smolplus.context.moduleeventmanager.application.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ies.smolplus.context.moduleeventmanager.application.EventManagerService;
import co.com.ies.smolplus.context.moduleeventmanager.application.eventtype.EventTypeService;
import co.com.ies.smolplus.dto.moduleeventmanager.EventTypeDTO;

@Service
@Transactional
public class EventManagerServiceImpl implements EventManagerService {


    private final EventTypeService eventTypeService;

    public EventManagerServiceImpl(EventTypeService eventTypeService) {
        this.eventTypeService = eventTypeService;
    }
   

    @Override
    public EventTypeDTO createEventType(EventTypeDTO eventTypeDTO) {
        return eventTypeService.createEventType(eventTypeDTO);
    }

   

}

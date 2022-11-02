package co.com.ies.smolplus.context.moduleeventmanager.application;

import javax.validation.Valid;

import co.com.ies.smolplus.dto.moduleeventmanager.EventTypeDTO;

public interface EventManagerService { 
    EventTypeDTO createEventType(@Valid EventTypeDTO eventTypeDTO);
}

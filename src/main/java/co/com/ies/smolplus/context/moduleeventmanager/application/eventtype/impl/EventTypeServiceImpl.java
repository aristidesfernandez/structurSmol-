package co.com.ies.smolplus.context.moduleeventmanager.application.eventtype.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ies.smolplus.context.moduleeventmanager.application.eventtype.EventTypeService;
import co.com.ies.smolplus.context.moduleeventmanager.domain.eventtype.CreateEventType;
import co.com.ies.smolplus.context.moduleeventmanager.domain.eventtype.EventTypeRepository;
import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.primary.mapper.eventtype.EventTypeMapper;
import co.com.ies.smolplus.dto.moduleeventmanager.EventTypeDTO;
import co.com.ies.smolplus.context.moduleeventmanager.domain.eventtype.EventType;


@Service
@Transactional
public class EventTypeServiceImpl implements EventTypeService {

    private final EventTypeMapper eventTypeMapper;
    private final CreateEventType createEventType;
    private final EventTypeRepository eventTypeRepository;

    public EventTypeServiceImpl(EventTypeMapper eventTypeMapper, EventTypeRepository eventTypeRepository) {
        this.eventTypeMapper = eventTypeMapper;
        this.eventTypeRepository = eventTypeRepository;
        this.createEventType = new CreateEventType(eventTypeRepository);
    }
    

    @Override
    public EventTypeDTO createEventType(EventTypeDTO eventTypeDTO) {

        EventType eventType = eventTypeMapper.toDomain(eventTypeDTO);
        EventType eventTypeCreated = createEventType.create(eventType);

        return eventTypeMapper.toDto(eventTypeCreated);
    }
    
}

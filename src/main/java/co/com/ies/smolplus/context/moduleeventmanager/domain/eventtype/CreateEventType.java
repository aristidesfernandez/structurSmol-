package co.com.ies.smolplus.context.moduleeventmanager.domain.eventtype;



public class CreateEventType {

    private EventTypeRepository eventTypeRepository;

    public CreateEventType(EventTypeRepository eventTypeRepository) {
        this.eventTypeRepository = eventTypeRepository;
    }

    public EventType create(EventType  device) { 
        return eventTypeRepository.create(device);
    }
    
}

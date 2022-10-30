package co.com.ies.smolplus.context.moduleeventmanager.domain.eventtype;

import co.com.ies.smolplus.context.moduleeventmanager.domain.EventManagerRepository;

public class CreateEventType {

  private EventManagerRepository eventManagerRepository;

  public CreateEventType(EventManagerRepository eventManagerRepository) {
    this.eventManagerRepository = eventManagerRepository;
  }
}

package co.com.ies.smolplus.context.moduleeventmanager.domain.counterevent;

import co.com.ies.smolplus.context.moduleeventmanager.domain.EventManagerRepository;

public class CreateCounterEvent {

  private EventManagerRepository eventManagerRepository;

  public CreateCounterEvent(EventManagerRepository eventManagerRepository) {
    this.eventManagerRepository = eventManagerRepository;
  }
}

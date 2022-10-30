package co.com.ies.smolplus.context.moduleeventmanager.domain.eventdevice;

import co.com.ies.smolplus.context.moduleeventmanager.domain.EventManagerRepository;

public class CreateEventDevice {

  private EventManagerRepository eventManagerRepository;

  public CreateEventDevice(EventManagerRepository eventManagerRepository) {
    this.eventManagerRepository = eventManagerRepository;
  }
}

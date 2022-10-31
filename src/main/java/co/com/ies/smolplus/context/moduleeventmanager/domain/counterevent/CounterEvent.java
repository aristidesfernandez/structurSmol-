package co.com.ies.smolplus.context.moduleeventmanager.domain.counterevent;

import java.util.UUID;

import co.com.ies.smolplus.context.moduleeventmanager.domain.eventdevice.EventDevice;

public class CounterEvent {

  private UUID id;

  private Long valueCounter;

  private Float denominationSale;

  private String counterCode;

  private EventDevice eventDevice;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Long getValueCounter() {
    return valueCounter;
  }

  public void setValueCounter(Long valueCounter) {
    this.valueCounter = valueCounter;
  }

  public Float getDenominationSale() {
    return denominationSale;
  }

  public void setDenominationSale(Float denominationSale) {
    this.denominationSale = denominationSale;
  }

  public String getCounterCode() {
    return counterCode;
  }

  public void setCounterCode(String counterCode) {
    this.counterCode = counterCode;
  }

  public EventDevice getEventDevice() {
    return eventDevice;
  }

  public void setEventDevice(EventDevice eventDevice) {
    this.eventDevice = eventDevice;
  }

  @Override
  public String toString() {
    return "CounterEvent [id=" + id + ", valueCounter=" + valueCounter + ", denominationSale=" + denominationSale
        + ", counterCode=" + counterCode + ", eventDevice=" + eventDevice + "]";
  }

}

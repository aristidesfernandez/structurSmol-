package co.com.ies.smolplus.dto;

import java.util.UUID;

public class CounterEventDTO {

  private UUID id;

  private Long valueCounter;

  private Float denominationSale;

  private String counterCode; 

  private EventDeviceDTO eventDevice;

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

  public EventDeviceDTO getEventDevice() {
    return eventDevice;
  }

  public void setEventDevice(EventDeviceDTO eventDevice) {
    this.eventDevice = eventDevice;
  }

  @Override
  public String toString() {
    return "CounterEventDTO [id=" + id + ", valueCounter=" + valueCounter + ", denominationSale=" + denominationSale
        + ", counterCode=" + counterCode + ", eventDevice=" + eventDevice + "]";
  }
  
}

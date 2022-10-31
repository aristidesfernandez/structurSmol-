package co.com.ies.smolplus.dto;

public class CounterEventDTO {

  private Long id;

  private Long valueCounter;

  private Float denominationSale;

  private String counterCode; 

  private EventDeviceDTO eventDevice;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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
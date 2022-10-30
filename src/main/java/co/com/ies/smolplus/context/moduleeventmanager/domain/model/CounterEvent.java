package co.com.ies.smolplus.context.moduleeventmanager.domain.model;

public class CounterEvent {

  private Long id;

  private Long valueCounter;

  private Float denominationSale;

  private CounterType counterType; //Definir entidad en su respectivo modulo

  private EventDevice eventDevice;

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

  public CounterType getCounterType() {
    return counterType;
  }

  public void setCounterType(CounterType counterType) {
    this.counterType = counterType;
  }

  public EventDevice getEventDevice() {
    return eventDevice;
  }

  public void setEventDevice(EventDevice eventDevice) {
    this.eventDevice = eventDevice;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((valueCounter == null) ? 0 : valueCounter.hashCode());
    result = prime * result + ((denominationSale == null) ? 0 : denominationSale.hashCode());
    result = prime * result + ((counterType == null) ? 0 : counterType.hashCode());
    result = prime * result + ((eventDevice == null) ? 0 : eventDevice.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CounterEvent other = (CounterEvent) obj;
    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;
    if (valueCounter == null) {
      if (other.valueCounter != null) return false;
    } else if (!valueCounter.equals(other.valueCounter)) return false;
    if (denominationSale == null) {
      if (other.denominationSale != null) return false;
    } else if (!denominationSale.equals(other.denominationSale)) return false;
    if (counterType == null) {
      if (other.counterType != null) return false;
    } else if (!counterType.equals(other.counterType)) return false;
    if (eventDevice == null) {
      if (other.eventDevice != null) return false;
    } else if (!eventDevice.equals(other.eventDevice)) return false;
    return true;
  }

  @Override
  public String toString() {
    return (
      "CounterEvent [id=" +
      id +
      ", valueCounter=" +
      valueCounter +
      ", denominationSale=" +
      denominationSale +
      ", counterType=" +
      counterType +
      ", eventDevice=" +
      eventDevice +
      "]"
    );
  }
}

package co.com.ies.smolplus.dto.moduleeventmanager;

import java.time.ZonedDateTime;
import java.util.UUID;

public class EventDeviceDTO {

  private UUID id;

  private ZonedDateTime createdAt;

  private Boolean theoreticalPercentage;

  private Double moneyDenomination;

  private UUID deviceId; 

  private EventTypeDTO eventType;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Boolean getTheoreticalPercentage() {
    return theoreticalPercentage;
  }

  public void setTheoreticalPercentage(Boolean theoreticalPercentage) {
    this.theoreticalPercentage = theoreticalPercentage;
  }

  public Double getMoneyDenomination() {
    return moneyDenomination;
  }

  public void setMoneyDenomination(Double moneyDenomination) {
    this.moneyDenomination = moneyDenomination;
  }

  public UUID getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(UUID deviceId) {
    this.deviceId = deviceId;
  }

  public EventTypeDTO getEventType() {
    return eventType;
  }

  public void setEventType(EventTypeDTO eventType) {
    this.eventType = eventType;
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
    result = prime * result + ((theoreticalPercentage == null) ? 0 : theoreticalPercentage.hashCode());
    result = prime * result + ((moneyDenomination == null) ? 0 : moneyDenomination.hashCode());
    result = prime * result + ((deviceId == null) ? 0 : deviceId.hashCode());
    result = prime * result + ((eventType == null) ? 0 : eventType.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    EventDeviceDTO other = (EventDeviceDTO) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (createdAt == null) {
      if (other.createdAt != null)
        return false;
    } else if (!createdAt.equals(other.createdAt))
      return false;
    if (theoreticalPercentage == null) {
      if (other.theoreticalPercentage != null)
        return false;
    } else if (!theoreticalPercentage.equals(other.theoreticalPercentage))
      return false;
    if (moneyDenomination == null) {
      if (other.moneyDenomination != null)
        return false;
    } else if (!moneyDenomination.equals(other.moneyDenomination))
      return false;
    if (deviceId == null) {
      if (other.deviceId != null)
        return false;
    } else if (!deviceId.equals(other.deviceId))
      return false;
    if (eventType == null) {
      if (other.eventType != null)
        return false;
    } else if (!eventType.equals(other.eventType))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "EventDeviceDTO [id=" + id + ", createdAt=" + createdAt + ", theoreticalPercentage=" + theoreticalPercentage
        + ", moneyDenomination=" + moneyDenomination + ", deviceId=" + deviceId
        + ", deviceCategory=" + eventType + "]";
  }
  
}

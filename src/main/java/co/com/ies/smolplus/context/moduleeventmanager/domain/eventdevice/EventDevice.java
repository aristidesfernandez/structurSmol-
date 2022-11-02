package co.com.ies.smolplus.context.moduleeventmanager.domain.eventdevice;

import java.time.ZonedDateTime;
import java.util.UUID;

import co.com.ies.smolplus.context.moduleeventmanager.domain.eventtype.EventType;

public class EventDevice {

  private UUID id;

  private ZonedDateTime createdAt;

  private Boolean theoreticalPercentage;

  private Double moneyDenomination;

  private UUID deviceId; 

  private EventType deviceCategory;

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


  public EventType getDeviceCategory() {
    return deviceCategory;
  }

  public void setDeviceCategory(EventType deviceCategory) {
    this.deviceCategory = deviceCategory;
  }

  public UUID getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(UUID deviceId) {
    this.deviceId = deviceId;
  }

  @Override
  public String toString() {
    return "EventDevice [id=" + id + ", createdAt=" + createdAt + ", theoreticalPercentage=" + theoreticalPercentage
        + ", moneyDenomination=" + moneyDenomination + ", deviceId=" + deviceId + ", deviceCategory=" + deviceCategory
        + "]";
  }

}

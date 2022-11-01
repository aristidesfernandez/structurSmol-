package co.com.ies.smolplus.dto.moduleeventmanager;

import java.time.ZonedDateTime;
import java.util.UUID;

public class EventDeviceDTO {

  private UUID id;

  private ZonedDateTime createdAt;

  private Boolean theoreticalPercentage;

  private Double moneyDenomination;

  private UUID deviceEstablishmentId; 

  private EventTypeDTO eventTypeDTO;

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

  public EventTypeDTO getDeviceCategory() {
    return eventTypeDTO;
  }

  public void setDeviceCategory(EventTypeDTO eventTypeDTO) {
    this.eventTypeDTO = eventTypeDTO;
  }

  public UUID getDeviceEstablishmentId() {
    return deviceEstablishmentId;
  }

  public void setDeviceEstablishmentId(UUID deviceEstablishmentId) {
    this.deviceEstablishmentId = deviceEstablishmentId;
  }

  @Override
  public String toString() {
    return "EventDeviceDTO [id=" + id + ", createdAt=" + createdAt + ", theoreticalPercentage=" + theoreticalPercentage
        + ", moneyDenomination=" + moneyDenomination + ", deviceEstablishmentId=" + deviceEstablishmentId
        + ", deviceCategory=" + eventTypeDTO + "]";
  }
  
}

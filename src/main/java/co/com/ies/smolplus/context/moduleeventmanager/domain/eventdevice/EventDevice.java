package co.com.ies.smolplus.context.moduleeventmanager.domain.eventdevice;

import java.time.ZonedDateTime;
import java.util.UUID;

import co.com.ies.smolplus.context.moduleeventmanager.domain.eventtype.EventType;

public class EventDevice {

  private UUID id;

  private ZonedDateTime createdAt;

  private Boolean theoreticalPercentage;

  private Double moneyDenomination;

  private UUID establishment; 

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

  public UUID getEstablishment() {
    return establishment;
  }

  public void setEstablishment(UUID establishment) {
    this.establishment = establishment;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
    result = prime * result + ((theoreticalPercentage == null) ? 0 : theoreticalPercentage.hashCode());
    result = prime * result + ((moneyDenomination == null) ? 0 : moneyDenomination.hashCode());
    result = prime * result + ((establishment == null) ? 0 : establishment.hashCode());
    result = prime * result + ((deviceCategory == null) ? 0 : deviceCategory.hashCode());
    return result;
  }



  @Override
  public String toString() {
    return (
      "EventDeviceEntity [id=" +
      id +
      ", createdAt=" +
      createdAt +
      ", theoreticalPercentage=" +
      theoreticalPercentage +
      ", moneyDenomination=" +
      moneyDenomination +
      ", establishment=" +
      establishment +
      ", deviceCategory=" +
      deviceCategory +
      "]"
    );
  }


}

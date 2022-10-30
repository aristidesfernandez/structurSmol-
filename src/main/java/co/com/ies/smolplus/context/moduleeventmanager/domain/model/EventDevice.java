package co.com.ies.smolplus.context.moduleeventmanager.domain.model;

import java.time.ZonedDateTime;

public class EventDevice {

  private Long id;

  private ZonedDateTime createdAt;

  private Boolean theoreticalPercentage;

  private Double moneyDenomination;

  private Establishment establishment; //Definir modelo o enum?

  private EventType deviceCategory;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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

  public Establishment getEstablishment() {
    return establishment;
  }

  public void setEstablishment(Establishment establishment) {
    this.establishment = establishment;
  }

  public EventType getDeviceCategory() {
    return deviceCategory;
  }

  public void setDeviceCategory(EventType deviceCategory) {
    this.deviceCategory = deviceCategory;
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
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    EventDevice other = (EventDevice) obj;
    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;
    if (createdAt == null) {
      if (other.createdAt != null) return false;
    } else if (!createdAt.equals(other.createdAt)) return false;
    if (theoreticalPercentage == null) {
      if (other.theoreticalPercentage != null) return false;
    } else if (!theoreticalPercentage.equals(other.theoreticalPercentage)) return false;
    if (moneyDenomination == null) {
      if (other.moneyDenomination != null) return false;
    } else if (!moneyDenomination.equals(other.moneyDenomination)) return false;
    if (establishment == null) {
      if (other.establishment != null) return false;
    } else if (!establishment.equals(other.establishment)) return false;
    if (deviceCategory == null) {
      if (other.deviceCategory != null) return false;
    } else if (!deviceCategory.equals(other.deviceCategory)) return false;
    return true;
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

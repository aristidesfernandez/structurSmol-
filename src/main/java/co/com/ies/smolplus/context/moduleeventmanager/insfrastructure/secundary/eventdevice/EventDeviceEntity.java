package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventdevice;

import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventtype.EventTypeEntity;
import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "event_device")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class EventDeviceEntity implements Serializable {

  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;

  @Column(name = "createdAt")
  private ZonedDateTime createdAt;

  @Column(name = "theoreticalPercentage")
  private Boolean theoreticalPercentage;

  @Column(name = "moneyDenomination")
  private Double moneyDenomination;

  @ManyToOne(optional = false)
  @NotNull
  private EstablishmentEntity establishment; //Definir entidad en su respectivo modulo

  @ManyToOne(optional = false)
  @NotNull
  private EventTypeEntity deviceCategory;

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

  public EstablishmentEntity getEstablishment() {
    return establishment;
  }

  public void setEstablishment(EstablishmentEntity establishment) {
    this.establishment = establishment;
  }

  public EventTypeEntity getDeviceCategory() {
    return deviceCategory;
  }

  public void setDeviceCategory(EventTypeEntity deviceCategory) {
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
    EventDeviceEntity other = (EventDeviceEntity) obj;
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

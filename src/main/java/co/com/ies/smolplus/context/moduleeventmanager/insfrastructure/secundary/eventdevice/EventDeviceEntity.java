package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventdevice;

import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventtype.EventTypeEntity;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.UUID;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A EventDevice.  
 */
//TODO: pendiente validar nueva Version
@Entity
@Table(name = "event_device")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class EventDeviceEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    @Column(name = "theoretical_percentage")
    private Boolean theoreticalPercentage;

    @Column(name = "money_denomination")
    private Double moneyDenomination;

    @NotNull
    @Column(name = "device_id")
    private  UUID deviceId;

    @ManyToOne(optional = false)
    @NotNull
    private EventTypeEntity eventTypeEntity;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public UUID getId() {
        return this.id;
    }

    public EventDeviceEntity id(UUID id) {
        this.setId(id);
        return this;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public EventDeviceEntity createdAt(ZonedDateTime createdAt) {
        this.setCreatedAt(createdAt);
        return this;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getTheoreticalPercentage() {
        return this.theoreticalPercentage;
    }

    public EventDeviceEntity theoreticalPercentage(Boolean theoreticalPercentage) {
        this.setTheoreticalPercentage(theoreticalPercentage);
        return this;
    }

    public UUID getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(UUID deviceId) {
        this.deviceId = deviceId;
    }

    public void setTheoreticalPercentage(Boolean theoreticalPercentage) {
        this.theoreticalPercentage = theoreticalPercentage;
    }

    public Double getMoneyDenomination() {
        return this.moneyDenomination;
    }

    public EventDeviceEntity moneyDenomination(Double moneyDenomination) {
        this.setMoneyDenomination(moneyDenomination);
        return this;
    }

    public void setMoneyDenomination(Double moneyDenomination) {
        this.moneyDenomination = moneyDenomination;
    }

    public EventTypeEntity getEventType() {
        return this.eventTypeEntity;
    }

    public void setEventType(EventTypeEntity eventTypeEntity) {
        this.eventTypeEntity = eventTypeEntity;
    }

    public EventDeviceEntity eventType(EventTypeEntity eventTypeEntity) {
        this.setEventType(eventTypeEntity);
        return this;
    }

    

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EventDeviceEntity)) {
            return false;
        }
        return id != null && id.equals(((EventDeviceEntity) o).id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "EventDeviceEntity [id=" + id + ", createdAt=" + createdAt + ", theoreticalPercentage="
                + theoreticalPercentage + ", moneyDenomination=" + moneyDenomination + ", deviceId=" + deviceId
                + ", eventTypeEntity=" + eventTypeEntity + "]";
    }
  
 
}

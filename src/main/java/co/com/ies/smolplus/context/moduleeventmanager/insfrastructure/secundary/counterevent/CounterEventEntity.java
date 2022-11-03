package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.counterevent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventdevice.EventDeviceEntity;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A CounterEvent.
 */
@Entity
@Table(name = "counter_event")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class CounterEventEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @Column(name = "value_counter")
    private Long valueCounter;

    @Column(name = "denomination_sale")
    private Float denominationSale;

    @NotNull
    @Size(max = 2)
    @Column(name = "counter_code", length = 2, nullable = false)
    private String counterCode;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "deviceEstablishment", "eventType" }, allowSetters = true)
    private EventDeviceEntity eventDevice;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public UUID getId() {
        return this.id;
    }

    public CounterEventEntity id(UUID id) {
        this.setId(id);
        return this;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getValueCounter() {
        return this.valueCounter;
    }

    public CounterEventEntity valueCounter(Long valueCounter) {
        this.setValueCounter(valueCounter);
        return this;
    }

    public void setValueCounter(Long valueCounter) {
        this.valueCounter = valueCounter;
    }

    public Float getDenominationSale() {
        return this.denominationSale;
    }

    public CounterEventEntity denominationSale(Float denominationSale) {
        this.setDenominationSale(denominationSale);
        return this;
    }

    public void setDenominationSale(Float denominationSale) {
        this.denominationSale = denominationSale;
    }

    public String getCounterCode() {
        return this.counterCode;
    }

    public CounterEventEntity counterCode(String counterCode) {
        this.setCounterCode(counterCode);
        return this;
    }

    public void setCounterCode(String counterCode) {
        this.counterCode = counterCode;
    }

    public EventDeviceEntity getEventDevice() {
        return this.eventDevice;
    }

    public void setEventDevice(EventDeviceEntity eventDevice) {
        this.eventDevice = eventDevice;
    }

    public CounterEventEntity eventDevice(EventDeviceEntity eventDevice) {
        this.setEventDevice(eventDevice);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CounterEventEntity)) {
            return false;
        }
        return id != null && id.equals(((CounterEventEntity) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CounterEvent{" +
            "id=" + getId() +
            ", valueCounter=" + getValueCounter() +
            ", denominationSale=" + getDenominationSale() +
            ", counterCode='" + getCounterCode() + "'" +
            "}";
    }
}

package co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventtypemodel;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import co.com.ies.smolplus.context.moduleeventmanager.insfrastructure.secundary.eventtype.EventTypeEntity;

/**
 * A EventTypeModel.
 */
@Entity
@Table(name = "event_type_model")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class EventTypeModelEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "model_id")
    private Integer modelId;

    @ManyToOne
    private EventTypeEntity eventType;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public EventTypeModelEntity id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getModelId() {
        return this.modelId;
    }

    public EventTypeModelEntity modelId(Integer modelId) {
        this.setModelId(modelId);
        return this;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public EventTypeEntity getEventType() {
        return this.eventType;
    }

    public void setEventType(EventTypeEntity eventType) {
        this.eventType = eventType;
    }

    public EventTypeModelEntity eventType(EventTypeEntity eventType) {
        this.setEventType(eventType);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EventTypeModelEntity)) {
            return false;
        }
        return id != null && id.equals(((EventTypeModelEntity) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "EventTypeModel{" +
            "id=" + getId() +
            ", modelId=" + getModelId() +
            "}";
    }
}

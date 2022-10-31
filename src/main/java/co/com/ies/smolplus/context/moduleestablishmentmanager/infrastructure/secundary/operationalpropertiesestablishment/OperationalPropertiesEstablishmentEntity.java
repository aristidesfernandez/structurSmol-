package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.operationalpropertiesestablishment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.establishment.EstablishmentEntity;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.keyoperatingproperty.KeyOperatingPropertyEntity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A OperationalPropertiesEstablishment.
 */
@Entity
@Table(name = "operational_properties_establishment")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class OperationalPropertiesEstablishmentEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "value")
    private String value;

    @ManyToOne(optional = false)
    @NotNull
    private KeyOperatingPropertyEntity keyOperatingPropertyEntity;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "operator", "municipality" }, allowSetters = true)
    private EstablishmentEntity establishmentEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public KeyOperatingPropertyEntity getKeyOperatingPropertyEntity() {
        return keyOperatingPropertyEntity;
    }

    public void setKeyOperatingPropertyEntity(KeyOperatingPropertyEntity keyOperatingPropertyEntity) {
        this.keyOperatingPropertyEntity = keyOperatingPropertyEntity;
    }

    public EstablishmentEntity getEstablishmentEntity() {
        return establishmentEntity;
    }

    public void setEstablishmentEntity(EstablishmentEntity establishmentEntity) {
        this.establishmentEntity = establishmentEntity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((keyOperatingPropertyEntity == null) ? 0 : keyOperatingPropertyEntity.hashCode());
        result = prime * result + ((establishmentEntity == null) ? 0 : establishmentEntity.hashCode());
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
        OperationalPropertiesEstablishmentEntity other = (OperationalPropertiesEstablishmentEntity) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if (keyOperatingPropertyEntity == null) {
            if (other.keyOperatingPropertyEntity != null)
                return false;
        } else if (!keyOperatingPropertyEntity.equals(other.keyOperatingPropertyEntity))
            return false;
        if (establishmentEntity == null) {
            if (other.establishmentEntity != null)
                return false;
        } else if (!establishmentEntity.equals(other.establishmentEntity))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OperationalPropertiesEstablishmentEntity [id=" + id + ", value=" + value
                + ", keyOperatingPropertyEntity=" + keyOperatingPropertyEntity + ", establishmentEntity="
                + establishmentEntity + "]";
    }

    
}

package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.establishment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.establishment.EstablishmentType;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.municipality.MunicipalityEntity;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.operator.OperatorEntity;

import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Establishment.
 */
@Entity
@Table(name = "establishment")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class EstablishmentEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "liquidation_time")
    private ZonedDateTime liquidationTime;

    @Size(max = 100)
    @Column(name = "name", length = 100)
    private String name;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private EstablishmentType type;

    @Size(max = 25)
    @Column(name = "neighborhood", length = 25)
    private String neighborhood;

    @Size(max = 25)
    @Column(name = "address", length = 25)
    private String address;

    @NotNull
    @Size(max = 100)
    @Column(name = "coljuegos_code", length = 100, nullable = false)
    private String coljuegosCode;

    @NotNull
    @Column(name = "start_time", nullable = false)
    private ZonedDateTime startTime;

    @NotNull
    @Column(name = "close_time", nullable = false)
    private ZonedDateTime closeTime;

    @Column(name = "longitude")
    private Float longitude;

    @Column(name = "latitude")
    private Float latitude;

    @Column(name = "time_zone")
    private String timeZone;

    @Size(max = 100)
    @Column(name = "mercantile_registration", length = 100)
    private String mercantileRegistration;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "municipality" }, allowSetters = true)
    private OperatorEntity operator;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "province" }, allowSetters = true)
    private MunicipalityEntity municipality;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getLiquidationTime() {
        return liquidationTime;
    }

    public void setLiquidationTime(ZonedDateTime liquidationTime) {
        this.liquidationTime = liquidationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EstablishmentType getType() {
        return type;
    }

    public void setType(EstablishmentType type) {
        this.type = type;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColjuegosCode() {
        return coljuegosCode;
    }

    public void setColjuegosCode(String coljuegosCode) {
        this.coljuegosCode = coljuegosCode;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(ZonedDateTime startTime) {
        this.startTime = startTime;
    }

    public ZonedDateTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(ZonedDateTime closeTime) {
        this.closeTime = closeTime;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public Operator timeZone(String timeZone) {
        this.setTimeZone(timeZone);
        return this;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getMercantileRegistration() {
        return mercantileRegistration;
    }

    public void setMercantileRegistration(String mercantileRegistration) {
        this.mercantileRegistration = mercantileRegistration;
    }

    public OperatorEntity getOperator() {
        return operator;
    }

    public void setOperator(OperatorEntity operator) {
        this.operator = operator;
    }

    public MunicipalityEntity getMunicipality() {
        return municipality;
    }

    public void setMunicipality(MunicipalityEntity municipality) {
        this.municipality = municipality;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((liquidationTime == null) ? 0 : liquidationTime.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((neighborhood == null) ? 0 : neighborhood.hashCode());
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((coljuegosCode == null) ? 0 : coljuegosCode.hashCode());
        result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
        result = prime * result + ((closeTime == null) ? 0 : closeTime.hashCode());
        result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
        result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
        result = prime * result + ((mercantileRegistration == null) ? 0 : mercantileRegistration.hashCode());
        result = prime * result + ((operator == null) ? 0 : operator.hashCode());
        result = prime * result + ((municipality == null) ? 0 : municipality.hashCode());
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
        EstablishmentEntity other = (EstablishmentEntity) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (liquidationTime == null) {
            if (other.liquidationTime != null)
                return false;
        } else if (!liquidationTime.equals(other.liquidationTime))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (type != other.type)
            return false;
        if (neighborhood == null) {
            if (other.neighborhood != null)
                return false;
        } else if (!neighborhood.equals(other.neighborhood))
            return false;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (coljuegosCode == null) {
            if (other.coljuegosCode != null)
                return false;
        } else if (!coljuegosCode.equals(other.coljuegosCode))
            return false;
        if (startTime == null) {
            if (other.startTime != null)
                return false;
        } else if (!startTime.equals(other.startTime))
            return false;
        if (closeTime == null) {
            if (other.closeTime != null)
                return false;
        } else if (!closeTime.equals(other.closeTime))
            return false;
        if (longitude == null) {
            if (other.longitude != null)
                return false;
        } else if (!longitude.equals(other.longitude))
            return false;
        if (latitude == null) {
            if (other.latitude != null)
                return false;
        } else if (!latitude.equals(other.latitude))
            return false;
        if (mercantileRegistration == null) {
            if (other.mercantileRegistration != null)
                return false;
        } else if (!mercantileRegistration.equals(other.mercantileRegistration))
            return false;
        if (operator == null) {
            if (other.operator != null)
                return false;
        } else if (!operator.equals(other.operator))
            return false;
        if (municipality == null) {
            if (other.municipality != null)
                return false;
        } else if (!municipality.equals(other.municipality))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "EstablishmentEntity [id=" + id + ", liquidationTime=" + liquidationTime + ", name=" + name + ", type="
                + type + ", neighborhood=" + neighborhood + ", address=" + address + ", coljuegosCode=" + coljuegosCode
                + ", startTime=" + startTime + ", closeTime=" + closeTime + ", longitude=" + longitude + ", latitude="
                + latitude + ", mercantileRegistration=" + mercantileRegistration + ", operatorEntity=" + operator
                + ", municipality=" + municipality + "]";
    }

    
}

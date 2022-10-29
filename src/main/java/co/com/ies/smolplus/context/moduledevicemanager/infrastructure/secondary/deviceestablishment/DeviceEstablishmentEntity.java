package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.deviceestablishment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.UUID;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DeviceEstablishment.
 */
@Entity
@Table(name = "device_establishment")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DeviceEstablishmentEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private UUID id;

    @NotNull
    @Column(name = "registration_at", nullable = false)
    private ZonedDateTime registrationAt;

    @Column(name = "departure_at")
    private ZonedDateTime departureAt;

    @Column(name = "device_number")
    private Integer deviceNumber;

    @Column(name = "consecutive_device")
    private Integer consecutiveDevice;

    @Column(name = "establishment_id")
    private Long establishmentId;

    @Column(name = "negative_award")
    private Float negativeAward;

    @ManyToOne
    @JsonIgnoreProperties(value = { "model", "deviceCategory", "deviceType", "formulaHandpay", "formulaJackpot" }, allowSetters = true)
    private DeviceEntity device;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public UUID getId() {
        return this.id;
    }

    public DeviceEstablishmentEntity id(UUID id) {
        this.setId(id);
        return this;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ZonedDateTime getRegistrationAt() {
        return this.registrationAt;
    }

    public DeviceEstablishmentEntity registrationAt(ZonedDateTime registrationAt) {
        this.setRegistrationAt(registrationAt);
        return this;
    }

    public void setRegistrationAt(ZonedDateTime registrationAt) {
        this.registrationAt = registrationAt;
    }

    public ZonedDateTime getDepartureAt() {
        return this.departureAt;
    }

    public DeviceEstablishmentEntity departureAt(ZonedDateTime departureAt) {
        this.setDepartureAt(departureAt);
        return this;
    }

    public void setDepartureAt(ZonedDateTime departureAt) {
        this.departureAt = departureAt;
    }

    public Integer getDeviceNumber() {
        return this.deviceNumber;
    }

    public DeviceEstablishmentEntity deviceNumber(Integer deviceNumber) {
        this.setDeviceNumber(deviceNumber);
        return this;
    }

    public void setDeviceNumber(Integer deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public Integer getConsecutiveDevice() {
        return this.consecutiveDevice;
    }

    public DeviceEstablishmentEntity consecutiveDevice(Integer consecutiveDevice) {
        this.setConsecutiveDevice(consecutiveDevice);
        return this;
    }

    public void setConsecutiveDevice(Integer consecutiveDevice) {
        this.consecutiveDevice = consecutiveDevice;
    }

    public Long getEstablishmentId() {
        return this.establishmentId;
    }

    public DeviceEstablishmentEntity establishmentId(Long establishmentId) {
        this.setEstablishmentId(establishmentId);
        return this;
    }

    public void setEstablishmentId(Long establishmentId) {
        this.establishmentId = establishmentId;
    }

    public Float getNegativeAward() {
        return this.negativeAward;
    }

    public DeviceEstablishmentEntity negativeAward(Float negativeAward) {
        this.setNegativeAward(negativeAward);
        return this;
    }

    public void setNegativeAward(Float negativeAward) {
        this.negativeAward = negativeAward;
    }

    public DeviceEntity getDevice() {
        return this.device;
    }

    public void setDevice(DeviceEntity device) {
        this.device = device;
    }

    public DeviceEstablishmentEntity device(DeviceEntity device) {
        this.setDevice(device);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeviceEstablishmentEntity)) {
            return false;
        }
        return id != null && id.equals(((DeviceEstablishmentEntity) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DeviceEstablishment{" +
            "id=" + getId() +
            ", registrationAt='" + getRegistrationAt() + "'" +
            ", departureAt='" + getDepartureAt() + "'" +
            ", deviceNumber=" + getDeviceNumber() +
            ", consecutiveDevice=" + getConsecutiveDevice() +
            ", establishmentId=" + getEstablishmentId() +
            ", negativeAward=" + getNegativeAward() +
            "}";
    }
}

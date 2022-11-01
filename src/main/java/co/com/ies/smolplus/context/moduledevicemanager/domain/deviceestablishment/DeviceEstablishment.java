package co.com.ies.smolplus.context.moduledevicemanager.domain.deviceestablishment;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.UUID;

import co.com.ies.smolplus.context.moduledevicemanager.domain.device.Device;

public class DeviceEstablishment implements Serializable {

    private UUID id;

    private ZonedDateTime registrationAt;

    private ZonedDateTime departureAt;

    private Integer deviceNumber;

    private Integer consecutiveDevice;

    private Integer establishmentId;

    private Float negativeAward;

    private Device device;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ZonedDateTime getRegistrationAt() {
        return registrationAt;
    }

    public void setRegistrationAt(ZonedDateTime registrationAt) {
        this.registrationAt = registrationAt;
    }

    public ZonedDateTime getDepartureAt() {
        return departureAt;
    }

    public void setDepartureAt(ZonedDateTime departureAt) {
        this.departureAt = departureAt;
    }

    public Integer getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(Integer deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public Integer getConsecutiveDevice() {
        return consecutiveDevice;
    }

    public void setConsecutiveDevice(Integer consecutiveDevice) {
        this.consecutiveDevice = consecutiveDevice;
    }

    public Integer getEstablishmentId() {
        return establishmentId;
    }

    public void setEstablishmentId(Integer establishmentId) {
        this.establishmentId = establishmentId;
    }

    public Float getNegativeAward() {
        return negativeAward;
    }

    public void setNegativeAward(Float negativeAward) {
        this.negativeAward = negativeAward;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeviceEstablishment)) {
            return false;
        }

        DeviceEstablishment deviceEstablishmentDTO = (DeviceEstablishment) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, deviceEstablishmentDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DeviceEstablishment{" +
            "id='" + getId() + "'" +
            ", registrationAt='" + getRegistrationAt() + "'" +
            ", departureAt='" + getDepartureAt() + "'" +
            ", deviceNumber=" + getDeviceNumber() +
            ", consecutiveDevice=" + getConsecutiveDevice() +
            ", establishmentId=" + getEstablishmentId() +
            ", negativeAward=" + getNegativeAward() +
            ", device=" + getDevice() +
            "}";
    }
}

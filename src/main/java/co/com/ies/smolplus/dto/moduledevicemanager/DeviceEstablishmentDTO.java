package co.com.ies.smolplus.dto.moduledevicemanager;

import java.time.ZonedDateTime;
import java.util.UUID;


public class DeviceEstablishmentDTO {


    private UUID id;

    private ZonedDateTime registrationAt;

    private ZonedDateTime departureAt;

    private Integer deviceNumber;

    private Integer consecutiveDevice;

    private Integer establishmentId;

    private Float negativeAward;

    private DeviceDTO device;

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

    public DeviceDTO getDevice() {
        return device;
    }

    public void setDevice(DeviceDTO device) {
        this.device = device;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((registrationAt == null) ? 0 : registrationAt.hashCode());
        result = prime * result + ((departureAt == null) ? 0 : departureAt.hashCode());
        result = prime * result + ((deviceNumber == null) ? 0 : deviceNumber.hashCode());
        result = prime * result + ((consecutiveDevice == null) ? 0 : consecutiveDevice.hashCode());
        result = prime * result + ((establishmentId == null) ? 0 : establishmentId.hashCode());
        result = prime * result + ((negativeAward == null) ? 0 : negativeAward.hashCode());
        result = prime * result + ((device == null) ? 0 : device.hashCode());
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
        DeviceEstablishmentDTO other = (DeviceEstablishmentDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (registrationAt == null) {
            if (other.registrationAt != null)
                return false;
        } else if (!registrationAt.equals(other.registrationAt))
            return false;
        if (departureAt == null) {
            if (other.departureAt != null)
                return false;
        } else if (!departureAt.equals(other.departureAt))
            return false;
        if (deviceNumber == null) {
            if (other.deviceNumber != null)
                return false;
        } else if (!deviceNumber.equals(other.deviceNumber))
            return false;
        if (consecutiveDevice == null) {
            if (other.consecutiveDevice != null)
                return false;
        } else if (!consecutiveDevice.equals(other.consecutiveDevice))
            return false;
        if (establishmentId == null) {
            if (other.establishmentId != null)
                return false;
        } else if (!establishmentId.equals(other.establishmentId))
            return false;
        if (negativeAward == null) {
            if (other.negativeAward != null)
                return false;
        } else if (!negativeAward.equals(other.negativeAward))
            return false;
        if (device == null) {
            if (other.device != null)
                return false;
        } else if (!device.equals(other.device))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DeviceEstablishmentDTO [id=" + id + ", registrationAt=" + registrationAt + ", departureAt="
                + departureAt + ", deviceNumber=" + deviceNumber + ", consecutiveDevice=" + consecutiveDevice
                + ", establishmentId=" + establishmentId + ", negativeAward=" + negativeAward + ", device=" + device
                + "]";
    }


}

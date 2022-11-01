package co.com.ies.smolplus.context.moduledevicemanager.domain.deviceinterface;


import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

import co.com.ies.smolplus.context.moduledevicemanager.domain.device.Device;
import co.com.ies.smolplus.context.moduledevicemanager.domain.enumeration.DeviceInterfaceStatus;
import co.com.ies.smolplus.context.moduledevicemanager.domain.interfaceboard.InterfaceBoard;


public class DeviceInterface implements Serializable {

    private Long id;

    private ZonedDateTime startDate;

    private ZonedDateTime endDate;

    private Integer establishmentId;

    private DeviceInterfaceStatus state;

    private Device device;

    private InterfaceBoard interfaceBoard;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }

    public ZonedDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(ZonedDateTime endDate) {
        this.endDate = endDate;
    }

    public Integer getEstablishmentId() {
        return establishmentId;
    }

    public void setEstablishmentId(Integer establishmentId) {
        this.establishmentId = establishmentId;
    }

    public DeviceInterfaceStatus getState() {
        return state;
    }

    public void setState(DeviceInterfaceStatus state) {
        this.state = state;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public InterfaceBoard getInterfaceBoard() {
        return interfaceBoard;
    }

    public void setInterfaceBoard(InterfaceBoard interfaceBoard) {
        this.interfaceBoard = interfaceBoard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeviceInterface)) {
            return false;
        }

        DeviceInterface deviceInterface = (DeviceInterface) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, deviceInterface.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DeviceInterface{" +
            "id=" + getId() +
            ", startDate='" + getStartDate() + "'" +
            ", endDate='" + getEndDate() + "'" +
            ", establishmentId=" + getEstablishmentId() +
            ", state='" + getState() + "'" +
            ", device=" + getDevice() +
            ", interfaceBoard=" + getInterfaceBoard() +
            "}";
    }
}

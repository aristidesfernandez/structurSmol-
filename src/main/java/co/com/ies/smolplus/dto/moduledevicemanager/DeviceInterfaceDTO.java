package co.com.ies.smolplus.dto.moduledevicemanager;

import java.time.ZonedDateTime;


public class DeviceInterfaceDTO {


    private Long id;

    private ZonedDateTime startDate;

    private ZonedDateTime endDate;

    private Integer establishmentId;

    private DeviceInterfaceStatus state;

    private DeviceDTO device;

    private InterfaceBoardDTO interfaceBoard;

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

    public DeviceDTO getDevice() {
        return device;
    }

    public void setDevice(DeviceDTO device) {
        this.device = device;
    }

    public InterfaceBoardDTO getInterfaceBoard() {
        return interfaceBoard;
    }

    public void setInterfaceBoard(InterfaceBoardDTO interfaceBoard) {
        this.interfaceBoard = interfaceBoard;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
        result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
        result = prime * result + ((establishmentId == null) ? 0 : establishmentId.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((device == null) ? 0 : device.hashCode());
        result = prime * result + ((interfaceBoard == null) ? 0 : interfaceBoard.hashCode());
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
        DeviceInterfaceDTO other = (DeviceInterfaceDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        } else if (!startDate.equals(other.startDate))
            return false;
        if (endDate == null) {
            if (other.endDate != null)
                return false;
        } else if (!endDate.equals(other.endDate))
            return false;
        if (establishmentId == null) {
            if (other.establishmentId != null)
                return false;
        } else if (!establishmentId.equals(other.establishmentId))
            return false;
        if (state != other.state)
            return false;
        if (device == null) {
            if (other.device != null)
                return false;
        } else if (!device.equals(other.device))
            return false;
        if (interfaceBoard == null) {
            if (other.interfaceBoard != null)
                return false;
        } else if (!interfaceBoard.equals(other.interfaceBoard))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DeviceInterfaceDTO [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate
                + ", establishmentId=" + establishmentId + ", state=" + state + ", device=" + device
                + ", interfaceBoard=" + interfaceBoard + "]";
    }

    
}

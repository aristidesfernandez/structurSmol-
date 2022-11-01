package co.com.ies.smolplus.context.moduledevicemanager.domain.commanddevice;

import java.io.Serializable;
import java.util.Objects;

import co.com.ies.smolplus.context.moduledevicemanager.domain.command.Command;
import co.com.ies.smolplus.context.moduledevicemanager.domain.device.Device;

public class CommandDevice implements Serializable {

    private Long id;

    private Command command;

    private Device device;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
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
        if (!(o instanceof CommandDevice)) {
            return false;
        }

        CommandDevice commandDeviceDTO = (CommandDevice) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, commandDeviceDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CommandDeviceDTO{" +
            "id=" + getId() +
            ", command=" + getCommand() +
            ", device=" + getDevice() +
            "}";
    }
}

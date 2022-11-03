package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.commanddevice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.command.CommandEntity;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.device.DeviceEntity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A CommandDevice.
 */
@Entity
@Table(name = "command_device")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class CommandDeviceEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @ManyToOne(optional = false)
    @NotNull
    private CommandEntity command;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "model", "deviceCategory", "deviceType", "formulaHandpay", "formulaJackpot" }, allowSetters = true)
    private DeviceEntity device;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public CommandDeviceEntity id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CommandEntity getCommand() {
        return this.command;
    }

    public void setCommand(CommandEntity command) {
        this.command = command;
    }

    public CommandDeviceEntity command(CommandEntity command) {
        this.setCommand(command);
        return this;
    }

    public DeviceEntity getDevice() {
        return this.device;
    }

    public void setDevice(DeviceEntity device) {
        this.device = device;
    }

    public CommandDeviceEntity device(DeviceEntity device) {
        this.setDevice(device);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommandDeviceEntity)) {
            return false;
        }
        return id != null && id.equals(((CommandDeviceEntity) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CommandDevice{" +
            "id=" + getId() +
            "}";
    }
}

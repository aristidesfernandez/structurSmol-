package co.com.ies.smolplus.context.moduledevicemanager.domain.counterdevice;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

import co.com.ies.smolplus.context.moduledevicemanager.domain.device.Device;

public class CounterDevice implements Serializable {

    private UUID id;

    private BigDecimal value;

    private BigDecimal rolloverValue;

    private BigDecimal creditSale;

    private Boolean manualCounter;

    private BigDecimal manualMultiplier;

    private Boolean decimalsManualCounter;

    private Device device;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getRolloverValue() {
        return rolloverValue;
    }

    public void setRolloverValue(BigDecimal rolloverValue) {
        this.rolloverValue = rolloverValue;
    }

    public BigDecimal getCreditSale() {
        return creditSale;
    }

    public void setCreditSale(BigDecimal creditSale) {
        this.creditSale = creditSale;
    }

    public Boolean getManualCounter() {
        return manualCounter;
    }

    public void setManualCounter(Boolean manualCounter) {
        this.manualCounter = manualCounter;
    }

    public BigDecimal getManualMultiplier() {
        return manualMultiplier;
    }

    public void setManualMultiplier(BigDecimal manualMultiplier) {
        this.manualMultiplier = manualMultiplier;
    }

    public Boolean getDecimalsManualCounter() {
        return decimalsManualCounter;
    }

    public void setDecimalsManualCounter(Boolean decimalsManualCounter) {
        this.decimalsManualCounter = decimalsManualCounter;
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
        if (!(o instanceof CounterDevice)) {
            return false;
        }

        CounterDevice counterDevice = (CounterDevice) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, counterDevice.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CounterDevice{" +
            "id='" + getId() + "'" +
            ", value=" + getValue() +
            ", rolloverValue=" + getRolloverValue() +
            ", creditSale=" + getCreditSale() +
            ", manualCounter='" + getManualCounter() + "'" +
            ", manualMultiplier=" + getManualMultiplier() +
            ", decimalsManualCounter='" + getDecimalsManualCounter() + "'" +
            ", device=" + getDevice() +
            "}";
    }
}

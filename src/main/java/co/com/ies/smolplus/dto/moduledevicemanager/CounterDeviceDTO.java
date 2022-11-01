package co.com.ies.smolplus.dto.moduledevicemanager;

import java.math.BigDecimal;
import java.util.UUID;

public class CounterDeviceDTO {


    private UUID id;

    private BigDecimal value;

    private BigDecimal rolloverValue;

    private BigDecimal creditSale;

    private Boolean manualCounter;

    private BigDecimal manualMultiplier;

    private Boolean decimalsManualCounter;

    private DeviceDTO device;

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
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((rolloverValue == null) ? 0 : rolloverValue.hashCode());
        result = prime * result + ((creditSale == null) ? 0 : creditSale.hashCode());
        result = prime * result + ((manualCounter == null) ? 0 : manualCounter.hashCode());
        result = prime * result + ((manualMultiplier == null) ? 0 : manualMultiplier.hashCode());
        result = prime * result + ((decimalsManualCounter == null) ? 0 : decimalsManualCounter.hashCode());
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
        CounterDeviceDTO other = (CounterDeviceDTO) obj;
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
        if (rolloverValue == null) {
            if (other.rolloverValue != null)
                return false;
        } else if (!rolloverValue.equals(other.rolloverValue))
            return false;
        if (creditSale == null) {
            if (other.creditSale != null)
                return false;
        } else if (!creditSale.equals(other.creditSale))
            return false;
        if (manualCounter == null) {
            if (other.manualCounter != null)
                return false;
        } else if (!manualCounter.equals(other.manualCounter))
            return false;
        if (manualMultiplier == null) {
            if (other.manualMultiplier != null)
                return false;
        } else if (!manualMultiplier.equals(other.manualMultiplier))
            return false;
        if (decimalsManualCounter == null) {
            if (other.decimalsManualCounter != null)
                return false;
        } else if (!decimalsManualCounter.equals(other.decimalsManualCounter))
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
        return "CounterDeviceDTO [id=" + id + ", value=" + value + ", rolloverValue=" + rolloverValue + ", creditSale="
                + creditSale + ", manualCounter=" + manualCounter + ", manualMultiplier=" + manualMultiplier
                + ", decimalsManualCounter=" + decimalsManualCounter + ", device=" + device + "]";
    }

}

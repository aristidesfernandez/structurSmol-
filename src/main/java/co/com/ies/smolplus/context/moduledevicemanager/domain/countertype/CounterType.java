package co.com.ies.smolplus.context.moduledevicemanager.domain.countertype;

import java.io.Serializable;
import java.util.Objects;

public class CounterType implements Serializable {

    private String counterCode;

    private String name;

    private String description;

    private Boolean includedInFormula;

    private Boolean prize;

    private String category;

    private Integer udteWaitTime;

    public String getCounterCode() {
        return counterCode;
    }

    public void setCounterCode(String counterCode) {
        this.counterCode = counterCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIncludedInFormula() {
        return includedInFormula;
    }

    public void setIncludedInFormula(Boolean includedInFormula) {
        this.includedInFormula = includedInFormula;
    }

    public Boolean getPrize() {
        return prize;
    }

    public void setPrize(Boolean prize) {
        this.prize = prize;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getUdteWaitTime() {
        return udteWaitTime;
    }

    public void setUdteWaitTime(Integer udteWaitTime) {
        this.udteWaitTime = udteWaitTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CounterType)) {
            return false;
        }

        CounterType counterTypeDTO = (CounterType) o;
        if (this.counterCode == null) {
            return false;
        }
        return Objects.equals(this.counterCode, counterTypeDTO.counterCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.counterCode);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CounterTypeDTO{" +
            "counterCode='" + getCounterCode() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", includedInFormula='" + getIncludedInFormula() + "'" +
            ", prize='" + getPrize() + "'" +
            ", category='" + getCategory() + "'" +
            ", udteWaitTime=" + getUdteWaitTime() +
            "}";
    }
}

package co.com.ies.smolplus.dto.moduledevicemanager;


public class CounterTypeDTO {


    private String counterCode;

    private String name;

    private String description;

    private Boolean includedInFormula;

    private Boolean prize;

    private String category;

    private Integer udteWaitTime;

    private boolean isPersisted;

    private FormulaCounterTypeDTO formulaCounterTypes;

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

    public boolean isPersisted() {
        return isPersisted;
    }

    public void setPersisted(boolean isPersisted) {
        this.isPersisted = isPersisted;
    }

    public FormulaCounterTypeDTO getFormulaCounterTypes() {
        return formulaCounterTypes;
    }

    public void setFormulaCounterTypes(FormulaCounterTypeDTO formulaCounterTypes) {
        this.formulaCounterTypes = formulaCounterTypes;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((counterCode == null) ? 0 : counterCode.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((includedInFormula == null) ? 0 : includedInFormula.hashCode());
        result = prime * result + ((prize == null) ? 0 : prize.hashCode());
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + ((udteWaitTime == null) ? 0 : udteWaitTime.hashCode());
        result = prime * result + (isPersisted ? 1231 : 1237);
        result = prime * result + ((formulaCounterTypes == null) ? 0 : formulaCounterTypes.hashCode());
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
        CounterTypeDTO other = (CounterTypeDTO) obj;
        if (counterCode == null) {
            if (other.counterCode != null)
                return false;
        } else if (!counterCode.equals(other.counterCode))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (includedInFormula == null) {
            if (other.includedInFormula != null)
                return false;
        } else if (!includedInFormula.equals(other.includedInFormula))
            return false;
        if (prize == null) {
            if (other.prize != null)
                return false;
        } else if (!prize.equals(other.prize))
            return false;
        if (category == null) {
            if (other.category != null)
                return false;
        } else if (!category.equals(other.category))
            return false;
        if (udteWaitTime == null) {
            if (other.udteWaitTime != null)
                return false;
        } else if (!udteWaitTime.equals(other.udteWaitTime))
            return false;
        if (isPersisted != other.isPersisted)
            return false;
        if (formulaCounterTypes == null) {
            if (other.formulaCounterTypes != null)
                return false;
        } else if (!formulaCounterTypes.equals(other.formulaCounterTypes))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CounterTypeDTO [counterCode=" + counterCode + ", name=" + name + ", description=" + description
                + ", includedInFormula=" + includedInFormula + ", prize=" + prize + ", category=" + category
                + ", udteWaitTime=" + udteWaitTime + ", isPersisted=" + isPersisted + ", formulaCounterTypes="
                + formulaCounterTypes + "]";
    }

    
}

package co.com.ies.smolplus.dto.moduledevicemanager;


public class FormulaCounterTypeDTO {


    private Long id;

    private FormulaDTO formula;

    private CounterTypeDTO counterType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FormulaDTO getFormula() {
        return formula;
    }

    public void setFormula(FormulaDTO formula) {
        this.formula = formula;
    }

    public CounterTypeDTO getCounterType() {
        return counterType;
    }

    public void setCounterType(CounterTypeDTO counterType) {
        this.counterType = counterType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((formula == null) ? 0 : formula.hashCode());
        result = prime * result + ((counterType == null) ? 0 : counterType.hashCode());
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
        FormulaCounterTypeDTO other = (FormulaCounterTypeDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (formula == null) {
            if (other.formula != null)
                return false;
        } else if (!formula.equals(other.formula))
            return false;
        if (counterType == null) {
            if (other.counterType != null)
                return false;
        } else if (!counterType.equals(other.counterType))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "FormulaCounterTypeDTO [id=" + id + ", formula=" + formula + ", counterType=" + counterType + "]";
    }

}

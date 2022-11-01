package co.com.ies.smolplus.context.moduledevicemanager.domain.formulacountertype;

import java.io.Serializable;
import java.util.Objects;

import co.com.ies.smolplus.context.moduledevicemanager.domain.countertype.CounterType;
import co.com.ies.smolplus.context.moduledevicemanager.domain.formula.Formula;


public class FormulaCounterType implements Serializable {

    private Long id;

    private Formula formula;

    private CounterType counterType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Formula getFormula() {
        return formula;
    }

    public void setFormula(Formula formula) {
        this.formula = formula;
    }

    public CounterType getCounterType() {
        return counterType;
    }

    public void setCounterType(CounterType counterType) {
        this.counterType = counterType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FormulaCounterType)) {
            return false;
        }

        FormulaCounterType formulaCounterTypeDTO = (FormulaCounterType) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, formulaCounterTypeDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "FormulaCounterTypeDTO{" +
            "id=" + getId() +
            ", formula=" + getFormula() +
            ", counterType=" + getCounterType() +
            "}";
    }
}

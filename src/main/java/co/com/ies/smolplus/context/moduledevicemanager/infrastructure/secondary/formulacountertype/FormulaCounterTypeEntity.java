package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.formulacountertype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.countertype.CounterTypeEntity;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.formula.FormulaEntity;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A FormulaCounterType.
 */
@Entity
@Table(name = "formula_counter_type")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class FormulaCounterTypeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @ManyToOne
    private FormulaEntity formula;

    @ManyToOne
    @JsonIgnoreProperties(value = { "formulaCounterTypes" }, allowSetters = true)
    private CounterTypeEntity counterType;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public FormulaCounterTypeEntity id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FormulaEntity getFormula() {
        return this.formula;
    }

    public void setFormula(FormulaEntity formula) {
        this.formula = formula;
    }

    public FormulaCounterTypeEntity formula(FormulaEntity formula) {
        this.setFormula(formula);
        return this;
    }

    public CounterTypeEntity getCounterType() {
        return this.counterType;
    }

    public void setCounterType(CounterTypeEntity counterType) {
        this.counterType = counterType;
    }

    public FormulaCounterTypeEntity counterType(CounterTypeEntity counterType) {
        this.setCounterType(counterType);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FormulaCounterTypeEntity)) {
            return false;
        }
        return id != null && id.equals(((FormulaCounterTypeEntity) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "FormulaCounterType{" +
            "id=" + getId() +
            "}";
    }
}

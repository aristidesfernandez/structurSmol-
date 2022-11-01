package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.countertype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.formulacountertype.FormulaCounterTypeEntity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.domain.Persistable;

/**
 * A CounterType.
 */
@JsonIgnoreProperties(value = { "new" })
@Entity
@Table(name = "counter_type")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class CounterTypeEntity implements Serializable, Persistable<String> {

    private static final long serialVersionUID = 1L;

    @Size(max = 2)
    @Id
    @Column(name = "counter_code", length = 2)
    private String counterCode;

    @Size(max = 50)
    @Column(name = "name", length = 50)
    private String name;

    @Size(max = 100)
    @Column(name = "description", length = 100)
    private String description;

    @Column(name = "included_in_formula")
    private Boolean includedInFormula;

    @Column(name = "prize")
    private Boolean prize;

    @Size(max = 100)
    @Column(name = "category", length = 100)
    private String category;

    @Column(name = "udte_wait_time")
    private Integer udteWaitTime;

    @Transient
    private boolean isPersisted;

    @OneToMany(mappedBy = "counterType")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "formula", "counterType" }, allowSetters = true)
    private Set<FormulaCounterTypeEntity> formulaCounterTypes = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public String getCounterCode() {
        return this.counterCode;
    }

    public CounterTypeEntity counterCode(String counterCode) {
        this.setCounterCode(counterCode);
        return this;
    }

    public void setCounterCode(String counterCode) {
        this.counterCode = counterCode;
    }

    public String getName() {
        return this.name;
    }

    public CounterTypeEntity name(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public CounterTypeEntity description(String description) {
        this.setDescription(description);
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIncludedInFormula() {
        return this.includedInFormula;
    }

    public CounterTypeEntity includedInFormula(Boolean includedInFormula) {
        this.setIncludedInFormula(includedInFormula);
        return this;
    }

    public void setIncludedInFormula(Boolean includedInFormula) {
        this.includedInFormula = includedInFormula;
    }

    public Boolean getPrize() {
        return this.prize;
    }

    public CounterTypeEntity prize(Boolean prize) {
        this.setPrize(prize);
        return this;
    }

    public void setPrize(Boolean prize) {
        this.prize = prize;
    }

    public String getCategory() {
        return this.category;
    }

    public CounterTypeEntity category(String category) {
        this.setCategory(category);
        return this;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getUdteWaitTime() {
        return this.udteWaitTime;
    }

    public CounterTypeEntity udteWaitTime(Integer udteWaitTime) {
        this.setUdteWaitTime(udteWaitTime);
        return this;
    }

    public void setUdteWaitTime(Integer udteWaitTime) {
        this.udteWaitTime = udteWaitTime;
    }

    @Override
    public String getId() {
        return this.counterCode;
    }

    @Transient
    @Override
    public boolean isNew() {
        return !this.isPersisted;
    }

    public CounterTypeEntity setIsPersisted() {
        this.isPersisted = true;
        return this;
    }

    @PostLoad
    @PostPersist
    public void updateEntityState() {
        this.setIsPersisted();
    }

    public Set<FormulaCounterTypeEntity> getFormulaCounterTypes() {
        return this.formulaCounterTypes;
    }

    public void setFormulaCounterTypes(Set<FormulaCounterTypeEntity> formulaCounterTypes) {
        if (this.formulaCounterTypes != null) {
            this.formulaCounterTypes.forEach(i -> i.setCounterType(null));
        }
        if (formulaCounterTypes != null) {
            formulaCounterTypes.forEach(i -> i.setCounterType(this));
        }
        this.formulaCounterTypes = formulaCounterTypes;
    }

    public CounterTypeEntity formulaCounterTypes(Set<FormulaCounterTypeEntity> formulaCounterTypes) {
        this.setFormulaCounterTypes(formulaCounterTypes);
        return this;
    }

    public CounterTypeEntity addFormulaCounterType(FormulaCounterTypeEntity formulaCounterType) {
        this.formulaCounterTypes.add(formulaCounterType);
        formulaCounterType.setCounterType(this);
        return this;
    }

    public CounterTypeEntity removeFormulaCounterType(FormulaCounterTypeEntity formulaCounterType) {
        this.formulaCounterTypes.remove(formulaCounterType);
        formulaCounterType.setCounterType(null);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CounterTypeEntity)) {
            return false;
        }
        return counterCode != null && counterCode.equals(((CounterTypeEntity) o).counterCode);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CounterType{" +
            "counterCode=" + getCounterCode() +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", includedInFormula='" + getIncludedInFormula() + "'" +
            ", prize='" + getPrize() + "'" +
            ", category='" + getCategory() + "'" +
            ", udteWaitTime=" + getUdteWaitTime() +
            "}";
    }
}

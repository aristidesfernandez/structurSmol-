package co.com.ies.smolplus.context.moduledevicemanager.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.validation.constraints.*;

import co.com.ies.smolplus.context.moduledevicemanager.domain.formula.Formula;
import co.com.ies.smolplus.context.moduledevicemanager.domain.manufacturer.Manufacturer;

/**
 * A DTO for the {@link co.com.ies.smol.domain.Model} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Model implements Serializable {

    private Long id;

    private String code;

    private String name;

    private Boolean subtractBonus;

    private BigDecimal collectionCeil;

    private BigDecimal rolloverLimit;

    private Manufacturer manufacturer;

    private Formula formula;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSubtractBonus() {
        return subtractBonus;
    }

    public void setSubtractBonus(Boolean subtractBonus) {
        this.subtractBonus = subtractBonus;
    }

    public BigDecimal getCollectionCeil() {
        return collectionCeil;
    }

    public void setCollectionCeil(BigDecimal collectionCeil) {
        this.collectionCeil = collectionCeil;
    }

    public BigDecimal getRolloverLimit() {
        return rolloverLimit;
    }

    public void setRolloverLimit(BigDecimal rolloverLimit) {
        this.rolloverLimit = rolloverLimit;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Formula getFormula() {
        return formula;
    }

    public void setFormula(Formula formula) {
        this.formula = formula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Model)) {
            return false;
        }

        Model modelDTO = (Model) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, modelDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ModelD{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", name='" + getName() + "'" +
            ", subtractBonus='" + getSubtractBonus() + "'" +
            ", collectionCeil=" + getCollectionCeil() +
            ", rolloverLimit=" + getRolloverLimit() +
            ", manufacturer=" + getManufacturer() +
            ", formula=" + getFormula() +
            "}";
    }
}

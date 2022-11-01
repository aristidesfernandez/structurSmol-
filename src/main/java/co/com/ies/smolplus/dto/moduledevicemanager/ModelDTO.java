package co.com.ies.smolplus.dto.moduledevicemanager;

import java.math.BigDecimal;

public class ModelDTO  {


    private Long id;

    private String code;

    private String name;

    private Boolean subtractBonus;

    private BigDecimal collectionCeil;

    private BigDecimal rolloverLimit;

    private ManufacturerDTO manufacturer;

    private FormulaDTO formula;

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

    public ManufacturerDTO getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ManufacturerDTO manufacturer) {
        this.manufacturer = manufacturer;
    }

    public FormulaDTO getFormula() {
        return formula;
    }

    public void setFormula(FormulaDTO formula) {
        this.formula = formula;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((subtractBonus == null) ? 0 : subtractBonus.hashCode());
        result = prime * result + ((collectionCeil == null) ? 0 : collectionCeil.hashCode());
        result = prime * result + ((rolloverLimit == null) ? 0 : rolloverLimit.hashCode());
        result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
        result = prime * result + ((formula == null) ? 0 : formula.hashCode());
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
        ModelDTO other = (ModelDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (subtractBonus == null) {
            if (other.subtractBonus != null)
                return false;
        } else if (!subtractBonus.equals(other.subtractBonus))
            return false;
        if (collectionCeil == null) {
            if (other.collectionCeil != null)
                return false;
        } else if (!collectionCeil.equals(other.collectionCeil))
            return false;
        if (rolloverLimit == null) {
            if (other.rolloverLimit != null)
                return false;
        } else if (!rolloverLimit.equals(other.rolloverLimit))
            return false;
        if (manufacturer == null) {
            if (other.manufacturer != null)
                return false;
        } else if (!manufacturer.equals(other.manufacturer))
            return false;
        if (formula == null) {
            if (other.formula != null)
                return false;
        } else if (!formula.equals(other.formula))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ModelDTO [id=" + id + ", code=" + code + ", name=" + name + ", subtractBonus=" + subtractBonus
                + ", collectionCeil=" + collectionCeil + ", rolloverLimit=" + rolloverLimit + ", manufacturer="
                + manufacturer + ", formula=" + formula + "]";
    }

    
}

package co.com.ies.smolplus.context.moduleestablishmentmanager.domain.operationalpropertiesestablishment;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.establishment.Establishment;
import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.keyoperatingproperty.KeyOperatingProperty;

public class OperationalPropertiesEstablishment {
    
    private Long id;

    private String value;

    private KeyOperatingProperty keyOperatingProperty;

    private Establishment establishment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public KeyOperatingProperty getKeyOperatingProperty() {
        return keyOperatingProperty;
    }

    public void setKeyOperatingProperty(KeyOperatingProperty keyOperatingProperty) {
        this.keyOperatingProperty = keyOperatingProperty;
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((keyOperatingProperty == null) ? 0 : keyOperatingProperty.hashCode());
        result = prime * result + ((establishment == null) ? 0 : establishment.hashCode());
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
        OperationalPropertiesEstablishment other = (OperationalPropertiesEstablishment) obj;
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
        if (keyOperatingProperty == null) {
            if (other.keyOperatingProperty != null)
                return false;
        } else if (!keyOperatingProperty.equals(other.keyOperatingProperty))
            return false;
        if (establishment == null) {
            if (other.establishment != null)
                return false;
        } else if (!establishment.equals(other.establishment))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OperationalPropertiesEstablishment [id=" + id + ", value=" + value + ", keyOperatingProperty="
                + keyOperatingProperty + ", establishment=" + establishment + "]";
    }

    
}

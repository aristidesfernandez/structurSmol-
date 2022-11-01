package co.com.ies.smolplus.context.moduledevicemanager.domain.devicecategory;

import java.io.Serializable;
import java.util.Objects;


public class DeviceCategory implements Serializable {

    private Long id;

    private String description;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeviceCategory)) {
            return false;
        }

        DeviceCategory deviceCategoryDTO = (DeviceCategory) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, deviceCategoryDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DeviceCategory{" +
            "id=" + getId() +
            ", description='" + getDescription() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }
}

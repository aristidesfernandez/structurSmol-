package co.com.ies.smolplus.dto.moduleestablishmentmanager;


public class IsleDTO {
    
    private Long id;

    private String description;

    private String name;

    private EstablishmentDTO establishment;

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

    public EstablishmentDTO getEstablishment() {
        return establishment;
    }

    public void setEstablishment(EstablishmentDTO establishment) {
        this.establishment = establishment;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        IsleDTO other = (IsleDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
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
        return "IsleDTO [id=" + id + ", description=" + description + ", name=" + name + ", establishmentDTO="
                + establishment + "]";
    }

}

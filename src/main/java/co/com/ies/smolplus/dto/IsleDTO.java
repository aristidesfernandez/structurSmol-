package co.com.ies.smolplus.dto;


public class IsleDTO {
    
    private Long id;

    private String description;

    private String name;

    private EstablishmentDTO establishmentDTO;

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

    public EstablishmentDTO getEstablishmentDTO() {
        return establishmentDTO;
    }

    public void setEstablishmentDTO(EstablishmentDTO establishmentDTO) {
        this.establishmentDTO = establishmentDTO;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((establishmentDTO == null) ? 0 : establishmentDTO.hashCode());
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
        if (establishmentDTO == null) {
            if (other.establishmentDTO != null)
                return false;
        } else if (!establishmentDTO.equals(other.establishmentDTO))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "IsleDTO [id=" + id + ", description=" + description + ", name=" + name + ", establishmentDTO="
                + establishmentDTO + "]";
    }

}

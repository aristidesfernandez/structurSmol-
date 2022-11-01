package co.com.ies.smolplus.dto.moduleestablishmentmanager;


public class OperationalPropertiesEstablishmentDTO {
    
    private Long id;

    private String value;

    private KeyOperatingPropertyDTO keyOperatingPropertyDTO;

    private EstablishmentDTO establishmentDTO;

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

    public KeyOperatingPropertyDTO getKeyOperatingPropertyDTO() {
        return keyOperatingPropertyDTO;
    }

    public void setKeyOperatingPropertyDTO(KeyOperatingPropertyDTO keyOperatingPropertyDTO) {
        this.keyOperatingPropertyDTO = keyOperatingPropertyDTO;
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
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((keyOperatingPropertyDTO == null) ? 0 : keyOperatingPropertyDTO.hashCode());
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
        OperationalPropertiesEstablishmentDTO other = (OperationalPropertiesEstablishmentDTO) obj;
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
        if (keyOperatingPropertyDTO == null) {
            if (other.keyOperatingPropertyDTO != null)
                return false;
        } else if (!keyOperatingPropertyDTO.equals(other.keyOperatingPropertyDTO))
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
        return "OperationalPropertiesEstablishmentDTO [id=" + id + ", value=" + value + ", keyOperatingPropertyDTO="
                + keyOperatingPropertyDTO + ", establishmentDTO=" + establishmentDTO + "]";
    }

    
}

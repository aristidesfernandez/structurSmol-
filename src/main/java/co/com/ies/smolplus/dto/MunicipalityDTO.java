package co.com.ies.smolplus.dto;


public class MunicipalityDTO {
    
    private Long id;

    private String code;

    private String name;

    private String daneCode;

    private ProvinceDTO provinceDTO;

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

    public String getDaneCode() {
        return daneCode;
    }

    public void setDaneCode(String daneCode) {
        this.daneCode = daneCode;
    }

    public ProvinceDTO getProvinceDTO() {
        return provinceDTO;
    }

    public void setProvinceDTO(ProvinceDTO provinceDTO) {
        this.provinceDTO = provinceDTO;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((daneCode == null) ? 0 : daneCode.hashCode());
        result = prime * result + ((provinceDTO == null) ? 0 : provinceDTO.hashCode());
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
        MunicipalityDTO other = (MunicipalityDTO) obj;
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
        if (daneCode == null) {
            if (other.daneCode != null)
                return false;
        } else if (!daneCode.equals(other.daneCode))
            return false;
        if (provinceDTO == null) {
            if (other.provinceDTO != null)
                return false;
        } else if (!provinceDTO.equals(other.provinceDTO))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "MunicipalityDTO [id=" + id + ", code=" + code + ", name=" + name + ", daneCode=" + daneCode
                + ", provinceDTO=" + provinceDTO + "]";
    }

    
}
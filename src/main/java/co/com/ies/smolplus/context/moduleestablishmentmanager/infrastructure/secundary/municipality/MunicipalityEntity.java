package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.municipality;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.province.ProvinceEntity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Municipality.
 */
@Entity
@Table(name = "municipality")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class MunicipalityEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Size(max = 25)
    @Column(name = "code", length = 25)
    private String code;

    @Size(max = 50)
    @Column(name = "name", length = 50)
    private String name;

    @NotNull
    @Size(max = 25)
    @Column(name = "dane_code", length = 25, nullable = false)
    private String daneCode;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "country" }, allowSetters = true)
    private ProvinceEntity provinceEntity;

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

    public ProvinceEntity getProvinceEntity() {
        return provinceEntity;
    }

    public void setProvinceEntity(ProvinceEntity provinceEntity) {
        this.provinceEntity = provinceEntity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((daneCode == null) ? 0 : daneCode.hashCode());
        result = prime * result + ((provinceEntity == null) ? 0 : provinceEntity.hashCode());
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
        MunicipalityEntity other = (MunicipalityEntity) obj;
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
        if (provinceEntity == null) {
            if (other.provinceEntity != null)
                return false;
        } else if (!provinceEntity.equals(other.provinceEntity))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "MunicipalityEntity [id=" + id + ", code=" + code + ", name=" + name + ", daneCode=" + daneCode
                + ", provinceEntity=" + provinceEntity + "]";
    }

    
}

package co.com.ies.smolplus.dto.moduleestablishmentmanager;

import java.time.ZonedDateTime;


public class OperatorDTO {
    
    private Long id;

    private String permitDescription;

    private ZonedDateTime startDate;

    private ZonedDateTime endDate;

    private String nit;

    private String contractNumber;

    private String companyName;

    private String brand;

    private MunicipalityDTO municipality;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermitDescription() {
        return permitDescription;
    }

    public void setPermitDescription(String permitDescription) {
        this.permitDescription = permitDescription;
    }

    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }

    public ZonedDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(ZonedDateTime endDate) {
        this.endDate = endDate;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public MunicipalityDTO getMunicipality() {
        return municipality;
    }

    public void setMunicipality(MunicipalityDTO municipality) {
        this.municipality = municipality;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((permitDescription == null) ? 0 : permitDescription.hashCode());
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
        result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
        result = prime * result + ((nit == null) ? 0 : nit.hashCode());
        result = prime * result + ((contractNumber == null) ? 0 : contractNumber.hashCode());
        result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((municipality == null) ? 0 : municipality.hashCode());
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
        OperatorDTO other = (OperatorDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (permitDescription == null) {
            if (other.permitDescription != null)
                return false;
        } else if (!permitDescription.equals(other.permitDescription))
            return false;
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        } else if (!startDate.equals(other.startDate))
            return false;
        if (endDate == null) {
            if (other.endDate != null)
                return false;
        } else if (!endDate.equals(other.endDate))
            return false;
        if (nit == null) {
            if (other.nit != null)
                return false;
        } else if (!nit.equals(other.nit))
            return false;
        if (contractNumber == null) {
            if (other.contractNumber != null)
                return false;
        } else if (!contractNumber.equals(other.contractNumber))
            return false;
        if (companyName == null) {
            if (other.companyName != null)
                return false;
        } else if (!companyName.equals(other.companyName))
            return false;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (municipality == null) {
            if (other.municipality != null)
                return false;
        } else if (!municipality.equals(other.municipality))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "OperatorDTO [id=" + id + ", permitDescription=" + permitDescription + ", startDate=" + startDate
                + ", endDate=" + endDate + ", nit=" + nit + ", contractNumber=" + contractNumber + ", companyName="
                + companyName + ", brand=" + brand + ", municipality=" + municipality + "]";
    }

    
}

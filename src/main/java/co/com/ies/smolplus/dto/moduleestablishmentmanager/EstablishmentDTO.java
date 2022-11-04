package co.com.ies.smolplus.dto.moduleestablishmentmanager;

import java.time.ZonedDateTime;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.establishment.EstablishmentType;



public class EstablishmentDTO {
    
    private Long id;

    private ZonedDateTime liquidationTime;

    private String name;

    private EstablishmentType type;

    private String neighborhood;

    private String address;

    private String coljuegosCode;

    private ZonedDateTime startTime;

    private ZonedDateTime closeTime;

    private Float longitude;

    private Float latitude;

    private String timeZone;

    private String mercantileRegistration;

    private OperatorDTO operator;

    private MunicipalityDTO municipality;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getLiquidationTime() {
        return liquidationTime;
    }

    public void setLiquidationTime(ZonedDateTime liquidationTime) {
        this.liquidationTime = liquidationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EstablishmentType getType() {
        return type;
    }

    public void setType(EstablishmentType type) {
        this.type = type;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColjuegosCode() {
        return coljuegosCode;
    }

    public void setColjuegosCode(String coljuegosCode) {
        this.coljuegosCode = coljuegosCode;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(ZonedDateTime startTime) {
        this.startTime = startTime;
    }

    public ZonedDateTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(ZonedDateTime closeTime) {
        this.closeTime = closeTime;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public String getMercantileRegistration() {
        return mercantileRegistration;
    }

    public void setMercantileRegistration(String mercantileRegistration) {
        this.mercantileRegistration = mercantileRegistration;
    }

    public OperatorDTO getOperator() {
        return operator;
    }

    public void setOperator(OperatorDTO operator) {
        this.operator = operator;
    }

    public MunicipalityDTO getMunicipality() {
        return municipality;
    }

    public void setMunicipality(MunicipalityDTO municipality) {
        this.municipality = municipality;
    }

    @Override
    public String toString() {
        return "EstablishmentDTO [id=" + id + ", liquidationTime=" + liquidationTime + ", name=" + name + ", type="
                + type + ", neighborhood=" + neighborhood + ", address=" + address + ", coljuegosCode=" + coljuegosCode
                + ", startTime=" + startTime + ", closeTime=" + closeTime + ", longitude=" + longitude + ", latitude="
                + latitude + ", mercantileRegistration=" + mercantileRegistration + ", operatorDTO=" + operator
                + ", municipalityDTO=" + municipality + "]";
    }

}

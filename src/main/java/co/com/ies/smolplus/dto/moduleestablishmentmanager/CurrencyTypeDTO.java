package co.com.ies.smolplus.dto.moduleestablishmentmanager;


public class CurrencyTypeDTO {
    
    private Long id;

    private String name;

    private String code;

    private String symbol;

    private Boolean isPriority;

    private String location;

    private Float exchangeRate;

    private Integer decimalPlaces;

    private String decimalSeparator;

    private String thousandSeparator;

    private String description;

    private EstablishmentDTO establishment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Boolean getIsPriority() {
        return isPriority;
    }

    public void setIsPriority(Boolean isPriority) {
        this.isPriority = isPriority;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Integer getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(Integer decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public String getDecimalSeparator() {
        return decimalSeparator;
    }

    public void setDecimalSeparator(String decimalSeparator) {
        this.decimalSeparator = decimalSeparator;
    }

    public String getThousandSeparator() {
        return thousandSeparator;
    }

    public void setThousandSeparator(String thousandSeparator) {
        this.thousandSeparator = thousandSeparator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EstablishmentDTO getEstablishmen() {
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
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
        result = prime * result + ((isPriority == null) ? 0 : isPriority.hashCode());
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + ((exchangeRate == null) ? 0 : exchangeRate.hashCode());
        result = prime * result + ((decimalPlaces == null) ? 0 : decimalPlaces.hashCode());
        result = prime * result + ((decimalSeparator == null) ? 0 : decimalSeparator.hashCode());
        result = prime * result + ((thousandSeparator == null) ? 0 : thousandSeparator.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
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
        CurrencyTypeDTO other = (CurrencyTypeDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (symbol == null) {
            if (other.symbol != null)
                return false;
        } else if (!symbol.equals(other.symbol))
            return false;
        if (isPriority == null) {
            if (other.isPriority != null)
                return false;
        } else if (!isPriority.equals(other.isPriority))
            return false;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
            return false;
        if (exchangeRate == null) {
            if (other.exchangeRate != null)
                return false;
        } else if (!exchangeRate.equals(other.exchangeRate))
            return false;
        if (decimalPlaces == null) {
            if (other.decimalPlaces != null)
                return false;
        } else if (!decimalPlaces.equals(other.decimalPlaces))
            return false;
        if (decimalSeparator == null) {
            if (other.decimalSeparator != null)
                return false;
        } else if (!decimalSeparator.equals(other.decimalSeparator))
            return false;
        if (thousandSeparator == null) {
            if (other.thousandSeparator != null)
                return false;
        } else if (!thousandSeparator.equals(other.thousandSeparator))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
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
        return "CurrencyTypeDTO [id=" + id + ", name=" + name + ", code=" + code + ", symbol=" + symbol
                + ", isPriority=" + isPriority + ", location=" + location + ", exchangeRate=" + exchangeRate
                + ", decimalPlaces=" + decimalPlaces + ", decimalSeparator=" + decimalSeparator + ", thousandSeparator="
                + thousandSeparator + ", description=" + description + ", establishment=" + establishment + "]";
    }

    
}

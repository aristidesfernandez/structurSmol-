package co.com.ies.smolplus.dto.moduledevicemanager;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.UUID;


public class DeviceDTO {

   
    private UUID id;

    private String serial;

    private Boolean isProtocolEsdcs;

    private Integer numberPlayedReport;

    private BigDecimal sasDenomination;

    private Boolean isMultigame;

    private Boolean isMultiDenomination;

    private Boolean isRetanqueo;

    private String state;

    private BigDecimal theoreticalHold;

    private Integer sasIdentifier;

    private Long creditLimit;

    private Boolean hasHooper;

    private String coljuegosCode;

    private LocalDate fabricationDate;

    private BigDecimal currentToken;

    private BigDecimal denominationTito;

    private ZonedDateTime endLostCommunication;

    private ZonedDateTime startLostCommunication;

    private BigDecimal reportMultiplier;

    private String nuid;

    private Boolean payManualPrize;

    private Boolean manualHandpay;

    private Boolean manualJackpot;

    private Boolean manualGameEvent;

    private String betCode;

    private Boolean homologationIndicator;

    private String coljuegosModel;

    private Boolean reportable;

    private BigDecimal aftDenomination;

    private ZonedDateTime lastUpdateDate;

    private Boolean enableRollover;

    private ZonedDateTime lastCorruptionDate;

    private BigDecimal daftDenomination;

    private Boolean prizesEnabled;

    private Integer currencyTypeId;

    private Integer isleId;

    private ModelDTO model;

    private DeviceCategoryDTO deviceCategory;

    private DeviceTypeDTO deviceType;

    private FormulaDTO formulaHandpay;

    private FormulaDTO formulaJackpot;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Boolean getIsProtocolEsdcs() {
        return isProtocolEsdcs;
    }

    public void setIsProtocolEsdcs(Boolean isProtocolEsdcs) {
        this.isProtocolEsdcs = isProtocolEsdcs;
    }

    public Integer getNumberPlayedReport() {
        return numberPlayedReport;
    }

    public void setNumberPlayedReport(Integer numberPlayedReport) {
        this.numberPlayedReport = numberPlayedReport;
    }

    public BigDecimal getSasDenomination() {
        return sasDenomination;
    }

    public void setSasDenomination(BigDecimal sasDenomination) {
        this.sasDenomination = sasDenomination;
    }

    public Boolean getIsMultigame() {
        return isMultigame;
    }

    public void setIsMultigame(Boolean isMultigame) {
        this.isMultigame = isMultigame;
    }

    public Boolean getIsMultiDenomination() {
        return isMultiDenomination;
    }

    public void setIsMultiDenomination(Boolean isMultiDenomination) {
        this.isMultiDenomination = isMultiDenomination;
    }

    public Boolean getIsRetanqueo() {
        return isRetanqueo;
    }

    public void setIsRetanqueo(Boolean isRetanqueo) {
        this.isRetanqueo = isRetanqueo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal getTheoreticalHold() {
        return theoreticalHold;
    }

    public void setTheoreticalHold(BigDecimal theoreticalHold) {
        this.theoreticalHold = theoreticalHold;
    }

    public Integer getSasIdentifier() {
        return sasIdentifier;
    }

    public void setSasIdentifier(Integer sasIdentifier) {
        this.sasIdentifier = sasIdentifier;
    }

    public Long getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Long creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Boolean getHasHooper() {
        return hasHooper;
    }

    public void setHasHooper(Boolean hasHooper) {
        this.hasHooper = hasHooper;
    }

    public String getColjuegosCode() {
        return coljuegosCode;
    }

    public void setColjuegosCode(String coljuegosCode) {
        this.coljuegosCode = coljuegosCode;
    }

    public LocalDate getFabricationDate() {
        return fabricationDate;
    }

    public void setFabricationDate(LocalDate fabricationDate) {
        this.fabricationDate = fabricationDate;
    }

    public BigDecimal getCurrentToken() {
        return currentToken;
    }

    public void setCurrentToken(BigDecimal currentToken) {
        this.currentToken = currentToken;
    }

    public BigDecimal getDenominationTito() {
        return denominationTito;
    }

    public void setDenominationTito(BigDecimal denominationTito) {
        this.denominationTito = denominationTito;
    }

    public ZonedDateTime getEndLostCommunication() {
        return endLostCommunication;
    }

    public void setEndLostCommunication(ZonedDateTime endLostCommunication) {
        this.endLostCommunication = endLostCommunication;
    }

    public ZonedDateTime getStartLostCommunication() {
        return startLostCommunication;
    }

    public void setStartLostCommunication(ZonedDateTime startLostCommunication) {
        this.startLostCommunication = startLostCommunication;
    }

    public BigDecimal getReportMultiplier() {
        return reportMultiplier;
    }

    public void setReportMultiplier(BigDecimal reportMultiplier) {
        this.reportMultiplier = reportMultiplier;
    }

    public String getNuid() {
        return nuid;
    }

    public void setNuid(String nuid) {
        this.nuid = nuid;
    }

    public Boolean getPayManualPrize() {
        return payManualPrize;
    }

    public void setPayManualPrize(Boolean payManualPrize) {
        this.payManualPrize = payManualPrize;
    }

    public Boolean getManualHandpay() {
        return manualHandpay;
    }

    public void setManualHandpay(Boolean manualHandpay) {
        this.manualHandpay = manualHandpay;
    }

    public Boolean getManualJackpot() {
        return manualJackpot;
    }

    public void setManualJackpot(Boolean manualJackpot) {
        this.manualJackpot = manualJackpot;
    }

    public Boolean getManualGameEvent() {
        return manualGameEvent;
    }

    public void setManualGameEvent(Boolean manualGameEvent) {
        this.manualGameEvent = manualGameEvent;
    }

    public String getBetCode() {
        return betCode;
    }

    public void setBetCode(String betCode) {
        this.betCode = betCode;
    }

    public Boolean getHomologationIndicator() {
        return homologationIndicator;
    }

    public void setHomologationIndicator(Boolean homologationIndicator) {
        this.homologationIndicator = homologationIndicator;
    }

    public String getColjuegosModel() {
        return coljuegosModel;
    }

    public void setColjuegosModel(String coljuegosModel) {
        this.coljuegosModel = coljuegosModel;
    }

    public Boolean getReportable() {
        return reportable;
    }

    public void setReportable(Boolean reportable) {
        this.reportable = reportable;
    }

    public BigDecimal getAftDenomination() {
        return aftDenomination;
    }

    public void setAftDenomination(BigDecimal aftDenomination) {
        this.aftDenomination = aftDenomination;
    }

    public ZonedDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(ZonedDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Boolean getEnableRollover() {
        return enableRollover;
    }

    public void setEnableRollover(Boolean enableRollover) {
        this.enableRollover = enableRollover;
    }

    public ZonedDateTime getLastCorruptionDate() {
        return lastCorruptionDate;
    }

    public void setLastCorruptionDate(ZonedDateTime lastCorruptionDate) {
        this.lastCorruptionDate = lastCorruptionDate;
    }

    public BigDecimal getDaftDenomination() {
        return daftDenomination;
    }

    public void setDaftDenomination(BigDecimal daftDenomination) {
        this.daftDenomination = daftDenomination;
    }

    public Boolean getPrizesEnabled() {
        return prizesEnabled;
    }

    public void setPrizesEnabled(Boolean prizesEnabled) {
        this.prizesEnabled = prizesEnabled;
    }

    public Integer getCurrencyTypeId() {
        return currencyTypeId;
    }

    public void setCurrencyTypeId(Integer currencyTypeId) {
        this.currencyTypeId = currencyTypeId;
    }

    public Integer getIsleId() {
        return isleId;
    }

    public void setIsleId(Integer isleId) {
        this.isleId = isleId;
    }

    public ModelDTO getModel() {
        return model;
    }

    public void setModel(ModelDTO model) {
        this.model = model;
    }

    public DeviceCategoryDTO getDeviceCategory() {
        return deviceCategory;
    }

    public void setDeviceCategory(DeviceCategoryDTO deviceCategory) {
        this.deviceCategory = deviceCategory;
    }

    public DeviceTypeDTO getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(DeviceTypeDTO deviceType) {
        this.deviceType = deviceType;
    }

    public FormulaDTO getFormulaHandpay() {
        return formulaHandpay;
    }

    public void setFormulaHandpay(FormulaDTO formulaHandpay) {
        this.formulaHandpay = formulaHandpay;
    }

    public FormulaDTO getFormulaJackpot() {
        return formulaJackpot;
    }

    public void setFormulaJackpot(FormulaDTO formulaJackpot) {
        this.formulaJackpot = formulaJackpot;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((serial == null) ? 0 : serial.hashCode());
        result = prime * result + ((isProtocolEsdcs == null) ? 0 : isProtocolEsdcs.hashCode());
        result = prime * result + ((numberPlayedReport == null) ? 0 : numberPlayedReport.hashCode());
        result = prime * result + ((sasDenomination == null) ? 0 : sasDenomination.hashCode());
        result = prime * result + ((isMultigame == null) ? 0 : isMultigame.hashCode());
        result = prime * result + ((isMultiDenomination == null) ? 0 : isMultiDenomination.hashCode());
        result = prime * result + ((isRetanqueo == null) ? 0 : isRetanqueo.hashCode());
        result = prime * result + ((state == null) ? 0 : state.hashCode());
        result = prime * result + ((theoreticalHold == null) ? 0 : theoreticalHold.hashCode());
        result = prime * result + ((sasIdentifier == null) ? 0 : sasIdentifier.hashCode());
        result = prime * result + ((creditLimit == null) ? 0 : creditLimit.hashCode());
        result = prime * result + ((hasHooper == null) ? 0 : hasHooper.hashCode());
        result = prime * result + ((coljuegosCode == null) ? 0 : coljuegosCode.hashCode());
        result = prime * result + ((fabricationDate == null) ? 0 : fabricationDate.hashCode());
        result = prime * result + ((currentToken == null) ? 0 : currentToken.hashCode());
        result = prime * result + ((denominationTito == null) ? 0 : denominationTito.hashCode());
        result = prime * result + ((endLostCommunication == null) ? 0 : endLostCommunication.hashCode());
        result = prime * result + ((startLostCommunication == null) ? 0 : startLostCommunication.hashCode());
        result = prime * result + ((reportMultiplier == null) ? 0 : reportMultiplier.hashCode());
        result = prime * result + ((nuid == null) ? 0 : nuid.hashCode());
        result = prime * result + ((payManualPrize == null) ? 0 : payManualPrize.hashCode());
        result = prime * result + ((manualHandpay == null) ? 0 : manualHandpay.hashCode());
        result = prime * result + ((manualJackpot == null) ? 0 : manualJackpot.hashCode());
        result = prime * result + ((manualGameEvent == null) ? 0 : manualGameEvent.hashCode());
        result = prime * result + ((betCode == null) ? 0 : betCode.hashCode());
        result = prime * result + ((homologationIndicator == null) ? 0 : homologationIndicator.hashCode());
        result = prime * result + ((coljuegosModel == null) ? 0 : coljuegosModel.hashCode());
        result = prime * result + ((reportable == null) ? 0 : reportable.hashCode());
        result = prime * result + ((aftDenomination == null) ? 0 : aftDenomination.hashCode());
        result = prime * result + ((lastUpdateDate == null) ? 0 : lastUpdateDate.hashCode());
        result = prime * result + ((enableRollover == null) ? 0 : enableRollover.hashCode());
        result = prime * result + ((lastCorruptionDate == null) ? 0 : lastCorruptionDate.hashCode());
        result = prime * result + ((daftDenomination == null) ? 0 : daftDenomination.hashCode());
        result = prime * result + ((prizesEnabled == null) ? 0 : prizesEnabled.hashCode());
        result = prime * result + ((currencyTypeId == null) ? 0 : currencyTypeId.hashCode());
        result = prime * result + ((isleId == null) ? 0 : isleId.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ((deviceCategory == null) ? 0 : deviceCategory.hashCode());
        result = prime * result + ((deviceType == null) ? 0 : deviceType.hashCode());
        result = prime * result + ((formulaHandpay == null) ? 0 : formulaHandpay.hashCode());
        result = prime * result + ((formulaJackpot == null) ? 0 : formulaJackpot.hashCode());
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
        DeviceDTO other = (DeviceDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (serial == null) {
            if (other.serial != null)
                return false;
        } else if (!serial.equals(other.serial))
            return false;
        if (isProtocolEsdcs == null) {
            if (other.isProtocolEsdcs != null)
                return false;
        } else if (!isProtocolEsdcs.equals(other.isProtocolEsdcs))
            return false;
        if (numberPlayedReport == null) {
            if (other.numberPlayedReport != null)
                return false;
        } else if (!numberPlayedReport.equals(other.numberPlayedReport))
            return false;
        if (sasDenomination == null) {
            if (other.sasDenomination != null)
                return false;
        } else if (!sasDenomination.equals(other.sasDenomination))
            return false;
        if (isMultigame == null) {
            if (other.isMultigame != null)
                return false;
        } else if (!isMultigame.equals(other.isMultigame))
            return false;
        if (isMultiDenomination == null) {
            if (other.isMultiDenomination != null)
                return false;
        } else if (!isMultiDenomination.equals(other.isMultiDenomination))
            return false;
        if (isRetanqueo == null) {
            if (other.isRetanqueo != null)
                return false;
        } else if (!isRetanqueo.equals(other.isRetanqueo))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        } else if (!state.equals(other.state))
            return false;
        if (theoreticalHold == null) {
            if (other.theoreticalHold != null)
                return false;
        } else if (!theoreticalHold.equals(other.theoreticalHold))
            return false;
        if (sasIdentifier == null) {
            if (other.sasIdentifier != null)
                return false;
        } else if (!sasIdentifier.equals(other.sasIdentifier))
            return false;
        if (creditLimit == null) {
            if (other.creditLimit != null)
                return false;
        } else if (!creditLimit.equals(other.creditLimit))
            return false;
        if (hasHooper == null) {
            if (other.hasHooper != null)
                return false;
        } else if (!hasHooper.equals(other.hasHooper))
            return false;
        if (coljuegosCode == null) {
            if (other.coljuegosCode != null)
                return false;
        } else if (!coljuegosCode.equals(other.coljuegosCode))
            return false;
        if (fabricationDate == null) {
            if (other.fabricationDate != null)
                return false;
        } else if (!fabricationDate.equals(other.fabricationDate))
            return false;
        if (currentToken == null) {
            if (other.currentToken != null)
                return false;
        } else if (!currentToken.equals(other.currentToken))
            return false;
        if (denominationTito == null) {
            if (other.denominationTito != null)
                return false;
        } else if (!denominationTito.equals(other.denominationTito))
            return false;
        if (endLostCommunication == null) {
            if (other.endLostCommunication != null)
                return false;
        } else if (!endLostCommunication.equals(other.endLostCommunication))
            return false;
        if (startLostCommunication == null) {
            if (other.startLostCommunication != null)
                return false;
        } else if (!startLostCommunication.equals(other.startLostCommunication))
            return false;
        if (reportMultiplier == null) {
            if (other.reportMultiplier != null)
                return false;
        } else if (!reportMultiplier.equals(other.reportMultiplier))
            return false;
        if (nuid == null) {
            if (other.nuid != null)
                return false;
        } else if (!nuid.equals(other.nuid))
            return false;
        if (payManualPrize == null) {
            if (other.payManualPrize != null)
                return false;
        } else if (!payManualPrize.equals(other.payManualPrize))
            return false;
        if (manualHandpay == null) {
            if (other.manualHandpay != null)
                return false;
        } else if (!manualHandpay.equals(other.manualHandpay))
            return false;
        if (manualJackpot == null) {
            if (other.manualJackpot != null)
                return false;
        } else if (!manualJackpot.equals(other.manualJackpot))
            return false;
        if (manualGameEvent == null) {
            if (other.manualGameEvent != null)
                return false;
        } else if (!manualGameEvent.equals(other.manualGameEvent))
            return false;
        if (betCode == null) {
            if (other.betCode != null)
                return false;
        } else if (!betCode.equals(other.betCode))
            return false;
        if (homologationIndicator == null) {
            if (other.homologationIndicator != null)
                return false;
        } else if (!homologationIndicator.equals(other.homologationIndicator))
            return false;
        if (coljuegosModel == null) {
            if (other.coljuegosModel != null)
                return false;
        } else if (!coljuegosModel.equals(other.coljuegosModel))
            return false;
        if (reportable == null) {
            if (other.reportable != null)
                return false;
        } else if (!reportable.equals(other.reportable))
            return false;
        if (aftDenomination == null) {
            if (other.aftDenomination != null)
                return false;
        } else if (!aftDenomination.equals(other.aftDenomination))
            return false;
        if (lastUpdateDate == null) {
            if (other.lastUpdateDate != null)
                return false;
        } else if (!lastUpdateDate.equals(other.lastUpdateDate))
            return false;
        if (enableRollover == null) {
            if (other.enableRollover != null)
                return false;
        } else if (!enableRollover.equals(other.enableRollover))
            return false;
        if (lastCorruptionDate == null) {
            if (other.lastCorruptionDate != null)
                return false;
        } else if (!lastCorruptionDate.equals(other.lastCorruptionDate))
            return false;
        if (daftDenomination == null) {
            if (other.daftDenomination != null)
                return false;
        } else if (!daftDenomination.equals(other.daftDenomination))
            return false;
        if (prizesEnabled == null) {
            if (other.prizesEnabled != null)
                return false;
        } else if (!prizesEnabled.equals(other.prizesEnabled))
            return false;
        if (currencyTypeId == null) {
            if (other.currencyTypeId != null)
                return false;
        } else if (!currencyTypeId.equals(other.currencyTypeId))
            return false;
        if (isleId == null) {
            if (other.isleId != null)
                return false;
        } else if (!isleId.equals(other.isleId))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (deviceCategory == null) {
            if (other.deviceCategory != null)
                return false;
        } else if (!deviceCategory.equals(other.deviceCategory))
            return false;
        if (deviceType == null) {
            if (other.deviceType != null)
                return false;
        } else if (!deviceType.equals(other.deviceType))
            return false;
        if (formulaHandpay == null) {
            if (other.formulaHandpay != null)
                return false;
        } else if (!formulaHandpay.equals(other.formulaHandpay))
            return false;
        if (formulaJackpot == null) {
            if (other.formulaJackpot != null)
                return false;
        } else if (!formulaJackpot.equals(other.formulaJackpot))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "DeviceDTO [id=" + id + ", serial=" + serial + ", isProtocolEsdcs=" + isProtocolEsdcs
                + ", numberPlayedReport=" + numberPlayedReport + ", sasDenomination=" + sasDenomination
                + ", isMultigame=" + isMultigame + ", isMultiDenomination=" + isMultiDenomination + ", isRetanqueo="
                + isRetanqueo + ", state=" + state + ", theoreticalHold=" + theoreticalHold + ", sasIdentifier="
                + sasIdentifier + ", creditLimit=" + creditLimit + ", hasHooper=" + hasHooper + ", coljuegosCode="
                + coljuegosCode + ", fabricationDate=" + fabricationDate + ", currentToken=" + currentToken
                + ", denominationTito=" + denominationTito + ", endLostCommunication=" + endLostCommunication
                + ", startLostCommunication=" + startLostCommunication + ", reportMultiplier=" + reportMultiplier
                + ", nuid=" + nuid + ", payManualPrize=" + payManualPrize + ", manualHandpay=" + manualHandpay
                + ", manualJackpot=" + manualJackpot + ", manualGameEvent=" + manualGameEvent + ", betCode=" + betCode
                + ", homologationIndicator=" + homologationIndicator + ", coljuegosModel=" + coljuegosModel
                + ", reportable=" + reportable + ", aftDenomination=" + aftDenomination + ", lastUpdateDate="
                + lastUpdateDate + ", enableRollover=" + enableRollover + ", lastCorruptionDate=" + lastCorruptionDate
                + ", daftDenomination=" + daftDenomination + ", prizesEnabled=" + prizesEnabled + ", currencyTypeId="
                + currencyTypeId + ", isleId=" + isleId + ", model=" + model + ", deviceCategory=" + deviceCategory
                + ", deviceType=" + deviceType + ", formulaHandpay=" + formulaHandpay + ", formulaJackpot="
                + formulaJackpot + "]";
    }

    
}

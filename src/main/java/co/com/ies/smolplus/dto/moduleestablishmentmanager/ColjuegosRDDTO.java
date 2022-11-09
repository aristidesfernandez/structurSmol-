package co.com.ies.smolplus.dto.moduleestablishmentmanager;

import co.com.ies.smolplus.dto.moduledevicemanager.DeviceDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;

import java.math.BigInteger;
import java.time.ZonedDateTime;

public class ColjuegosRDDTO {

  private Long nuc;

  private String nuid;

  private String serial;

  private BigInteger coinIn;

  private BigInteger coinOut;

  private BigInteger jackPot;

  private BigInteger handPaid;

  private BigInteger billIn;

  private BigInteger gamesPlayed;

  private BigInteger theoreticalPercentage;

  private String significantEvent;

  private ZonedDateTime dateSignificantEvent;

  /**
 * RD.
 * 
 * <li> Indicador registro detalle METL.</li>
 */
  public ColjuegosRDDTO(){

  }

  public ColjuegosRDDTO(EventDeviceDTO eventDevice, DeviceDTO device){
    this.nuc = Long.valueOf(device.getColjuegosCode());
    this.nuid = device.getNuid();
    this.serial = device.getSerial();
    this.theoreticalPercentage = BigInteger.valueOf(01010101); // -> eventDevice.getTheoreticalPercentage()
    this.dateSignificantEvent = eventDevice.getCreatedAt();
  }
  
 

  public Long getNuc() {
    return nuc;
  }

  public void setNuc(Long nuc) {
    this.nuc = nuc;
  }

  public String getNuid() {
    return nuid;
  }

  public void setNuid(String nuid) {
    this.nuid = nuid;
  }

  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public BigInteger getCoinIn() {
    return coinIn;
  }

  public void setCoinIn(BigInteger coinIn) {
    this.coinIn = coinIn;
  }

  public BigInteger getCoinOut() {
    return coinOut;
  }

  public void setCoinOut(BigInteger coinOut) {
    this.coinOut = coinOut;
  }

  public BigInteger getJackPot() {
    return jackPot;
  }

  public void setJackPot(BigInteger jackPot) {
    this.jackPot = jackPot;
  }

  public BigInteger getHandPaid() {
    return handPaid;
  }

  public void setHandPaid(BigInteger handPaid) {
    this.handPaid = handPaid;
  }

  public BigInteger getBillIn() {
    return billIn;
  }

  public void setBillIn(BigInteger billIn) {
    this.billIn = billIn;
  }

  public BigInteger getGamesPlayed() {
    return gamesPlayed;
  }

  public void setGamesPlayed(BigInteger gamesPlayed) {
    this.gamesPlayed = gamesPlayed;
  }

  public BigInteger getTheoreticalPercentage() {
    return theoreticalPercentage;
  }

  public void setTheoreticalPercentage(BigInteger theoreticalPercentage) {
    this.theoreticalPercentage = theoreticalPercentage;
  }

  public String getSignificantEvent() {
    return significantEvent;
  }

  public void setSignificantEvent(String significantEvent) {
    this.significantEvent = significantEvent;
  }

  public ZonedDateTime getDateSignificantEvent() {
    return dateSignificantEvent;
  }

  public void setDateSignificantEvent(ZonedDateTime dateSignificantEvent) {
    this.dateSignificantEvent = dateSignificantEvent;
  }

  @Override
  public String toString() {
    return "Registry{" +
      "nuc='" + nuc + '\'' +
      ", nuid='" + nuid + '\'' +
      ", serial='" + serial + '\'' +
      ", coinIn='" + coinIn + '\'' +
      ", coinOut='" + coinOut + '\'' +
      ", jackPot='" + jackPot + '\'' +
      ", handPaid='" + handPaid + '\'' +
      ", billIn='" + billIn + '\'' +
      ", gamesPlayed='" + gamesPlayed + '\'' +
      ", theoreticalPercentage='" + theoreticalPercentage + '\'' +
      ", significantEvent='" + significantEvent + '\'' +
      ", dateSignificantEvent=" + dateSignificantEvent +
      '}';
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nuc == null) ? 0 : nuc.hashCode());
    result = prime * result + ((nuid == null) ? 0 : nuid.hashCode());
    result = prime * result + ((serial == null) ? 0 : serial.hashCode());
    result = prime * result + ((coinIn == null) ? 0 : coinIn.hashCode());
    result = prime * result + ((coinOut == null) ? 0 : coinOut.hashCode());
    result = prime * result + ((jackPot == null) ? 0 : jackPot.hashCode());
    result = prime * result + ((handPaid == null) ? 0 : handPaid.hashCode());
    result = prime * result + ((billIn == null) ? 0 : billIn.hashCode());
    result = prime * result + ((gamesPlayed == null) ? 0 : gamesPlayed.hashCode());
    result = prime * result + ((theoreticalPercentage == null) ? 0 : theoreticalPercentage.hashCode());
    result = prime * result + ((significantEvent == null) ? 0 : significantEvent.hashCode());
    result = prime * result + ((dateSignificantEvent == null) ? 0 : dateSignificantEvent.hashCode());
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
    ColjuegosRDDTO other = (ColjuegosRDDTO) obj;
    if (nuc == null) {
      if (other.nuc != null)
        return false;
    } else if (!nuc.equals(other.nuc))
      return false;
    if (nuid == null) {
      if (other.nuid != null)
        return false;
    } else if (!nuid.equals(other.nuid))
      return false;
    if (serial == null) {
      if (other.serial != null)
        return false;
    } else if (!serial.equals(other.serial))
      return false;
    if (coinIn == null) {
      if (other.coinIn != null)
        return false;
    } else if (!coinIn.equals(other.coinIn))
      return false;
    if (coinOut == null) {
      if (other.coinOut != null)
        return false;
    } else if (!coinOut.equals(other.coinOut))
      return false;
    if (jackPot == null) {
      if (other.jackPot != null)
        return false;
    } else if (!jackPot.equals(other.jackPot))
      return false;
    if (handPaid == null) {
      if (other.handPaid != null)
        return false;
    } else if (!handPaid.equals(other.handPaid))
      return false;
    if (billIn == null) {
      if (other.billIn != null)
        return false;
    } else if (!billIn.equals(other.billIn))
      return false;
    if (gamesPlayed == null) {
      if (other.gamesPlayed != null)
        return false;
    } else if (!gamesPlayed.equals(other.gamesPlayed))
      return false;
    if (theoreticalPercentage == null) {
      if (other.theoreticalPercentage != null)
        return false;
    } else if (!theoreticalPercentage.equals(other.theoreticalPercentage))
      return false;
    if (significantEvent == null) {
      if (other.significantEvent != null)
        return false;
    } else if (!significantEvent.equals(other.significantEvent))
      return false;
    if (dateSignificantEvent == null) {
      if (other.dateSignificantEvent != null)
        return false;
    } else if (!dateSignificantEvent.equals(other.dateSignificantEvent))
      return false;
    return true;
  }
  
}

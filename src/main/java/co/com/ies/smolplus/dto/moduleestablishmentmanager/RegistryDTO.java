package co.com.ies.smolplus.dto.moduleestablishmentmanager;

import co.com.ies.smolplus.dto.moduledevicemanager.DeviceDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;

import java.time.ZonedDateTime;

public class RegistryDTO {

  private String nuc;

  private String nuid;

  private String serial;

  private String coinIn;

  private String coinOut;

  private String jackPot;

  private String handPaid;

  private String billIn;

  private String gamesPlayed;

  private String theoreticalPercentage;

  private String significantEvent;

  private ZonedDateTime dateSignificantEvent;

  public RegistryDTO(){

  }

  public RegistryDTO(EventDeviceDTO eventDevice, DeviceDTO device){
    this.nuc = device.getColjuegosCode();
    this.nuid = device.getNuid();
    this.serial = device.getSerial();
    this.theoreticalPercentage = String.format("%.0f",eventDevice.getTheoreticalPercentage());
    this.dateSignificantEvent = eventDevice.getCreatedAt();
  }
/*
  public RegistryDTO(String nuc, String nuid, String serial, String theoreticalPercentage){
    this.nuc = nuc;
    this.nuid = nuid;
    this.serial = serial;
    this.theoreticalPercentage = theoreticalPercentage;
  }
*/
  public String getNuc() {
    return nuc;
  }

  public RegistryDTO setNuc(String nuc) {
    this.nuc = nuc;
    return this;
  }

  public String getNuid() {
    return nuid;
  }

  public RegistryDTO setNuid(String nuid) {
    this.nuid = nuid;
    return this;
  }

  public String getSerial() {
    return serial;
  }

  public RegistryDTO setSerial(String serial) {
    this.serial = serial;
    return this;
  }

  public String getCoinIn() {
    return coinIn;
  }

  public RegistryDTO setCoinIn(String coinIn) {
    this.coinIn = coinIn;
    return this;
  }

  public String getCoinOut() {
    return coinOut;
  }

  public RegistryDTO setCoinOut(String coinOut) {
    this.coinOut = coinOut;
    return this;
  }

  public String getJackPot() {
    return jackPot;
  }

  public RegistryDTO setJackPot(String jackPot) {
    this.jackPot = jackPot;
    return this;
  }

  public String getHandPaid() {
    return handPaid;
  }

  public RegistryDTO setHandPaid(String handPaid) {
    this.handPaid = handPaid;
    return this;
  }

  public String getBillIn() {
    return billIn;
  }

  public RegistryDTO setBillIn(String billIn) {
    this.billIn = billIn;
    return this;
  }

  public String getGamesPlayed() {
    return gamesPlayed;
  }

  public RegistryDTO setGamesPlayed(String gamesPlayed) {
    this.gamesPlayed = gamesPlayed;
    return this;
  }

  public String getTheoreticalPercentage() {
    return theoreticalPercentage;
  }

  public RegistryDTO setTheoreticalPercentage(String theoreticalPercentage) {
    this.theoreticalPercentage = theoreticalPercentage;
    return this;
  }

  public String getSignificantEvent() {
    return significantEvent;
  }

  public RegistryDTO setSignificantEvent(String significantEvent) {
    this.significantEvent = significantEvent;
    return this;
  }

  public ZonedDateTime getDateSignificantEvent() {
    return dateSignificantEvent;
  }

  public RegistryDTO setDateSignificantEvent(ZonedDateTime dateSignificantEvent) {
    this.dateSignificantEvent = dateSignificantEvent;
    return this;
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
}

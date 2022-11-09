package co.com.ies.smolplus.dto.moduleestablishmentmanager;

public enum ColjuegosEventsEnum {
  WITHOUT_SIGNIFICATIVE_EVENTS("LIQUIDACION", "00"),
  INTERFACE_LOST_COMMUNICATION("A1", "01"),
  LOST_COMUNICATION("D0", "02"),
  LOST_COMMUNICATION_0100("0100", "02"),
  MEMORY_CORRUPTION("31", "03"),
  MEMORY_CORRUPTION_32("32", "03"),
  MEMORY_CORRUPTION_33("33", "03"),
  MEMORY_CORRUPTION_34("34", "03"),
  MEMORY_CORRUPTION_35("35", "03"),
  MEMORY_CORRUPTION_36("36", "03"),
  MEMORY_CORRUPTION_37("37", "03"),
  MEMORY_CORRUPTION_38("38", "03"),
  MEMORY_CORRUPTION_39("39", "03"),
  MEMORY_CORRUPTION_3A("3A", "03"),
  INTERFACE_MEMORY_FAILURE("A5", "04"),
  MEMORY_WIPE_05("BORRADO05", "05"),
  ELECTRICAL_CURRENT_FAILIURE_ED00("ED00", "06"),
  ELECTRICAL_CURRENT_FAILIURE_EF00("EF00", "06"),
  EGM_ON("17", "06"), ROLLOVER("A3", "07"),
  MEMORY_WIPE("A2", "08"),
  NUID_0154("0154", "09"),
  NUID_NUID("NUID=", "09");

  private final String smolCode;
  private final String coljuegosCode;

  ColjuegosEventsEnum (String smolCode, String coljuegosCode){
    this.coljuegosCode = coljuegosCode;
    this.smolCode = smolCode;
  }

  public String getSmolCode(){
    return smolCode;
  }

  public String getColjuegosCode(){
    return coljuegosCode;
  }

}

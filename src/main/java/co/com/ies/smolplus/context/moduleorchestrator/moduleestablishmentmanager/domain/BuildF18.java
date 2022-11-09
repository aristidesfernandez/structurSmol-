package co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.domain;

import co.com.ies.smolplus.dto.moduledevicemanager.DeviceEstablishmentDTO;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.*;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BuildF18 {

  private final ForeingEstablishmentManager foreingEstablishmentManager;
  private static final Long ONE_HOUR= 1L;
  private static final String NOT_FOUND_EVENT = "notFound";
  public static final BigInteger COUNTER_ON_ZERO = BigInteger.ZERO;
  private List<CounterEventDTO> notReportedCounterEventsDevice = new ArrayList<>();
  private static final int ZERO_DECIMALS = 0;
  public static final String F_18 = "F18";
  public static final String A_KEY = "A KEY";
  public static final String FORMAT_YYYY_MM_DD = "yyyyMMdd";
  private static final Integer CONTROL_HOUR = 6;
  private static final Long ONE_DAY= 1L;
  public static final int CONTROL_MINUTE = 0;
  static ZonedDateTime controlTime = ZonedDateTime.now().withHour(CONTROL_HOUR)
          .withMinute(CONTROL_MINUTE).withSecond(0);
 

  public BuildF18(ForeingEstablishmentManager foreingEstablishmentManager) {
    this.foreingEstablishmentManager = foreingEstablishmentManager;
  }

  public List<ColjuegosF18DataDTO> getF18(){
    List<ColjuegosF18DataDTO> coljuegosF18DataDTO = new ArrayList<>();

    ZonedDateTime controlTime = ZonedDateTime.now().withHour(6)
      .withMinute(0).withSecond(0);
    List<EventDeviceDTO> eventDeviceByDate = foreingEstablishmentManager.getEventDeviceByDate(controlTime);

    Map<Long,List<EstablishmentDTO>> operatorsWithEstablishmentMap = getEstablishmentByOperator();

    for (Map.Entry<Long, List<EstablishmentDTO>> operatorWithEstablishmentList : operatorsWithEstablishmentMap.entrySet()) {
      List<EstablishmentDTO> operatorWithEstablishments = operatorWithEstablishmentList.getValue();
      coljuegosF18DataDTO.add(buildF18(operatorWithEstablishments, eventDeviceByDate, controlTime));
      System.out.println("**** coljuegosF18DataDTO "+coljuegosF18DataDTO);
    }
    return coljuegosF18DataDTO;
  }

  Map<Long,List<EstablishmentDTO>> getEstablishmentByOperator() {

    List<OperatorDTO> allOperators = foreingEstablishmentManager.getOperators();

    Map<Long,List<EstablishmentDTO>> operatorsWithEstablishmentMap = new HashMap<>();

    for (OperatorDTO operatorDTO : allOperators) {
      Long idOperator = operatorDTO.getId();
      operatorsWithEstablishmentMap.put(idOperator, foreingEstablishmentManager.getEstablishmentByOperatorId(idOperator));
    }
    return operatorsWithEstablishmentMap;
  }

  public ColjuegosF18DataDTO buildF18(List<EstablishmentDTO> operatorWithEstablishments, List<EventDeviceDTO> eventDeviceByDate, ZonedDateTime controlTime) {
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_YYYY_MM_DD);
    String dateReportFormatted = controlTime.minusDays(ONE_DAY).format(formatter); //TODO es ZonedDateTime o String
    
    
    List<ColjuegosRCDTO> coljuegosRCDTOList = new ArrayList<>();
    Map<String,List<DeviceEstablishmentDTO>> deviceEstablishmentByEstablishmentId = new HashMap<>();
    ColjuegosF18DataDTO coljuegosF18DataDTO = new ColjuegosF18DataDTO();

    for (EstablishmentDTO establishmentByOperator : operatorWithEstablishments) {
      System.out.println("*********** operatorWithEstablishments : "+operatorWithEstablishments);
      Integer establishmentId = establishmentByOperator.getId().intValue();
      String coljuegosCode = establishmentByOperator.getColjuegosCode();
      deviceEstablishmentByEstablishmentId.put(coljuegosCode, foreingEstablishmentManager.getDeviceEstablishmentByEstablishmentId(establishmentId));
    }

    System.out.println("*********** operatorWithEstablishments : "+operatorWithEstablishments);

    String nit = operatorWithEstablishments.get(0).getOperator().getNit();
    String contract = operatorWithEstablishments.get(0).getOperator().getContractNumber();

    ColjuegosRIDTO coljuegosRIDTO = getRiRegistry(dateReportFormatted,nit);

    for (Map.Entry<String,List<DeviceEstablishmentDTO>> deviceEstablishment : deviceEstablishmentByEstablishmentId.entrySet()) {
      for (DeviceEstablishmentDTO valueDeviceEstablishment : deviceEstablishment.getValue()) {
        String coljuegosCode = deviceEstablishment.getKey();
        ColjuegosRCDTO coljuegosRCDTO = buildRegistry(eventDeviceByDate, valueDeviceEstablishment, contract, controlTime, coljuegosCode);
        coljuegosRCDTOList.add(coljuegosRCDTO);
      }
    }
    System.out.println("**** coljuegosRCDTOList "+ coljuegosRCDTOList); 

    ColjuegosRFDTO coljuegosRFDTO = getRfRegistry(dateReportFormatted, nit, 0);

    coljuegosF18DataDTO.setRI(coljuegosRIDTO);
    coljuegosF18DataDTO.setRC(coljuegosRCDTOList);
    coljuegosF18DataDTO.setRF(coljuegosRFDTO);
    return coljuegosF18DataDTO;
  }


  public ColjuegosRCDTO buildRegistry(List<EventDeviceDTO> eventDeviceByDate, DeviceEstablishmentDTO valueDeviceEstablishment, String contract, ZonedDateTime controlTime, String coljuegosCode){

    ZonedDateTime controlTimeDayBefore = controlTime.minusHours(ONE_HOUR);

    List<ColjuegosRDDTO> registries = new ArrayList<>();
    List<EventDeviceDTO> notReportedEvents = new ArrayList<>();
    List<EventDeviceDTO> eventDeviceByEstablishmentList = new ArrayList<>();
    

    for (EventDeviceDTO eventDeviceDTO : eventDeviceByDate) {
      if (eventDeviceDTO.getDeviceId().equals(valueDeviceEstablishment.getDevice().getId())) {
        eventDeviceByEstablishmentList.add(eventDeviceDTO);
      }
    }

    for (EventDeviceDTO eventDeviceByEstablishment : eventDeviceByEstablishmentList) {

      String eventCode = eventDeviceByEstablishment.getEventType().getEventCode();
      ZonedDateTime dateSignificantEvent = eventDeviceByEstablishment.getCreatedAt();
      String eventCodeColjuegos = changeEventCode(eventCode);
      
      Boolean isSignificant = Boolean.FALSE;
      if (!eventCodeColjuegos.equals(NOT_FOUND_EVENT)) {
        isSignificant = Boolean.TRUE;
      }

      boolean isMemoryWipeEvent = ColjuegosEventsEnum.MEMORY_WIPE.getSmolCode().equals(eventCode)
        || ColjuegosEventsEnum.MEMORY_WIPE_05.getSmolCode().equals(eventCode);
      boolean isEventBetweenControlDates = dateSignificantEvent.isAfter(controlTimeDayBefore)
        && dateSignificantEvent.isBefore(controlTime);
      boolean isReportableEvent = isSignificant && isEventBetweenControlDates;

      if (!isReportableEvent){
        notReportedEvents.add(eventDeviceByEstablishment);
        break;
      }

      ColjuegosRDDTO registry = new ColjuegosRDDTO(eventDeviceByEstablishment, valueDeviceEstablishment.getDevice());

      List<CounterEventDTO> counterEventByEventDevice = foreingEstablishmentManager.getCounterEventByEventDeviceId(eventDeviceByEstablishment.getId());
      System.out.println("**** counterEventByEventDevice:  "+ counterEventByEventDevice);
      List<CounterEventDTO> countersEventDevice = getCountersEvent(counterEventByEventDevice, eventDeviceByEstablishment);
      

      if (!countersEventDevice.isEmpty()) {
        notReportedEvents.add(eventDeviceByEstablishment);
      }

      setCounters(registry, countersEventDevice, eventDeviceByEstablishment.getMoneyDenomination());

      if (isMemoryWipeEvent) {
        registry.setGamesPlayed(COUNTER_ON_ZERO);
        registry.setCoinIn(COUNTER_ON_ZERO);
        registry.setCoinOut(COUNTER_ON_ZERO);
        registry.setJackPot(COUNTER_ON_ZERO);
        registry.setHandPaid(COUNTER_ON_ZERO);
        registry.setBillIn(COUNTER_ON_ZERO);
      }
      registry.setSignificantEvent(eventCodeColjuegos);
      registries.add(registry);
    }
    BigInteger totalRDEventsLocal = BigInteger.valueOf(registries.size());
    ColjuegosRCDTO coljuegosRCDTO = getRcRegistry(contract, coljuegosCode, registries, totalRDEventsLocal);
    return coljuegosRCDTO;
  }

  private String changeEventCode(String eventCode) {

    for (ColjuegosEventsEnum eventCodeColjuegos : ColjuegosEventsEnum.values()) {
      boolean isEventDeviceCodeEqualsSmolCode = eventCodeColjuegos.getSmolCode().equals(eventCode);

      if (isEventDeviceCodeEqualsSmolCode) {
        return eventCodeColjuegos.getColjuegosCode();
      }
    }
    return NOT_FOUND_EVENT;
  }

  private void setCounters(ColjuegosRDDTO registry, List<CounterEventDTO> counterEventDevices, Double moneyDenomination) {
    for (CounterEventDTO counterEvent : counterEventDevices) {
      String counterCode = counterEvent.getCounterCode();
      BigDecimal valueCounter = BigDecimal.valueOf(counterEvent.getValueCounter());

      if (counterCode.equals(ColjuegosCountersEnum.PLAYED_GAMES.getCounterCode())) {
        registry.setGamesPlayed(valueCounter.toBigInteger());
      }

      BigDecimal counterMoneyValue = counterToMoney(valueCounter, counterEvent.getDenominationSale(), moneyDenomination);

      if (counterCode.equals(ColjuegosCountersEnum.IN.getCounterCode())){
        registry.setCoinIn(counterMoneyValue.toBigInteger());
      }

      if (counterCode.equals(ColjuegosCountersEnum.OUT.getCounterCode())) {
        registry.setCoinOut(counterMoneyValue.toBigInteger());
      }

      if (counterCode.equals(ColjuegosCountersEnum.JP.getCounterCode())) {
        registry.setJackPot(counterMoneyValue.toBigInteger());
      }

      if (counterCode.equals(ColjuegosCountersEnum.HP.getCounterCode())) {
        registry.setHandPaid(counterMoneyValue.toBigInteger());
      }

      if (counterCode.equals(ColjuegosCountersEnum.BILL.getCounterCode())) {
        registry.setBillIn(counterMoneyValue.toBigInteger());
      }
    }
  }


  private List<CounterEventDTO> getCountersEvent (List<CounterEventDTO> counterEventsDevices, EventDeviceDTO eventDeviceByEstablishment) {
    List<CounterEventDTO> countersEventDevice = new ArrayList<>();

    for (CounterEventDTO counterEvent : counterEventsDevices) {
      boolean isCounterValueLessThanZero = BigDecimal.valueOf(counterEvent.getValueCounter()).compareTo(BigDecimal.ZERO) < 0;
      boolean isEventIdEqualsCounterEventId = eventDeviceByEstablishment.getId().equals(counterEvent.getEventDevice().getId());

      if (isCounterValueLessThanZero) {
        notReportedCounterEventsDevice.add(counterEvent);
      }
      
      if(isEventIdEqualsCounterEventId) {
        countersEventDevice.add(counterEvent);
      }
    }
    return countersEventDevice;
  }

  private BigDecimal counterToMoney(BigDecimal valueCounter, Float saleDenomination, Double moneyDenomination){
    BigDecimal sale = saleDenomination == null ? BigDecimal.ONE : BigDecimal.valueOf(saleDenomination);
    BigDecimal money = moneyDenomination == null ? BigDecimal.ONE : BigDecimal.valueOf(moneyDenomination);
    return valueCounter.multiply(sale.multiply(money)).setScale(ZERO_DECIMALS, RoundingMode.HALF_UP);
  }

  private static ColjuegosRIDTO getRiRegistry(String dateReport, String nit) {
    ColjuegosRIDTO riRegistry = new ColjuegosRIDTO();
    riRegistry.setFechaReporte(dateReport);
    riRegistry.setNit(Long.valueOf(nit));
    riRegistry.setFormato(F_18);
    riRegistry.setClave(A_KEY);
    return riRegistry;
  }

  private static ColjuegosRCDTO getRcRegistry(String contract, String localNumber,
        List<ColjuegosRDDTO> allEventsLocal, BigInteger totalRDEventsLocal) {
        ColjuegosRCDTO rcRegistry = new ColjuegosRCDTO();
        rcRegistry.setContrato(contract);
        rcRegistry.setCodigoLocal(localNumber);
        List<ColjuegosRDDTO> rdRegistries = getRdRegistries(allEventsLocal);
        rcRegistry.setRD(rdRegistries);
        ColjuegosREDTO reRegistry = getReRegistry(contract, localNumber, totalRDEventsLocal);
        rcRegistry.setRE(reRegistry);
        return rcRegistry;
  }
  
  private static List<ColjuegosRDDTO> getRdRegistries(List<ColjuegosRDDTO> allEventsLocal) {
    List<ColjuegosRDDTO> registries = new ArrayList<>();
    for (ColjuegosRDDTO event : allEventsLocal) {
      ColjuegosRDDTO rdRegistry = event;
        registries.add(rdRegistry);
    }
    return registries;
  }

  private static ColjuegosREDTO getReRegistry(String contract, String localNumber, BigInteger totalRDEventsLocal) {
      ColjuegosREDTO reRegistry = new ColjuegosREDTO();
      reRegistry.setContrato(contract);
      reRegistry.setCodigoLocal(localNumber);
      reRegistry.setTotalRD(totalRDEventsLocal);
      return reRegistry;
  }

  private static ColjuegosRFDTO getRfRegistry(String dateReport, String nit, Integer totalRDEvents) {
    ColjuegosRFDTO rfRegistry = new ColjuegosRFDTO();
    rfRegistry.setFechaReporte(null);
    rfRegistry.setNit(Long.valueOf(nit));
    rfRegistry.setFormato(null);
    rfRegistry.setTotalGlogalRegistrosListaRD(totalRDEvents.toString());
    return rfRegistry;
}
}

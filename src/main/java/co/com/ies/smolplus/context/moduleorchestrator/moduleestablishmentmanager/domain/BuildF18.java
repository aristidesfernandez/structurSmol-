package co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.domain;

import co.com.ies.smolplus.dto.moduledevicemanager.DeviceEstablishmentDTO;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.*;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.time.ZonedDateTime;
import java.util.*;

public class BuildF18 {

  private final ForeingEstablishmentManager foreingEstablishmentManager;
  private static final Long ONE_HOUR= 1L;
  private static final String NOT_FOUND_EVENT = "notFound";
  public static final BigInteger COUNTER_ON_ZERO = BigInteger.ZERO;
  private List<CounterEventDTO> notReportedCounterEventsDevice = new ArrayList<>();
  private static final int ZERO_DECIMALS = 0;


  public BuildF18(ForeingEstablishmentManager foreingEstablishmentManager) {
    this.foreingEstablishmentManager = foreingEstablishmentManager;
  }

  public List<ColjuegosRDDTO> getF18(){
    List<ColjuegosRDDTO> registries = new ArrayList<>();

    ZonedDateTime controlTime = ZonedDateTime.now().withHour(6)
      .withMinute(0).withSecond(0);
    List<EventDeviceDTO> eventDeviceByDate = foreingEstablishmentManager.getEventDeviceByDate(controlTime);

    Map<Long,List<EstablishmentDTO>> operatorsWithEstablishmentMap = getEstablishmentByOperator();

    for (Map.Entry<Long, List<EstablishmentDTO>> operatorWithEstablishmentList : operatorsWithEstablishmentMap.entrySet()) {
      List<EstablishmentDTO> operatorWithEstablishments = operatorWithEstablishmentList.getValue();
      registries = buildF18(operatorWithEstablishments, eventDeviceByDate, controlTime);
      System.out.println("**** registries1 "+registries);
    }
    return registries;
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

  public List<ColjuegosRDDTO> buildF18(List<EstablishmentDTO> operatorWithEstablishments, List<EventDeviceDTO> eventDeviceByDate, ZonedDateTime controlTime) {
    List<ColjuegosRDDTO> registries = new ArrayList<>();
    Map<Integer,List<DeviceEstablishmentDTO>> deviceEstablishmentByEstablishmentId = new HashMap<>();

    for (EstablishmentDTO establishmentByOperator : operatorWithEstablishments) {
      Integer establishmentId = establishmentByOperator.getId().intValue();
      deviceEstablishmentByEstablishmentId.put(establishmentId, foreingEstablishmentManager.getDeviceEstablishmentByEstablishmentId(establishmentId));
    }

    for (Map.Entry<Integer,List<DeviceEstablishmentDTO>> deviceEstablishment : deviceEstablishmentByEstablishmentId.entrySet()) {
      for (DeviceEstablishmentDTO valueDeviceEstablishment : deviceEstablishment.getValue()) {
        registries = buildRegistry(eventDeviceByDate, valueDeviceEstablishment, controlTime);
        System.out.println("**** registries2 "+registries); 
      }
    }
    return registries;
  }


  public List<ColjuegosRDDTO> buildRegistry(List<EventDeviceDTO> eventDeviceByDate, DeviceEstablishmentDTO valueDeviceEstablishment, ZonedDateTime controlTime){

    ZonedDateTime controlTimeDayBefore = controlTime.minusHours(ONE_HOUR);

    List<ColjuegosRDDTO> registries = new ArrayList<>();
    List<EventDeviceDTO> notReportedEvents = new ArrayList<>();
    List<EventDeviceDTO>  eventDeviceByEstablishmentList = new ArrayList<>();

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
    return registries;
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



}

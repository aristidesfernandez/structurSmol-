package co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.domain;

import co.com.ies.smolplus.dto.moduledevicemanager.DeviceDTO;
import co.com.ies.smolplus.dto.moduledevicemanager.DeviceEstablishmentDTO;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.*;
import co.com.ies.smolplus.dto.moduleeventmanager.CounterEventDTO;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.ZonedDateTime;
import java.util.*;

public class BuildF18 {

  private final ForeingEstablishmentManager foreingEstablishmentManager;
  private static final Long ONE_HOUR= 1L;
  private static final String NOT_FOUND_EVENT = "notFound";
  public static final String COUNTER_ON_ZERO = BigDecimal.ZERO.toString();
  private List<CounterEventDTO> notReportedCounterEventsDevice = new ArrayList<>();
  private static final int ZERO_DECIMALS = 0;


  public BuildF18(ForeingEstablishmentManager foreingEstablishmentManager) {
    this.foreingEstablishmentManager = foreingEstablishmentManager;
  }

  public EventDeviceDTO getF18(){
    ZonedDateTime controlTime = ZonedDateTime.now().withHour(6)
      .withMinute(0).withSecond(0);

    List<OperatorDTO> allOperators = foreingEstablishmentManager.getOperators();
    List<EventDeviceDTO> eventDeviceByDate = foreingEstablishmentManager.getEventDeviceByDate(controlTime);
    List<CounterEventDTO> counterEventByEventDeviceId = foreingEstablishmentManager.getCounterEventByEventDeviceId(null);

    Map<Long,List<EstablishmentDTO>> operatorsWithEstablishmentMap = new HashMap<>();

    for (OperatorDTO operatorDTO : allOperators) {
      Long idOperator = operatorDTO.getId();
      operatorsWithEstablishmentMap.put(idOperator, foreingEstablishmentManager.getEstablishmentByOperatorId(idOperator));
    }

    for (Map.Entry<Long, List<EstablishmentDTO>> operatorWithEstablishmentList : operatorsWithEstablishmentMap.entrySet()) {
      List<EstablishmentDTO> operatorWithEstablishments = operatorWithEstablishmentList.getValue();
      List<RegistryDTO> registries = buildF18(operatorWithEstablishments, eventDeviceByDate, counterEventByEventDeviceId, controlTime);
    }
    return null;
  }

  public List<RegistryDTO> buildF18(List<EstablishmentDTO> operatorWithEstablishments, List<EventDeviceDTO> eventDeviceByDate, List<CounterEventDTO> counterEventByEventDeviceId, ZonedDateTime controlTime) {

    Map<Integer,List<DeviceEstablishmentDTO>> deviceEstablishmentByEstablishmentId = new HashMap<>();

    for (EstablishmentDTO establishmentByOperator : operatorWithEstablishments) {
      Integer establishmentId = establishmentByOperator.getId().intValue();
      deviceEstablishmentByEstablishmentId.put(establishmentId, foreingEstablishmentManager.getDeviceEstablishmentByEstablishmentId(establishmentId));
    }

    for (Map.Entry<Integer,List<DeviceEstablishmentDTO>> deviceEstablishment : deviceEstablishmentByEstablishmentId.entrySet()) {
      for (DeviceEstablishmentDTO valueDeviceEstablishment : deviceEstablishment.getValue()) {
        buildRegistry(eventDeviceByDate, valueDeviceEstablishment,controlTime);
      }
    }
    return null;
  }


  public List<RegistryDTO> buildRegistry(List<EventDeviceDTO> eventDeviceByDate, DeviceEstablishmentDTO valueDeviceEstablishment , ZonedDateTime controlTime){
    List<RegistryDTO> registries = new ArrayList<>();
    ZonedDateTime controlTimeDayBefore = controlTime.minusHours(ONE_HOUR);
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
      RegistryDTO registry = new RegistryDTO(eventDeviceByEstablishment, valueDeviceEstablishment.getDevice());

      List<CounterEventDTO> countersEventDevice = eventDeviceByEstablishment.getCountersEvent();

      if (!countersEventDevice.isEmpty()) {
        notReportedEvents.add(eventDeviceByEstablishment);
      }
      setCounters(registry, countersEventDevice, eventDeviceByEstablishment.getMoneyDenomination());
      if (isMemoryWipeEvent) {
        registry.setGamesPlayed(COUNTER_ON_ZERO).setCoinIn(COUNTER_ON_ZERO).setCoinOut(COUNTER_ON_ZERO)
          .setJackPot(COUNTER_ON_ZERO).setHandPaid(COUNTER_ON_ZERO).setBillIn(COUNTER_ON_ZERO);
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
  private void setCounters(RegistryDTO registry, List<CounterEventDTO> counterEventDevices, Double moneyDenomination) {
    for (CounterEventDTO counterEvent : counterEventDevices) {
      String counterCode = counterEvent.getCounterType().getCounterCode();
      BigDecimal valueCounter = BigDecimal.valueOf(counterEvent.getValueCounter());

      if (counterCode.equals(ColjuegosCountersEnum.PLAYED_GAMES.getCounterCode())) {
        registry.setGamesPlayed(valueCounter.toString());
      }

      BigDecimal counterMoneyValue = counterToMoney(valueCounter,
        counterEvent.getSaleDenomination(), moneyDenomination);

      if (counterCode.equals(ColjuegosCountersEnum.IN.getCounterCode())){
        registry.setCoinIn(counterMoneyValue.toString());
      }

      if (counterCode.equals(ColjuegosCountersEnum.OUT.getCounterCode())) {
        registry.setCoinOut(counterMoneyValue.toString());
      }

      if (counterCode.equals(ColjuegosCountersEnum.JP.getCounterCode())) {
        registry.setJackPot(counterMoneyValue.toString());
      }

      if (counterCode.equals(ColjuegosCountersEnum.HP.getCounterCode())) {
        registry.setHandPaid(counterMoneyValue.toString());
      }

      if (counterCode.equals(ColjuegosCountersEnum.BILL.getCounterCode())) {
        registry.setBillIn(counterMoneyValue.toString());
      }
    }
  }

  /**
   * @deprecated
   */
  @Deprecated(forRemoval = true)
  private List<CounterEventDTO> getCountersEvent (List<CounterEventDTO> counterEventsDevices, EventDeviceDTO eventDevice) {
    List<CounterEventDTO> countersEventDevice = new ArrayList<>();

    for (CounterEventDTO counterEvent : counterEventsDevices) {
      boolean isCounterValueLessThanZero = counterEvent.getValueCounter().compareTo(BigDecimal.ZERO) < 0;
      boolean isEventIdEqualsCounterEventId = eventDevice.getId().equals(counterEvent.getEventDevice().getId());
      if (isCounterValueLessThanZero) {
        notReportedCounterEventsDevice.add(counterEvent);
      }
      if(isEventIdEqualsCounterEventId) {
        countersEventDevice.add(counterEvent);
      }
    }
    return countersEventDevice;
  }

  private BigDecimal counterToMoney(BigDecimal valueCounter, Double saleDenomination, Double moneyDenomination){
    BigDecimal sale = saleDenomination == null ? BigDecimal.ONE : BigDecimal.valueOf(saleDenomination);
    BigDecimal money = moneyDenomination == null ? BigDecimal.ONE : BigDecimal.valueOf(moneyDenomination);
    return valueCounter.multiply(sale.multiply(money)).setScale(ZERO_DECIMALS, RoundingMode.HALF_UP);
  }



}

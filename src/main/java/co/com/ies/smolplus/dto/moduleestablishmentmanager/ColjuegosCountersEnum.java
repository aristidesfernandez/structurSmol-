package co.com.ies.smolplus.dto.moduleestablishmentmanager;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ColjuegosCountersEnum {

  IN("00", "IN"), OUT("01", "OUT"), HP("03", "HANDPAY"), JP("02", "JACKPOT"), BILL("0B", "BILL"),
  PLAYED_GAMES("05", "PLAYED GAMES"), CREDITOS_ACTUALES("0C", "CURRENT CREDITS"),
  PH_IN("08", "PHYSICAL IN"), PH_OUT("09", "PHYSICAL OUT"), PH_IN_0F("C2", "PHYSICAL IN 0F"),
  PH_OUT_0F("C3", "PHYSICAL OUT 0F"), TOTAL_COIN_DROP("0A", "TOTAL COIN DROP"),
  AFT_B0("B0", "AFT BONUS"), AFT_B1("1E", "AFT BONUS"), AFT_C("A0", "AFT CASHEABLE"),
  AFT_RETIRO("B8", "AFT RETIRO"), AFT_P("A4", "AFT PROMOTIONAL"), AFT_R("A2", "AFT RESTRINGED"),
  EFT_C("C0", "EFT CASHEABLE"), EFT_R("C1", "EFT RESTRINGED"), EFT_P("C4", "EFT PROMOTIONAL"),
  EFT_RETIRO("C5", "EFT RETIRO"), TICKET_IN("28", "TICKET IN"),
  TICKET_PROMO_R("2A", "TICKET PROMOTIONAL REDIMIBLE"),
  TICKET_PROMO_NR("2B", "TICKET PROMOTIONAL NO-REDIMIBLE"), TICKET_OUT("2C", "TICKET OUT"),
  LEGACY_DEDUCIBLE("C5","Legacy Bonus Deductible"), LEGACY_NO_DEDUCIBLE("C6","Legacy Bonus NonDeductible"),
  LEGACY_WAGER("C7","Legacy Bonus Wager"), TCC("04", "Total Cancelled Credits");

  /**
   * El código del contador.
   */
  private final String counterCode;
  /**
   * Nombre del contador.
   */
  private final String name;

  /**
   * Permite obtener el listado de contadores que no necesitan ser mutiplicados por la denominación
   * SAS.
   *
   * @return lista de contadores que no requieren ser multiplicados por el SAS.
   */
  public static List<String> obtenerContadoresNoSAS() {
    return Arrays.asList(ColjuegosCountersEnum.PLAYED_GAMES.getCounterCode(), ColjuegosCountersEnum.PH_IN.getCounterCode(),
      ColjuegosCountersEnum.PH_OUT.getCounterCode(), ColjuegosCountersEnum.PH_IN_0F.getCounterCode(),
      ColjuegosCountersEnum.PH_OUT_0F.getCounterCode(), ColjuegosCountersEnum.TOTAL_COIN_DROP.getCounterCode(),
      ColjuegosCountersEnum.CREDITOS_ACTUALES.getCounterCode());
  }

  /**
   * Permite obtener el listado de contadores básicos.
   *
   * @return lista de contadores que no requieren ser multiplicados por el SAS.
   */
  public static List<String> obtenerContadoresBasicos() {
    return Arrays.asList(ColjuegosCountersEnum.IN.getCounterCode(), ColjuegosCountersEnum.OUT.getCounterCode(),
      ColjuegosCountersEnum.JP.getCounterCode(), ColjuegosCountersEnum.HP.getCounterCode(),
      ColjuegosCountersEnum.BILL.getCounterCode(), ColjuegosCountersEnum.PLAYED_GAMES.getCounterCode());
  }
}

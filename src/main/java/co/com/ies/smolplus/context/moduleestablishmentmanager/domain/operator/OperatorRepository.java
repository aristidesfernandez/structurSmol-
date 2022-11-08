package co.com.ies.smolplus.context.moduleestablishmentmanager.domain.operator;

import co.com.ies.smolplus.dto.moduleestablishmentmanager.OperatorDTO;

import java.util.List;

public interface OperatorRepository {

  List<Operator> getOperators();

}

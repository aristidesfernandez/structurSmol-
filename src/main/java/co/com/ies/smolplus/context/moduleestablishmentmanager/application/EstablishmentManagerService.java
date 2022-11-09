package co.com.ies.smolplus.context.moduleestablishmentmanager.application;

import co.com.ies.smolplus.dto.moduleestablishmentmanager.EstablishmentDTO;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.OperatorDTO;

import java.util.List;


public interface EstablishmentManagerService {
  List<OperatorDTO> getOperators();

  List<EstablishmentDTO> getEstablishmentByOperatorId(Long id);

}

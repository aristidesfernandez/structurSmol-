package co.com.ies.smolplus.context.moduleestablishmentmanager.application.establishment;

import co.com.ies.smolplus.dto.moduleestablishmentmanager.EstablishmentDTO;

import java.util.List;

public interface EstablishmentService {

  List<EstablishmentDTO> getEstablishmentByOperatorId(Long id);

}

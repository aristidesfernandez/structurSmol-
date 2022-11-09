package co.com.ies.smolplus.context.moduleestablishmentmanager.application.impl;

import co.com.ies.smolplus.context.moduleestablishmentmanager.application.establishment.EstablishmentService;
import co.com.ies.smolplus.context.moduleestablishmentmanager.application.operator.OperatorService;
import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.operator.Operator;
import co.com.ies.smolplus.dto.moduledevicemanager.DeviceEstablishmentDTO;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.EstablishmentDTO;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.OperatorDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import co.com.ies.smolplus.context.moduleestablishmentmanager.application.EstablishmentManagerService;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EstablishmentManagerServiceImpl implements EstablishmentManagerService{

  private final OperatorService operatorService;

  private final EstablishmentService establishmentService;


  public EstablishmentManagerServiceImpl(OperatorService operatorService, EstablishmentService establishmentService) {
    this.operatorService = operatorService;
    this.establishmentService = establishmentService;
  }

  @Override
  public List<OperatorDTO> getOperators() {
    return operatorService.getOperators();
  }

  @Override
  public List<EstablishmentDTO> getEstablishmentByOperatorId(Long id) {
    return establishmentService.getEstablishmentByOperatorId(id);
  }

}

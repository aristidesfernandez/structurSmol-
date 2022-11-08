package co.com.ies.smolplus.context.moduleestablishmentmanager.application.operator.impl;

import co.com.ies.smolplus.context.moduleestablishmentmanager.application.operator.OperatorService;
import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.operator.OperatorRepository;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.operator.OperatorMapper;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.OperatorDTO;

import java.util.List;

public class OperatorServiceImpl implements OperatorService {

  private OperatorRepository operatorRepository;

  private OperatorMapper operatorMapper;

  public OperatorServiceImpl(OperatorRepository operatorRepository, OperatorMapper operatorMapper) {
    this.operatorRepository = operatorRepository;
    this.operatorMapper = operatorMapper;
  }

  @Override
  public List<OperatorDTO> getOperators() {
    return null;
  }
}
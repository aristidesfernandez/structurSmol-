package co.com.ies.smolplus.context.moduleestablishmentmanager.application.establishment.impl;

import co.com.ies.smolplus.context.moduleestablishmentmanager.application.establishment.EstablishmentService;
import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.establishment.EstablishmentRepository;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.establishment.EstablishmentMapper;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.EstablishmentDTO;

import java.util.List;
import java.util.UUID;

public class EstablishmentServiceImpl implements EstablishmentService {

  private EstablishmentRepository establishmentRepository;

  private EstablishmentMapper establishmentMapper;

  public EstablishmentServiceImpl(EstablishmentRepository establishmentRepository, EstablishmentMapper establishmentMapper) {
    this.establishmentRepository = establishmentRepository;
    this.establishmentMapper = establishmentMapper;
  }


  @Override
  public List<EstablishmentDTO> getEstablishmentByOperatorId(UUID id) {
    return null;
  }
}

package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.establishment;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.establishment.Establishment;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.establishment.EstablishmentEntityMapper;
import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.establishment.EstablishmentRepository;

import java.util.List;
import java.util.UUID;


@Repository
public class SpringDataEstablishmentRepository implements EstablishmentRepository {

  private final JpaEstablishmentRepository jpaEstablishmentRepository;

  private EstablishmentEntityMapper establishmentEntityMapper;

  public SpringDataEstablishmentRepository(JpaEstablishmentRepository jpaEstablishmentRepository) {
    this.jpaEstablishmentRepository = jpaEstablishmentRepository;
  }

  @Override
  public List<Establishment> getEstablishmentByOperatorId(UUID id) {
    List<EstablishmentEntity> establishmentEntityList= jpaEstablishmentRepository.findAllByOperatorId(id);
    List<Establishment> establishmentList = establishmentEntityMapper.toDomain(establishmentEntityList);
    return null;
  }
}

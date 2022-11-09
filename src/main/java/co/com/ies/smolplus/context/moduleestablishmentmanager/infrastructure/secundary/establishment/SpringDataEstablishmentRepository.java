package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.establishment;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.establishment.Establishment;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.establishment.EstablishmentEntityMapper;
import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.establishment.EstablishmentRepository;

import java.util.List;


@Repository
public class SpringDataEstablishmentRepository implements EstablishmentRepository {

  private final JpaEstablishmentRepository jpaEstablishmentRepository;

  private EstablishmentEntityMapper establishmentEntityMapper;

  public SpringDataEstablishmentRepository(JpaEstablishmentRepository jpaEstablishmentRepository,
      EstablishmentEntityMapper establishmentEntityMapper) {
    this.jpaEstablishmentRepository = jpaEstablishmentRepository;
    this.establishmentEntityMapper = establishmentEntityMapper;
  }


  @Override
  public List<Establishment> getEstablishmentByOperatorId(Long id) {
    List<EstablishmentEntity> establishmentEntityList= jpaEstablishmentRepository.findAllByOperatorId(id);
    List<Establishment> establishmentList = establishmentEntityMapper.toDomain(establishmentEntityList);
    return establishmentList;
  }
}

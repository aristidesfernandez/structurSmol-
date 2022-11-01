package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.establishment;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.establishment.EstablishmentRepository;


@Repository
public class SpringDataEstablishmentRepository implements EstablishmentRepository {

  private final JpaEstablishmentRepository jpaEstablishmentRepository;

  public SpringDataEstablishmentRepository(JpaEstablishmentRepository jpaEstablishmentRepository) {
    this.jpaEstablishmentRepository = jpaEstablishmentRepository;
  }
}

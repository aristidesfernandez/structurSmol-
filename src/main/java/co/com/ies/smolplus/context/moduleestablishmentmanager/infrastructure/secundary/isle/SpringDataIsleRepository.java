package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.isle;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.isle.IsleRepository;


@Repository
public class SpringDataIsleRepository implements IsleRepository {

  private final JpaIsleRepository jpaIsleRepository;

  public SpringDataIsleRepository(JpaIsleRepository jpaIsleRepository) {
    this.jpaIsleRepository = jpaIsleRepository;
  }
}

package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.operator;

import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.operator.OperatorRepository;


@Repository
public class SpringDataOperatorRepository implements OperatorRepository {

  private final JpaOperatorRepository jpaOperatorRepository;

  public SpringDataOperatorRepository(JpaOperatorRepository jpaOperatorRepository) {
    this.jpaOperatorRepository = jpaOperatorRepository;
  }
}

package co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.secundary.operator;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.operator.Operator;
import co.com.ies.smolplus.context.moduleestablishmentmanager.infrastructure.primary.mapper.operator.OperatorEntityMapper;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.OperatorDTO;
import org.springframework.stereotype.Repository;

import co.com.ies.smolplus.context.moduleestablishmentmanager.domain.operator.OperatorRepository;

import java.util.List;


@Repository
public class SpringDataOperatorRepository implements OperatorRepository {

  private final JpaOperatorRepository jpaOperatorRepository;

  private OperatorEntityMapper operatorEntityMapper ;

  public SpringDataOperatorRepository(JpaOperatorRepository jpaOperatorRepository) {
    this.jpaOperatorRepository = jpaOperatorRepository;
  }

  @Override
  public List<Operator> getOperators() {
    List<OperatorEntity> operatorEntityList = jpaOperatorRepository.findAll();
    List<Operator>  operatorList = operatorEntityMapper.toDomain(operatorEntityList);
    return operatorList;
  }
}

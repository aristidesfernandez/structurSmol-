package co.com.ies.smolplus.context.moduleestablishmentmanager.domain.establishment;

import java.util.List;
import java.util.UUID;

public interface EstablishmentRepository {

    List<Establishment> getEstablishmentByOperatorId(Long id);
}

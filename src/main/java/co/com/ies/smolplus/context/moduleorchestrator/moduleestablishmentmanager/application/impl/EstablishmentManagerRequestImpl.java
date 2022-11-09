package co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.application.impl;

import co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.application.EstablishmentManagerRequest;
import co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.domain.BuildF18;
import co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.domain.ForeingEstablishmentManager;
import co.com.ies.smolplus.dto.moduleestablishmentmanager.ColjuegosRDDTO;



import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class EstablishmentManagerRequestImpl implements EstablishmentManagerRequest {

  private final ForeingEstablishmentManager foreingEstablishmentManager;

  private BuildF18 buildF18;

  public EstablishmentManagerRequestImpl(ForeingEstablishmentManager foreingEstablishmentManager) {
    this.foreingEstablishmentManager = foreingEstablishmentManager;
    this.buildF18 = new BuildF18(this.foreingEstablishmentManager);
  }

  @Override
  public List<ColjuegosRDDTO> getF18() {
    return buildF18.getF18();
  }
}

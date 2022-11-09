package co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.insfrastructure.primary;

import co.com.ies.smolplus.context.moduleorchestrator.moduleestablishmentmanager.application.EstablishmentManagerRequest;
import co.com.ies.smolplus.dto.moduleeventmanager.EventDeviceDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class EstablishmentManagerResource {

  private final Logger log = LoggerFactory.getLogger(EstablishmentManagerResource.class);

  private final EstablishmentManagerRequest establishmentManagerRequest;

  public EstablishmentManagerResource(EstablishmentManagerRequest establishmentManagerRequest) {
    this.establishmentManagerRequest = establishmentManagerRequest;
  }


  @GetMapping("/buildF18")
  public ResponseEntity<EventDeviceDTO> buildF18() {
    log.debug("REST request to GET buildF18 : {}");

    EventDeviceDTO eventDeviceDTOList = establishmentManagerRequest.getF18();
    log.debug("REST RESPONSE to GET buildF18 : {}", eventDeviceDTOList );
    System.out.println("REST RESPONSE to save buildF18 : {}"+ eventDeviceDTOList );

    return ResponseEntity.ok(eventDeviceDTOList);
  }
}

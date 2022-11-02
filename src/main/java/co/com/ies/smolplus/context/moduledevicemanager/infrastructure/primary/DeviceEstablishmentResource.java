package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.ies.smolplus.context.moduledevicemanager.application.DeviceManagerService;
import co.com.ies.smolplus.dto.moduledevicemanager.DeviceEstablishmentDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.BadRequestAlertException;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.HeaderUtil;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.ResponseUtil;

@RestController
@RequestMapping("/api")
public class DeviceEstablishmentResource {

    private final Logger log = LoggerFactory.getLogger(DeviceEstablishmentResource.class);

    private static final String ENTITY_NAME = "deviceEstablishment";

    private String applicationName;

    private final DeviceManagerService deviceManagerService;

    public DeviceEstablishmentResource(DeviceManagerService deviceManagerService) {
        this.deviceManagerService = deviceManagerService;
    }

    @PostMapping("/device-establishments")
    public ResponseEntity<DeviceEstablishmentDTO> createDeviceEstablishment(
        @Valid @RequestBody DeviceEstablishmentDTO deviceEstablishmentDTO
    ) throws URISyntaxException {
        log.debug("REST request to save DeviceEstablishment : {}", deviceEstablishmentDTO);
        if (deviceEstablishmentDTO.getId() != null) {
            throw new BadRequestAlertException("A new deviceEstablishment cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DeviceEstablishmentDTO result = null; //deviceManagerService.save(deviceEstablishmentDTO);
        return ResponseEntity
            .created(new URI("/api/device-establishments/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    @PutMapping("/device-establishments/{id}")
    public ResponseEntity<DeviceEstablishmentDTO> updateDeviceEstablishment(
        @PathVariable(value = "id", required = false) final UUID id,
        @Valid @RequestBody DeviceEstablishmentDTO deviceEstablishmentDTO) {
        log.debug("REST request to update DeviceEstablishment : {}, {}", id, deviceEstablishmentDTO);
        if (deviceEstablishmentDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, deviceEstablishmentDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        DeviceEstablishmentDTO result = null; //deviceManagerService.update(deviceEstablishmentDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, deviceEstablishmentDTO.getId().toString()))
            .body(result);
    }

    @GetMapping("/device-establishments")
    public ResponseEntity<List<DeviceEstablishmentDTO>> getAllDeviceEstablishments() {
        log.debug("REST request to get DeviceEstablishments");
        return null;
    }

    @GetMapping("/device-establishments/{id}")
    public ResponseEntity<DeviceEstablishmentDTO> getDeviceEstablishment(@PathVariable UUID id) {
        log.debug("REST request to get DeviceEstablishment : {}", id);
        Optional<DeviceEstablishmentDTO> deviceEstablishmentDTO = null; //deviceManagerService.findOne(id);
        return ResponseUtil.wrapOrNotFound(deviceEstablishmentDTO);
    }

    @DeleteMapping("/device-establishments/{id}")
    public ResponseEntity<Void> deleteDeviceEstablishment(@PathVariable UUID id) {
        log.debug("REST request to delete DeviceEstablishment : {}", id);
        //deviceEstablishmentService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}

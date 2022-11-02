package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
import co.com.ies.smolplus.dto.moduledevicemanager.DeviceTypeDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.BadRequestAlertException;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.HeaderUtil;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.ResponseUtil;

@RestController
@RequestMapping("/api")
public class DeviceTypeResource {

    private final Logger log = LoggerFactory.getLogger(DeviceTypeResource.class);

    private static final String ENTITY_NAME = "deviceType";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final DeviceManagerService deviceManagerService;

    public DeviceTypeResource(DeviceManagerService deviceManagerService) {
        this.deviceManagerService = deviceManagerService;
    }

    @PostMapping("/device-types")
    public ResponseEntity<DeviceTypeDTO> createDeviceType(@Valid @RequestBody DeviceTypeDTO deviceTypeDTO) throws URISyntaxException {
        log.debug("REST request to save DeviceType : {}", deviceTypeDTO);
        if (deviceTypeDTO.getId() != null) {
            throw new BadRequestAlertException("A new deviceType cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DeviceTypeDTO result = null; //deviceManagerService.save(deviceTypeDTO);
        return ResponseEntity
            .created(new URI("/api/device-types/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    @PutMapping("/device-types/{id}")
    public ResponseEntity<DeviceTypeDTO> updateDeviceType(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody DeviceTypeDTO deviceTypeDTO) {
        log.debug("REST request to update DeviceType : {}, {}", id, deviceTypeDTO);
        if (deviceTypeDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, deviceTypeDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        DeviceTypeDTO result = null; //deviceManagerService.update(deviceTypeDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, deviceTypeDTO.getId().toString()))
            .body(result);
    }

    @GetMapping("/device-types")
    public ResponseEntity<List<DeviceTypeDTO>> getAllDeviceTypes() {
        log.debug("REST request to get DeviceTypes ");
        return null;
    }

    @GetMapping("/device-types/{id}")
    public ResponseEntity<DeviceTypeDTO> getDeviceType(@PathVariable Long id) {
        log.debug("REST request to get DeviceType : {}", id);
        Optional<DeviceTypeDTO> deviceTypeDTO = null; //deviceManagerService.findOne(id);
        return ResponseUtil.wrapOrNotFound(deviceTypeDTO);
    }

    @DeleteMapping("/device-types/{id}")
    public ResponseEntity<Void> deleteDeviceType(@PathVariable Long id) {
        log.debug("REST request to delete DeviceType : {}", id);
        //deviceTypeService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}

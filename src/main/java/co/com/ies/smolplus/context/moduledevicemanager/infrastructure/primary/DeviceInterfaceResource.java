package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.primary;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
import co.com.ies.smolplus.dto.moduledevicemanager.DeviceInterfaceDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.BadRequestAlertException;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.HeaderUtil;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.ResponseUtil;

@RestController
@RequestMapping("/api")
public class DeviceInterfaceResource {

    private final Logger log = LoggerFactory.getLogger(DeviceInterfaceResource.class);

    private static final String ENTITY_NAME = "deviceInterface";

    private String applicationName;

    private final DeviceManagerService deviceManagerService;

    public DeviceInterfaceResource(DeviceManagerService deviceManagerService) {
        this.deviceManagerService = deviceManagerService;
    }

    @PostMapping("/device-interfaces")
    public ResponseEntity<DeviceInterfaceDTO> createDeviceInterface(@RequestBody DeviceInterfaceDTO deviceInterfaceDTO)
        throws URISyntaxException {
        log.debug("REST request to save DeviceInterface : {}", deviceInterfaceDTO);
        if (deviceInterfaceDTO.getId() != null) {
            throw new BadRequestAlertException("A new deviceInterface cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DeviceInterfaceDTO result = null; //deviceManagerService.save(deviceInterfaceDTO);
        return ResponseEntity
            .created(new URI("/api/device-interfaces/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    @PutMapping("/device-interfaces/{id}")
    public ResponseEntity<DeviceInterfaceDTO> updateDeviceInterface(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody DeviceInterfaceDTO deviceInterfaceDTO) {
        log.debug("REST request to update DeviceInterface : {}, {}", id, deviceInterfaceDTO);
        if (deviceInterfaceDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, deviceInterfaceDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        DeviceInterfaceDTO result = null; //deviceManagerService.update(deviceInterfaceDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, deviceInterfaceDTO.getId().toString()))
            .body(result);
    }

    @GetMapping("/device-interfaces")
    public ResponseEntity<List<DeviceInterfaceDTO>> getAllDeviceInterfaces() {
        log.debug("REST request to get DeviceInterfaces");
        return null;
    }

    @GetMapping("/device-interfaces/{id}")
    public ResponseEntity<DeviceInterfaceDTO> getDeviceInterface(@PathVariable Long id) {
        log.debug("REST request to get DeviceInterface : {}", id);
        Optional<DeviceInterfaceDTO> deviceInterfaceDTO = null; //deviceManagerService.findOne(id);
        return ResponseUtil.wrapOrNotFound(deviceInterfaceDTO);
    }

    @DeleteMapping("/device-interfaces/{id}")
    public ResponseEntity<Void> deleteDeviceInterface(@PathVariable Long id) {
        log.debug("REST request to delete DeviceInterface : {}", id);
        //deviceInterfaceService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}


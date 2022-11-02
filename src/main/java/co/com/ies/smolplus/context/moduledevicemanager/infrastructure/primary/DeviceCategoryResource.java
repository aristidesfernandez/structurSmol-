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
import co.com.ies.smolplus.dto.moduledevicemanager.DeviceCategoryDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.BadRequestAlertException;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.HeaderUtil;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.ResponseUtil;

@RestController
@RequestMapping("/api")
public class DeviceCategoryResource {

    private final Logger log = LoggerFactory.getLogger(DeviceCategoryResource.class);

    private static final String ENTITY_NAME = "deviceCategory";

    private String applicationName;

    private final DeviceManagerService deviceManagerService;

    public DeviceCategoryResource(DeviceManagerService deviceManagerService) {
        this.deviceManagerService = deviceManagerService;
    }

    @PostMapping("/device-categories")
    public ResponseEntity<DeviceCategoryDTO> createDeviceCategory(@Valid @RequestBody DeviceCategoryDTO deviceCategoryDTO)
        throws URISyntaxException {
        log.debug("REST request to save DeviceCategory : {}", deviceCategoryDTO);
        if (deviceCategoryDTO.getId() != null) {
            throw new BadRequestAlertException("A new deviceCategory cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DeviceCategoryDTO result = null; //deviceManagerService.save(deviceCategoryDTO);
        return ResponseEntity
            .created(new URI("/api/device-categories/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    @PutMapping("/device-categories/{id}")
    public ResponseEntity<DeviceCategoryDTO> updateDeviceCategory(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody DeviceCategoryDTO deviceCategoryDTO) {
        log.debug("REST request to update DeviceCategory : {}, {}", id, deviceCategoryDTO);
        if (deviceCategoryDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, deviceCategoryDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        DeviceCategoryDTO result = null; //deviceManagerService.update(deviceCategoryDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, deviceCategoryDTO.getId().toString()))
            .body(result);
    }

    @GetMapping("/device-categories")
    public ResponseEntity<List<DeviceCategoryDTO>> getAllDeviceCategories() {
        log.debug("REST request to get DeviceCategories");
        return null;
    }

    @GetMapping("/device-categories/{id}")
    public ResponseEntity<DeviceCategoryDTO> getDeviceCategory(@PathVariable Long id) {
        log.debug("REST request to get DeviceCategory : {}", id);
        Optional<DeviceCategoryDTO> deviceCategoryDTO = null; //deviceManagerService.findOne(id);
        return ResponseUtil.wrapOrNotFound(deviceCategoryDTO);
    }

    @DeleteMapping("/device-categories/{id}")
    public ResponseEntity<Void> deleteDeviceCategory(@PathVariable Long id) {
        log.debug("REST request to delete DeviceCategory : {}", id);
        //deviceCategoryService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}


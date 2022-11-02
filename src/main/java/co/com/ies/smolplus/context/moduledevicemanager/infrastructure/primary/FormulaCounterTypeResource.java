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
import co.com.ies.smolplus.dto.moduledevicemanager.FormulaCounterTypeDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.BadRequestAlertException;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.HeaderUtil;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.ResponseUtil;

@RestController
@RequestMapping("/api")
public class FormulaCounterTypeResource {

    private final Logger log = LoggerFactory.getLogger(FormulaCounterTypeResource.class);

    private static final String ENTITY_NAME = "formulaCounterType";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final DeviceManagerService deviceManagerService;

    public FormulaCounterTypeResource(DeviceManagerService deviceManagerService) {
        this.deviceManagerService = deviceManagerService;
    }

    @PostMapping("/formula-counter-types")
    public ResponseEntity<FormulaCounterTypeDTO> createFormulaCounterType(@RequestBody FormulaCounterTypeDTO formulaCounterTypeDTO)
        throws URISyntaxException {
        log.debug("REST request to save FormulaCounterType : {}", formulaCounterTypeDTO);
        if (formulaCounterTypeDTO.getId() != null) {
            throw new BadRequestAlertException("A new formulaCounterType cannot already have an ID", ENTITY_NAME, "idexists");
        }
        FormulaCounterTypeDTO result = null; //deviceManagerService.save(formulaCounterTypeDTO);
        return ResponseEntity
            .created(new URI("/api/formula-counter-types/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    @PutMapping("/formula-counter-types/{id}")
    public ResponseEntity<FormulaCounterTypeDTO> updateFormulaCounterType(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody FormulaCounterTypeDTO formulaCounterTypeDTO) {
        log.debug("REST request to update FormulaCounterType : {}, {}", id, formulaCounterTypeDTO);
        if (formulaCounterTypeDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, formulaCounterTypeDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        FormulaCounterTypeDTO result = null; //deviceManagerService.update(formulaCounterTypeDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, formulaCounterTypeDTO.getId().toString()))
            .body(result);
    }

    @GetMapping("/formula-counter-types")
    public ResponseEntity<List<FormulaCounterTypeDTO>> getAllFormulaCounterTypes() {
        log.debug("REST request to get FormulaCounterTypes");
        return null;
    }

    @GetMapping("/formula-counter-types/{id}")
    public ResponseEntity<FormulaCounterTypeDTO> getFormulaCounterType(@PathVariable Long id) {
        log.debug("REST request to get FormulaCounterType : {}", id);
        Optional<FormulaCounterTypeDTO> formulaCounterTypeDTO = null; //deviceManagerService.findOne(id);
        return ResponseUtil.wrapOrNotFound(formulaCounterTypeDTO);
    }

    @DeleteMapping("/formula-counter-types/{id}")
    public ResponseEntity<Void> deleteFormulaCounterType(@PathVariable Long id) {
        log.debug("REST request to delete FormulaCounterType : {}", id);
        //formulaCounterTypeService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}


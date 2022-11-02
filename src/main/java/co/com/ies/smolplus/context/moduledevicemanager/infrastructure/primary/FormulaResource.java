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
import co.com.ies.smolplus.dto.moduledevicemanager.FormulaDTO;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.BadRequestAlertException;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.HeaderUtil;
import co.com.ies.smolplus.technical.infrastructure.primary.exception.ResponseUtil;

@RestController
@RequestMapping("/api")
public class FormulaResource {

    private final Logger log = LoggerFactory.getLogger(FormulaResource.class);

    private static final String ENTITY_NAME = "formula";

    private String applicationName;

    private final DeviceManagerService deviceManagerService;

    public FormulaResource(DeviceManagerService deviceManagerService) {
        this.deviceManagerService = deviceManagerService;
    }

    @PostMapping("/formulas")
    public ResponseEntity<FormulaDTO> createFormula(@Valid @RequestBody FormulaDTO formulaDTO) throws URISyntaxException {
        log.debug("REST request to save Formula : {}", formulaDTO);
        if (formulaDTO.getId() != null) {
            throw new BadRequestAlertException("A new formula cannot already have an ID", ENTITY_NAME, "idexists");
        }
        FormulaDTO result = null; //deviceManagerService.save(formulaDTO);
        return ResponseEntity
            .created(new URI("/api/formulas/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    @PutMapping("/formulas/{id}")
    public ResponseEntity<FormulaDTO> updateFormula(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody FormulaDTO formulaDTO) {
        log.debug("REST request to update Formula : {}, {}", id, formulaDTO);
        if (formulaDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, formulaDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        FormulaDTO result = null; //deviceManagerService.update(formulaDTO);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, formulaDTO.getId().toString()))
            .body(result);
    }

    @GetMapping("/formulas")
    public ResponseEntity<List<FormulaDTO>> getAllFormulas() {
        log.debug("REST request to get Formulas");
        return null;
    }

    @GetMapping("/formulas/{id}")
    public ResponseEntity<FormulaDTO> getFormula(@PathVariable Long id) {
        log.debug("REST request to get Formula : {}", id);
        Optional<FormulaDTO> formulaDTO = null; //deviceManagerService.findOne(id);
        return ResponseUtil.wrapOrNotFound(formulaDTO);
    }

    @DeleteMapping("/formulas/{id}")
    public ResponseEntity<Void> deleteFormula(@PathVariable Long id) {
        log.debug("REST request to delete Formula : {}", id);
        //formulaService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}

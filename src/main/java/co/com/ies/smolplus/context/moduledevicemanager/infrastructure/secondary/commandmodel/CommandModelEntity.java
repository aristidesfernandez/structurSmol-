package co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.commandmodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.command.CommandEntity;
import co.com.ies.smolplus.context.moduledevicemanager.infrastructure.secondary.model.ModelEntity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A CommandModel.
 */
@Entity
@Table(name = "command_model")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class CommandModelEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Size(max = 2)
    @Column(name = "code_sas", length = 2)
    private String codeSAS;

    @ManyToOne(optional = false)
    @NotNull
    private CommandEntity command;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "manufacturer", "formula" }, allowSetters = true)
    private ModelEntity model;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public CommandModelEntity id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeSAS() {
        return this.codeSAS;
    }

    public CommandModelEntity codeSAS(String codeSAS) {
        this.setCodeSAS(codeSAS);
        return this;
    }

    public void setCodeSAS(String codeSAS) {
        this.codeSAS = codeSAS;
    }

    public CommandEntity getCommand() {
        return this.command;
    }

    public void setCommand(CommandEntity command) {
        this.command = command;
    }

    public CommandModelEntity command(CommandEntity command) {
        this.setCommand(command);
        return this;
    }

    public ModelEntity getModel() {
        return this.model;
    }

    public void setModel(ModelEntity model) {
        this.model = model;
    }

    public CommandModelEntity model(ModelEntity model) {
        this.setModel(model);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommandModelEntity)) {
            return false;
        }
        return id != null && id.equals(((CommandModelEntity) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CommandModel{" +
            "id=" + getId() +
            ", codeSAS='" + getCodeSAS() + "'" +
            "}";
    }
}

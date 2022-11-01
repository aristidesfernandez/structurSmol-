package co.com.ies.smolplus.context.moduledevicemanager.domain.commandmodel;

import java.io.Serializable;
import java.util.Objects;

import co.com.ies.smolplus.context.moduledevicemanager.domain.command.Command;
import co.com.ies.smolplus.context.moduledevicemanager.domain.model.Model;


public class CommandModel implements Serializable {

    private Long id;


    private String codeSAS;

    private Command command;

    private Model model;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeSAS() {
        return codeSAS;
    }

    public void setCodeSAS(String codeSAS) {
        this.codeSAS = codeSAS;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommandModel)) {
            return false;
        }

        CommandModel commandModelDTO = (CommandModel) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, commandModelDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CommandModel{" +
            "id=" + getId() +
            ", codeSAS='" + getCodeSAS() + "'" +
            ", command=" + getCommand() +
            ", model=" + getModel() +
            "}";
    }
}

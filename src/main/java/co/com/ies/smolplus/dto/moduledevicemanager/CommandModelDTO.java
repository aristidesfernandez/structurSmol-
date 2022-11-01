package co.com.ies.smolplus.dto.moduledevicemanager;

public class CommandModelDTO {


    private Long id;

    private String codeSAS;

    private CommandDTO command;

    private ModelDTO model;

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

    public CommandDTO getCommand() {
        return command;
    }

    public void setCommand(CommandDTO command) {
        this.command = command;
    }

    public ModelDTO getModel() {
        return model;
    }

    public void setModel(ModelDTO model) {
        this.model = model;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((codeSAS == null) ? 0 : codeSAS.hashCode());
        result = prime * result + ((command == null) ? 0 : command.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CommandModelDTO other = (CommandModelDTO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (codeSAS == null) {
            if (other.codeSAS != null)
                return false;
        } else if (!codeSAS.equals(other.codeSAS))
            return false;
        if (command == null) {
            if (other.command != null)
                return false;
        } else if (!command.equals(other.command))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CommandModelDTO [id=" + id + ", codeSAS=" + codeSAS + ", command=" + command + ", model=" + model + "]";
    }

}

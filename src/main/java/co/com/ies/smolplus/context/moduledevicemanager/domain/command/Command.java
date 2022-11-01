package co.com.ies.smolplus.context.moduledevicemanager.domain.command;

import java.io.Serializable;
import java.util.Objects;


public class Command implements Serializable {

    private Long id;
   
    private String code;
   
    private String description;
   
    private String processor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Command)) {
            return false;
        }

        Command commandDTO = (Command) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, commandDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Command{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", description='" + getDescription() + "'" +
            ", processor='" + getProcessor() + "'" +
            "}";
    }
}

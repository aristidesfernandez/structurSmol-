package co.com.ies.smolplus.context.moduledevicemanager.domain.formula;

import java.io.Serializable;
import java.util.Objects;

public class Formula implements Serializable {

    private Long id;

    private String description;

    private String expression;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Formula)) {
            return false;
        }

        Formula formulaDTO = (Formula) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, formulaDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Formula{" +
            "id=" + getId() +
            ", description='" + getDescription() + "'" +
            ", expression='" + getExpression() + "'" +
            "}";
    }
}

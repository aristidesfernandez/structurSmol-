package co.com.ies.smolplus.context.moduleusermanager.domain.useraccess;


import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;


public class UserAccess implements Serializable {

    private Long id;
   
    private String username;

    private String ipAddress;

    private ZonedDateTime registrationAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public ZonedDateTime getRegistrationAt() {
        return registrationAt;
    }

    public void setRegistrationAt(ZonedDateTime registrationAt) {
        this.registrationAt = registrationAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserAccess)) {
            return false;
        }

        UserAccess userAccessDTO = (UserAccess) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, userAccessDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "UserAccessDTO{" +
            "id=" + getId() +
            ", username='" + getUsername() + "'" +
            ", ipAddress='" + getIpAddress() + "'" +
            ", registrationAt='" + getRegistrationAt() + "'" +
            "}";
    }
}

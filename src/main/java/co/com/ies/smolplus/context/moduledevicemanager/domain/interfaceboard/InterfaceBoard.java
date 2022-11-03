package co.com.ies.smolplus.context.moduledevicemanager.domain.interfaceboard;

import java.io.Serializable;
import java.util.Objects;


public class InterfaceBoard implements Serializable {

    private Long id;

    private Boolean isAssigned;

    private String ipAddress;

    private String hash;

    private String serial;

    private String version;

    private String port;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsAssigned() {
        return isAssigned;
    }

    public void setIsAssigned(Boolean isAssigned) {
        this.isAssigned = isAssigned;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InterfaceBoard)) {
            return false;
        }

        InterfaceBoard interfaceBoardDTO = (InterfaceBoard) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, interfaceBoardDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "InterfaceBoard{" +
            "id=" + getId() +
            ", isAssigned='" + getIsAssigned() + "'" +
            ", ipAddress='" + getIpAddress() + "'" +
            ", hash='" + getHash() + "'" +
            ", serial='" + getSerial() + "'" +
            ", version='" + getVersion() + "'" +
            ", port='" + getPort() + "'" +
            "}";
    }
}

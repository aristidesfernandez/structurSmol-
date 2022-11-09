package co.com.ies.smolplus.dto.moduleestablishmentmanager;

/**
 * RI.
 * 
 * <li> Indicador registro inicial archivo operador.</li>
 */

public class ColjuegosRIDTO {

    private String fechaReporte;

    private Long nit;

    private String clave;

    private String formato;

    public String getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(String fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fechaReporte == null) ? 0 : fechaReporte.hashCode());
        result = prime * result + ((nit == null) ? 0 : nit.hashCode());
        result = prime * result + ((clave == null) ? 0 : clave.hashCode());
        result = prime * result + ((formato == null) ? 0 : formato.hashCode());
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
        ColjuegosRIDTO other = (ColjuegosRIDTO) obj;
        if (fechaReporte == null) {
            if (other.fechaReporte != null)
                return false;
        } else if (!fechaReporte.equals(other.fechaReporte))
            return false;
        if (nit == null) {
            if (other.nit != null)
                return false;
        } else if (!nit.equals(other.nit))
            return false;
        if (clave == null) {
            if (other.clave != null)
                return false;
        } else if (!clave.equals(other.clave))
            return false;
        if (formato == null) {
            if (other.formato != null)
                return false;
        } else if (!formato.equals(other.formato))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ColjuegosRIDTO [fechaReporte=" + fechaReporte + ", nit=" + nit + ", clave=" + clave + ", formato="
                + formato + "]";
    }

}

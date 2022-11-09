package co.com.ies.smolplus.dto.moduleestablishmentmanager;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * RF.
 * 
 * <li> Indicador registro final archivo operador.</li>
 */
public class ColjuegosRFDTO {

    private ZonedDateTime fechaReporte;

    private Long nit;

    private List<String> formato;

    private String totalGlogalRegistrosListaRD;

    public ZonedDateTime getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(ZonedDateTime fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public List<String> getFormato() {
        return formato;
    }

    public void setFormato(List<String> formato) {
        this.formato = formato;
    }

    public String getTotalGlogalRegistrosListaRD() {
        return totalGlogalRegistrosListaRD;
    }

    public void setTotalGlogalRegistrosListaRD(String totalGlogalRegistrosListaRD) {
        this.totalGlogalRegistrosListaRD = totalGlogalRegistrosListaRD;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fechaReporte == null) ? 0 : fechaReporte.hashCode());
        result = prime * result + ((nit == null) ? 0 : nit.hashCode());
        result = prime * result + ((formato == null) ? 0 : formato.hashCode());
        result = prime * result + ((totalGlogalRegistrosListaRD == null) ? 0 : totalGlogalRegistrosListaRD.hashCode());
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
        ColjuegosRFDTO other = (ColjuegosRFDTO) obj;
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
        if (formato == null) {
            if (other.formato != null)
                return false;
        } else if (!formato.equals(other.formato))
            return false;
        if (totalGlogalRegistrosListaRD == null) {
            if (other.totalGlogalRegistrosListaRD != null)
                return false;
        } else if (!totalGlogalRegistrosListaRD.equals(other.totalGlogalRegistrosListaRD))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ColjuegosRFDTO [fechaReporte=" + fechaReporte + ", nit=" + nit + ", formato=" + formato
                + ", totalGlogalRegistrosListaRD=" + totalGlogalRegistrosListaRD + "]";
    }

}

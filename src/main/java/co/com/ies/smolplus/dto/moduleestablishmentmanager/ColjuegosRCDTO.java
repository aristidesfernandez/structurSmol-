package co.com.ies.smolplus.dto.moduleestablishmentmanager;

import java.util.List;

/**
 * RF.
 * 
 * <li> Indicador registro inicial Local.</li>
 */
public class ColjuegosRCDTO {

    private String contrato;

    private String codigoLocal;

    private List<ColjuegosRDDTO> RD;

    private ColjuegosREDTO RE;

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getCodigoLocal() {
        return codigoLocal;
    }

    public void setCodigoLocal(String codigoLocal) {
        this.codigoLocal = codigoLocal;
    }

    public List<ColjuegosRDDTO> getRD() {
        return RD;
    }

    public void setRD(List<ColjuegosRDDTO> rD) {
        RD = rD;
    }

    public ColjuegosREDTO getRE() {
        return RE;
    }

    public void setRE(ColjuegosREDTO rE) {
        RE = rE;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contrato == null) ? 0 : contrato.hashCode());
        result = prime * result + ((codigoLocal == null) ? 0 : codigoLocal.hashCode());
        result = prime * result + ((RD == null) ? 0 : RD.hashCode());
        result = prime * result + ((RE == null) ? 0 : RE.hashCode());
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
        ColjuegosRCDTO other = (ColjuegosRCDTO) obj;
        if (contrato == null) {
            if (other.contrato != null)
                return false;
        } else if (!contrato.equals(other.contrato))
            return false;
        if (codigoLocal == null) {
            if (other.codigoLocal != null)
                return false;
        } else if (!codigoLocal.equals(other.codigoLocal))
            return false;
        if (RD == null) {
            if (other.RD != null)
                return false;
        } else if (!RD.equals(other.RD))
            return false;
        if (RE == null) {
            if (other.RE != null)
                return false;
        } else if (!RE.equals(other.RE))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ColjuegosRCDTO [contrato=" + contrato + ", codigoLocal=" + codigoLocal + ", RD=" + RD + ", RE=" + RE
                + "]";
    }
    
}

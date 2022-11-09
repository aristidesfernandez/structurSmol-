package co.com.ies.smolplus.dto.moduleestablishmentmanager;

import java.math.BigInteger;
/**
 * RE.
 * 
 * <li> Indicador registro final Local.</li>
 */
public class ColjuegosREDTO {

    private String contrato;

    private String codigoLocal;

    private BigInteger totalRD;

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

    public BigInteger getTotalRD() {
        return totalRD;
    }

    public void setTotalRD(BigInteger totalRD) {
        this.totalRD = totalRD;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contrato == null) ? 0 : contrato.hashCode());
        result = prime * result + ((codigoLocal == null) ? 0 : codigoLocal.hashCode());
        result = prime * result + ((totalRD == null) ? 0 : totalRD.hashCode());
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
        ColjuegosREDTO other = (ColjuegosREDTO) obj;
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
        if (totalRD == null) {
            if (other.totalRD != null)
                return false;
        } else if (!totalRD.equals(other.totalRD))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ColjuegosREDTO [contrato=" + contrato + ", codigoLocal=" + codigoLocal + ", totalRD=" + totalRD + "]";
    }

}

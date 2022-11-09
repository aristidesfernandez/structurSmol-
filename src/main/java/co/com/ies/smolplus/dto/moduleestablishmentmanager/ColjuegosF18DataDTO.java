package co.com.ies.smolplus.dto.moduleestablishmentmanager;

import java.util.List;

public class ColjuegosF18DataDTO {

    private ColjuegosRIDTO RI;

    private List<ColjuegosRCDTO> RC;

    private ColjuegosRFDTO RF;

    public ColjuegosRIDTO getRI() {
        return RI;
    }

    public void setRI(ColjuegosRIDTO rI) {
        RI = rI;
    }

    public List<ColjuegosRCDTO> getRC() {
        return RC;
    }

    public void setRC(List<ColjuegosRCDTO> rC) {
        RC = rC;
    }

    public ColjuegosRFDTO getRF() {
        return RF;
    }

    public void setRF(ColjuegosRFDTO rF) {
        RF = rF;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((RI == null) ? 0 : RI.hashCode());
        result = prime * result + ((RC == null) ? 0 : RC.hashCode());
        result = prime * result + ((RF == null) ? 0 : RF.hashCode());
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
        ColjuegosF18DataDTO other = (ColjuegosF18DataDTO) obj;
        if (RI == null) {
            if (other.RI != null)
                return false;
        } else if (!RI.equals(other.RI))
            return false;
        if (RC == null) {
            if (other.RC != null)
                return false;
        } else if (!RC.equals(other.RC))
            return false;
        if (RF == null) {
            if (other.RF != null)
                return false;
        } else if (!RF.equals(other.RF))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ColjuegosF18DataDTO [RI=" + RI + ", RC=" + RC + ", RF=" + RF + "]";
    }

    
}

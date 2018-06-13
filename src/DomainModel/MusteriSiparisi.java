package DomainModel;

import java.util.Date;

public class MusteriSiparisi {
    
    private String gelenSiparisID;
    private Date gelis_tarihi;
    private boolean siparis_durumu;

    public MusteriSiparisi(String gelenSiparisID, Date gelis_tarihi) {
        this.gelenSiparisID = gelenSiparisID;
        this.gelis_tarihi = gelis_tarihi;
    }

    public String getGelenSiparisID() {
        return gelenSiparisID;
    }

    public void setGelenSiparisID(String gelenSiparisID) {
        this.gelenSiparisID = gelenSiparisID;
    }

    public Date getGelis_tarihi() {
        return gelis_tarihi;
    }

    public void setGelis_tarihi(Date gelis_tarihi) {
        this.gelis_tarihi = gelis_tarihi;
    }

    public boolean isSiparis_durumu() {
        return siparis_durumu;
    }

    public void setSiparis_durumu(boolean siparis_durumu) {
        this.siparis_durumu = siparis_durumu;
    }

    
    
}

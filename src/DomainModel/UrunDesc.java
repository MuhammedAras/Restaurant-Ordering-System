package DomainModel;

public class UrunDesc {
    String urunID;
    String urunAdi;
    String urunTuru;    
    String urunFiyati;

    public UrunDesc(String urunID, String urunAdi, String urunTuru , String urunFiyati) {
        this.urunID = urunID;
        this.urunAdi = urunAdi;
        this.urunTuru = urunTuru;
        this.urunFiyati = urunFiyati;
    }

    public String getUrunFiyati() {
        return urunFiyati;
    }

    public void setUrunFiyati(String urunFiyati) {
        this.urunFiyati = urunFiyati;
    }

    public String getUrunID() {
        return urunID;
    }

    public void setUrunID(String urunID) {
        this.urunID = urunID;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUrunTuru() {
        return urunTuru;
    }

    public void setUrunTuru(String urunTuru) {
        this.urunTuru = urunTuru;
    }
}

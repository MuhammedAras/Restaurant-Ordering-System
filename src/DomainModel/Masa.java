 
package DomainModel;

public class Masa {
    private String masaID;
    private int kapasite;
    private boolean masaDurumu;

    public boolean isMasaDurumu() {
        return masaDurumu;
    }

    public void setMasaDurumu(boolean masaDurumu) {
        this.masaDurumu = masaDurumu;
    }

    public String getMasaID() {
        return masaID;
    }

    public void setMasaID(String masaID) {
        this.masaID = masaID;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }
}

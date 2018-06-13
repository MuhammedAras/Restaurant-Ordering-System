package DomainModel;

import java.util.ArrayList;

public class MusteriSiparisiKatalog {
    
    private ArrayList<MusteriSiparisi> gelen_siparisler = new ArrayList<>();
    
    public void put(MusteriSiparisi gelen_siparis) {
        gelen_siparisler.add(gelen_siparis);
    }

    public MusteriSiparisi get(String siparisID) {
        MusteriSiparisi a = null;
        for (int i = 0; i < gelen_siparisler.size(); i++) {
            a = gelen_siparisler.get(i);
            if (a.getGelenSiparisID().equals(siparisID)) {
                return a;
            }
        }
        return a;
    }

    public ArrayList<MusteriSiparisi> gelensiparisler() {
        return gelen_siparisler;
    }

    public void setAraclar(ArrayList<MusteriSiparisi> gelen_siparisler) {
        this.gelen_siparisler = gelen_siparisler;
    }

}

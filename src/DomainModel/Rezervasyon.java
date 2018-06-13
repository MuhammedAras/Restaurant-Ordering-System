 
package DomainModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rezervasyon {
    private String rezID;
    private Date rezTarihi;
    private List<Masa> rezMasalar;
    private int kapora;

    ArrayList<Rezervasyon> rezervasyonlar = new ArrayList<>();
    
    public void put (Rezervasyon r) {
        rezervasyonlar.add(r);
    }
    
    public Rezervasyon getRezervasyon(String ID) {
        Rezervasyon r = null;
        for(int i = 0;i<rezervasyonlar.size();i++) {
            if(ID.equals(rezervasyonlar.get(i).getRezID()))
                r = rezervasyonlar.get(i);
        }
        return r;
    }

    public String getRezID() {
        return rezID;
    }

    public void setRezID(String rezID) {
        this.rezID = rezID;
    }
    
    
}

 
package DomainModel;

import java.util.ArrayList;

public class MasaKatalog {
    
   private ArrayList<Masa> masalar = new ArrayList<>();
    
    public void put(Masa masa) {
        masalar.add(masa);
    }

    public Masa get(String masaID) {
        Masa a = null;
        for (int i = 0; i < masalar.size(); i++) {
            a = masalar.get(i);
            if (a.getMasaID().equals(masaID)) {
                return a;
            }
        }
        return a;
    }

    public ArrayList<Masa> masalar() {
        return masalar;
    }

    public void setAraclar(ArrayList<Masa> masalar) {
        this.masalar = masalar;
    } 
}

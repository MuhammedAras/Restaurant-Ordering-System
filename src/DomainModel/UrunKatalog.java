
package DomainModel;

import java.util.ArrayList;

public class UrunKatalog {
    
    private ArrayList<UrunDesc> urun_descs = new ArrayList<>();
    
    public void put(UrunDesc urun_desc) {
        urun_descs.add(urun_desc);
    }

    public UrunDesc getUrunDesc(String urunID) {
        UrunDesc a = null;
        for (int i = 0; i < urun_descs.size(); i++) {
            a = urun_descs.get(i);
            if (a.getUrunID().equals(urunID)) {
                return a;
            }
        }
        return a;
    }

    public ArrayList<UrunDesc> get_urun_descs() {
        return urun_descs;
    }

    public void setAraclar(ArrayList<UrunDesc> urun_descs) {
        this.urun_descs = urun_descs;
    }
}

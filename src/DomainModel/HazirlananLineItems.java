
package DomainModel;

import java.util.ArrayList;

public class HazirlananLineItems {
    
    private String hliID;
    private UrunDesc urun;
    private int adet;

    ArrayList< HazirlananLineItems > hazirlananKalemler = new ArrayList<>();
    
    public HazirlananLineItems(UrunDesc urun , int adet) {
        this.urun = urun;
        this.adet = adet;
    }
    
    public void SiparisKalemiEkle (HazirlananLineItems hli) {
        hazirlananKalemler.add(hli);
    }
}

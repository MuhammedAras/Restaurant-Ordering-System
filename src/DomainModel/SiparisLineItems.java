
package DomainModel;

import java.util.ArrayList;

public class SiparisLineItems {
    
    private String sliID;
    private UrunDesc urun;
    private int adet;

    ArrayList< SiparisLineItems > siparisKalemleri = new ArrayList<>();
    
    public SiparisLineItems(UrunDesc urun , int adet) {
        this.urun = urun;
        this.adet = adet;
    }
    
    public void SiparisKalemiEkle (SiparisLineItems sli) {
        siparisKalemleri.add(sli);
    }
    

}

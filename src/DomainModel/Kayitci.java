 
package DomainModel;

import Technical.Facade;

public class Kayitci {
    
    static public  MusteriKatalog musteriKatalog;
    public  MasaKatalog masaKatalog;
    public  UrunKatalog urunKatalog;
    public  MusteriSiparisiKatalog gelensiparisKatalog;
    public  Rezervasyon rezervasyon;
    private Facade f;
    
    SiparisOlusturmaIslemi siparisOlusturma;
    
    public Kayitci(MusteriKatalog musteriKatalog, MasaKatalog masaKatalog, UrunKatalog urunKatalog, MusteriSiparisiKatalog gelensiparisKatalog) {
        this.musteriKatalog = musteriKatalog;
        this.masaKatalog = masaKatalog;
        this.urunKatalog = urunKatalog;
        this.gelensiparisKatalog = gelensiparisKatalog;
        f = new Facade();
    }
    
    public void SiparisOlusturmaBaslat(Musteri m) {
        siparisOlusturma = new SiparisOlusturmaIslemi(m);
    }
    
}

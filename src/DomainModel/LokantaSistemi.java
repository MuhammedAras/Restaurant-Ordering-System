 
package DomainModel;

public class LokantaSistemi {
    
    private MusteriKatalog musteriKatalog = new MusteriKatalog();
    private UrunKatalog urunKatalog = new UrunKatalog();
    private MasaKatalog masaKatalog = new MasaKatalog();
    private MusteriSiparisiKatalog gelensiparisKatalog = new MusteriSiparisiKatalog();
    public Kayitci kayitci  = new Kayitci(musteriKatalog, masaKatalog, urunKatalog, gelensiparisKatalog);
    
}

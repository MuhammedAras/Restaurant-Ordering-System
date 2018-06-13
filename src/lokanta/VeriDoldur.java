
package lokanta;

import DomainModel.Kayitci;
import DomainModel.Musteri;
import DomainModel.UrunDesc;

public class VeriDoldur {
    
    Kayitci kayitci;
    
    public VeriDoldur(Kayitci kayitci) {
        this.kayitci = kayitci;
        urunDoldur();
        musteriDoldur();
        
    }
    public void urunDoldur() {
        UrunDesc u;
        u = new UrunDesc("1","Mercimek","Çorba","5");kayitci.urunKatalog.put(u);
        u = new UrunDesc("2","Ezogelin","Çorba","6");kayitci.urunKatalog.put(u);
        u = new UrunDesc("3","Yayla","Çorba","7");kayitci.urunKatalog.put(u);
        u = new UrunDesc("4","TavukSuyu","Çorba","8");kayitci.urunKatalog.put(u);
        
        u = new UrunDesc("5","Tavuk Sote","Anayemek","8");kayitci.urunKatalog.put(u);
        u = new UrunDesc("6","Musakka","Anayemek","9");kayitci.urunKatalog.put(u);
        u = new UrunDesc("7","MisketKöfte","Anayemek","8");kayitci.urunKatalog.put(u);
        u = new UrunDesc("8","YeşilBezelye","Anayemek","7");kayitci.urunKatalog.put(u);
        
        u = new UrunDesc("9","Sütlaç","Tatlı","5");kayitci.urunKatalog.put(u);
        u = new UrunDesc("10","Tiramisu","Tatlı","6");kayitci.urunKatalog.put(u);
        u = new UrunDesc("11","Kemalpaşa","Tatlı","5");kayitci.urunKatalog.put(u);
        u = new UrunDesc("12","Kazandibi","Tatlı","5");kayitci.urunKatalog.put(u);
        
        u = new UrunDesc("13","IzgaraKöfte","Izgara","13");kayitci.urunKatalog.put(u);
        u = new UrunDesc("14","KarışıkTavuk","Izgara","18");kayitci.urunKatalog.put(u);
        u = new UrunDesc("15","Kanat","Izgara","15");kayitci.urunKatalog.put(u);
        u = new UrunDesc("16","But","Izgara","12");kayitci.urunKatalog.put(u);
        
        u = new UrunDesc("17","CacaCola","İçecek","3");kayitci.urunKatalog.put(u);
        u = new UrunDesc("18","Fanta","İçecek","4");kayitci.urunKatalog.put(u);
        u = new UrunDesc("19","Gazoz","İçecek","2");kayitci.urunKatalog.put(u);
        u = new UrunDesc("20","Limonata","İçecek","5");kayitci.urunKatalog.put(u);
        
        u = new UrunDesc("21","ÇobanSalata","Salata","10");kayitci.urunKatalog.put(u);
        u = new UrunDesc("22","PatatesSalata","Salata","12");kayitci.urunKatalog.put(u);
        u = new UrunDesc("23","DiyetSalata","Salata","9");kayitci.urunKatalog.put(u);
        u = new UrunDesc("24","yazSalata","Salata","8");kayitci.urunKatalog.put(u);
    }
    public void musteriDoldur() {
        Musteri m;
        m = new Musteri();m.setIsim("Muhammed");m.setSoyisim("Aras");m.setMusteriID("2");m.setParola("2");kayitci.musteriKatalog.put(m);
        m = new Musteri();m.setIsim("Şahin");m.setSoyisim("Ataman");m.setMusteriID("1");m.setParola("1");kayitci.musteriKatalog.put(m);        
    }
}

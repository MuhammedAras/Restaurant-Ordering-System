package Technical;

import DomainModel.Masa;
import DomainModel.Musteri;
import DomainModel.MusteriSiparisi;
import DomainModel.Rezervasyon;
import DomainModel.UrunDesc;

public class Facade {
    
    IMapper mapper;

    public void getMapper(Object object) {

        if (object == Musteri.class) {
            mapper = new MusteriMapper();
        } 
        else if (object == MusteriSiparisi.class) {
            mapper = new MusteriSiparisiMapper();
        }
        else if (object == Masa.class) {
            mapper = new MasaMapper();
        }
        else if (object == Rezervasyon.class) {
            mapper = new RezervasyonMapper();
        }
        else if (object == UrunDesc.class) {
            mapper = new UrunDescMapper();
        }
        
    }

    public Object get(String OID, Object object) {
        getMapper(object);
        return mapper.get(OID);
    }

    public void put(String OID, Object object) {
        getMapper(object.getClass());
        mapper.put(OID, object);
    }
}

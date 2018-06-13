
package Technical;

import DomainModel.Kayitci;
import DomainModel.Musteri;
import UserInterface.MainCenter;

public class MusteriMapper implements IMapper{
    Kayitci kayitci = MainCenter.kayitci;

    @Override
    public Object get(String OID) {
        return kayitci.musteriKatalog.getMusteri(OID);
    }

    @Override
    public void put(String OID, Object obj) {
        kayitci.musteriKatalog.put((Musteri) obj);
    }
}

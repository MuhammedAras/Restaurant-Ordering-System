
package Technical;

import DomainModel.Kayitci;
import DomainModel.Masa;
import UserInterface.MainCenter;

public class MasaMapper implements IMapper{
    Kayitci kayitci = MainCenter.kayitci;

    @Override
    public Object get(String OID) {
        return kayitci.masaKatalog.get(OID);
    }

    @Override
    public void put(String OID, Object obj) {
        kayitci.masaKatalog.put((Masa) obj);
    }
}


package Technical;

import DomainModel.Kayitci;
import DomainModel.MusteriSiparisi;
import UserInterface.MainCenter;

public class MusteriSiparisiMapper implements IMapper{
    Kayitci kayitci = MainCenter.kayitci;

    @Override
    public Object get(String OID) {
        return kayitci.gelensiparisKatalog.get(OID);
    }

    @Override
    public void put(String OID, Object obj) {
       kayitci.gelensiparisKatalog.put((MusteriSiparisi) obj);
    }
    
}


package Technical;

import DomainModel.Kayitci;
import DomainModel.Rezervasyon;
import UserInterface.MainCenter;

public class RezervasyonMapper implements IMapper{

    Kayitci kayitci = MainCenter.kayitci;
    
    @Override
    public Object get(String OID) {
        return kayitci.rezervasyon.getRezervasyon(OID);
    }

    @Override
    public void put(String OID, Object obj) {
        kayitci.rezervasyon.put((Rezervasyon)obj);
    }
    
}


package Technical;

import DomainModel.Kayitci;
import DomainModel.UrunDesc;
import UserInterface.MainCenter;

public class UrunDescMapper implements IMapper{
    
    Kayitci kayitci = MainCenter.kayitci;
    
    @Override
    public Object get(String OID) {
       return kayitci.urunKatalog.getUrunDesc(OID);
    }

    @Override
    public void put(String OID, Object obj) {
       kayitci.urunKatalog.put((UrunDesc) obj);
    }
    
}

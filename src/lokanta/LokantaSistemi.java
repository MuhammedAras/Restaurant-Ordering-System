
package lokanta;
import UserInterface.AnaSayfa;
import UserInterface.MainCenter;

public class LokantaSistemi {

    
    public static void main(String[] args) {
        new VeriDoldur(MainCenter.kayitci);
        new AnaSayfa().setVisible(true);
    }
    
}

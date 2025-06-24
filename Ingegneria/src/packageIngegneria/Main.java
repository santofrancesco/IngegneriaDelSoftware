package packageIngegneria;

import pack.Campanello;
import pack.CampanelloAdapter;
import pack.CampanelloTriplo;

public class Main {
	
    public static void main(String[] args) {
//        Campanello campanello1 = CampanelloFactory.creaCampanello("classico");
//        campanello1.suona();
//
//        Campanello campanello2 = CampanelloFactory.creaCampanello("digitale");
//        campanello2.suona();
//        
//        Campanello campanello3 = CampanelloFactory.creaCampanello("triploClassico");
//        campanello3.suona();
        
    	var campanello = CampanelloFactory.creaCampanello("triploDigitale");
        CampanelloAdapter campanelloAdatto = new CampanelloAdapter(campanello);
        campanelloAdatto.suonaTriplo();
        		
    }
}

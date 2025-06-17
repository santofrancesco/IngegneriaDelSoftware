package packageIngegneria;

import pack.Campanello;

public class Main {
	
    public static void main(String[] args) {
        Campanello campanello1 = CampanelloFactory.creaCampanello("classico");
        campanello1.suona();

        Campanello campanello2 = CampanelloFactory.creaCampanello("digitale");
        campanello2.suona();
    }
}

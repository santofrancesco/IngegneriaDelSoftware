package packageIngegneria;

import pack.Campanello;
import pack.CampanelloClassico;
import pack.CampanelloDigitale;

public class CampanelloFactory {

	public static Campanello creaCampanello(String tipo) {
		switch(tipo.toLowerCase()) {
		case "classico":
			return new CampanelloClassico();
		case "digitale":
			return new CampanelloDigitale();
		default:
            throw new IllegalArgumentException("Tipo di campanello non supportato: " + tipo);
		}
	}
}

package packageIngegneria;

import pack.Campanello;

public class CampanelloFactory {

	public static Campanello creaCampanello(String tipo) {
		switch(tipo.toLowerCase()) {
		case "classico":
			return new CampanelloClassico();
		case "digitale":
			return CampanelloDigitale();
		default:
            throw new IllegalArgumentException("Tipo di campanello non supportato: " + tipo);
		}
	}
}

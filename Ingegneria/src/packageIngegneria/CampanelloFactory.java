package packageIngegneria;

import pack.Campanello;
import pack.CampanelloAdapter;
import pack.CampanelloClassico;
import pack.CampanelloDigitale;
import pack.CampanelloTriplo;

public class CampanelloFactory {
	

	public static Campanello creaCampanello(String tipo) {
		switch(tipo) {
		case "classico":
			return new CampanelloClassico();
		case "digitale":
			return new CampanelloDigitale();
		case "triploClassico":
			return new CampanelloAdapter(new CampanelloClassico());
		case "triploDigitale":
			return new CampanelloAdapter(new CampanelloDigitale());
		default:
            throw new IllegalArgumentException("Tipo di campanello non supportato: " + tipo);
		}
	}
}

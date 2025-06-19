package pack;

public class CampanelloAdapter implements Campanello, CampanelloTriplo {

	Campanello tr;
	public CampanelloAdapter(Campanello tr) {
		this.tr=tr;
	}
	@Override
	public void suonaTriplo() {
		tr.suona();
		tr.suona();
		tr.suona();	
	}
	@Override
	public void suona() {
		this.suonaTriplo();	
	}

}

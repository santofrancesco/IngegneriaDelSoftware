package packageIngegneria;

public class Main {

	public static void main(String[] args) {

		Campanello camp1 = new Campanello("camp1", "Ding Dong");
		String suono1 = camp1.suona();
		System.out.println(suono1);
	}

}

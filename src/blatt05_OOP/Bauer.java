package blatt05_OOP;

public class Bauer {
	private String name;
	private static int anzahlGefuetterterHuhner = 0;
	private int anzahlHungrigerHuehner = 0;
	
	public Bauer(String name) {
		this.name = name;
	}

	public boolean futtern(Huhn huhn) {

		if (huhn.getHungrig() == true) {
			anzahlGefuetterterHuhner += 1;
			System.out.println("fuettern...");
			return huhn.setHungrig(false);
		} else {
			System.out.println("Ist schon einaml gefueterrt!");
		}
		return huhn.setHungrig(false);
	}

	public void rufeHuhn(Huhn huhn) {
		System.out.println(huhn.getName());
	}
	public void berechneAnzahlHungrigerHuehner(Huhn huhn1) {
		anzahlHungrigerHuehner = huhn1.getAnzahlHuehner() - anzahlGefuetterterHuhner;
		System.out.println(anzahlHungrigerHuehner);
	}
	
	
}

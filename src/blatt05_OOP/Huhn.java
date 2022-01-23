package blatt05_OOP;

public class Huhn {
	private String name;
	private boolean hungrig;
	private static int anzahlHuehner = 0;

	public Huhn(String name) {
		Huhn.erhoehungUm1();
		this.name = name;
		this.setHungrig(true);
	}

	public String getName() {
		return this.name;
	}

	public boolean setHungrig(boolean hungrig) {
		this.hungrig = hungrig;
		return hungrig;
	}

	public boolean getHungrig() {
		return this.hungrig;
	}

	public int getAnzahlHuehner() {
		return this.anzahlHuehner;
	}

	public static int erhoehungUm1() {
		return anzahlHuehner += 1;
	}

}

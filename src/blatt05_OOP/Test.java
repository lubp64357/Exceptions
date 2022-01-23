package blatt05_OOP;

public class Test {
	public static void main(String[] args) {
		Bauer walter = new Bauer("Walter");
		Huhn h1 = new Huhn("Heidrun");
		Huhn h2 = new Huhn("Heike");
		Huhn h3 = new Huhn("Hannelore");
		Bauer krisy = new Bauer("Krisi");
		walter.futtern(h2);
		walter.rufeHuhn(h1);
		walter.futtern(h3);
		krisy.futtern(h3);
		walter.berechneAnzahlHungrigerHuehner(h1);

	}

}

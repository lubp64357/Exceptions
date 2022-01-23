package blatt05_Raum;

/** Klasse mit Konstruktor, um Vollst�ndigkeit der Daten sicherzustellen */
public class RaumV3 {
	String kuerzel;		
	int anzahlPlaetze;		
	boolean hatAudio;	
	
	/** Konstruktor */
	RaumV3(String kuerzel, int anzahl){
		this.setKuerzel(kuerzel);
		this.setAnzahlPlaetze(anzahl);
	}
	
	/** Alternativer Konstruktor mit Audioangabe */
	RaumV3(String kuerzel, int anzahl, boolean audio){
		this(kuerzel, anzahl);	// Aufruf des Konstruktors mit 2 Parametern
		this.hatAudio = audio;
	}
	
	/** Alternativer Konstruktor: K�rzel aus  K�rzel f�r Geb�udenamen und Raumnummer bauen
	 *  @param gebaeudeKuerzel K�rzel des Geb�udes, z.B. "E", "F", "SH", "LI"
	 *  @param anzahlPlaetze Anzahl der Pl�tze in diesem Raum
	 *  */
	RaumV3(String gebaeudeKuerzel, int raumnummer, int anzahlPlaetze){
		this.setKuerzel(gebaeudeKuerzel + " " + raumnummer);
		this.setAnzahlPlaetze(anzahlPlaetze);
	}

	public void print() {
		System.out.print("K�rzel: " + this.kuerzel); 
		System.out.print(", Pl�tze: " + this.anzahlPlaetze);
		if (this.hatAudio) {
			System.out.print(", mit Audio");	
		}
		else {
			System.out.print(", ohne Audio");	
		}
	}
	
	public void setAnzahlPlaetze(int plaetze) {
		final int MINIMUM = 1;
		if(plaetze < MINIMUM) {
			System.err.println("Die Anzahl der Pl�tze muss gr��er als " + (MINIMUM - 1) + 
					" sein, ist aber " + plaetze + ". Leider " + (MINIMUM -plaetze) + " zu wenig. " );
		} // TODO Pr�fung gegen Maximum 
		else {
			this.anzahlPlaetze = plaetze;
		}
			
	}
	
	public void setKuerzel(String kuerzel) {
		int MINIMALE_ANZAHL_ZEICHEN = 3;
		if(null == kuerzel) {
			System.err.println("Das K�rzel darf nicht null sein!" );
		}
		else if (kuerzel.length() < MINIMALE_ANZAHL_ZEICHEN) {
			System.err.println("Das K�rzel muss mindestens " + MINIMALE_ANZAHL_ZEICHEN + " Zeichen haben!" );
		}
		else {
			this.kuerzel = kuerzel;
		}
	}

	public static void main(String[] a) {
		// Ein Objekt der Klasse RaumV3 mit K�rzel und Sitzzahl instanziieren
		RaumV3 f = new RaumV3("E 301", 52); // RaumV3 f = new RaumV3() geht nicht mehr!
		f.print();	

		// Aufruf des 1. alternativen Konstruktors:
		RaumV3 h = new RaumV3("E 201", 77, true /* gibt's Audio?*/);
		System.out.println("\n");
		h.print();

		// Aufruf des 2. alternativen Konstruktors:
		RaumV3 g = new RaumV3("Rektorat", 102, 14);
		System.out.println("\n");
		g.print();
	}
}

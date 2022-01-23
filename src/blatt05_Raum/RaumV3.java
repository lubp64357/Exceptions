package blatt05_Raum;

/** Klasse mit Konstruktor, um Vollständigkeit der Daten sicherzustellen */
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
	
	/** Alternativer Konstruktor: Kürzel aus  Kürzel für Gebäudenamen und Raumnummer bauen
	 *  @param gebaeudeKuerzel Kürzel des Gebäudes, z.B. "E", "F", "SH", "LI"
	 *  @param anzahlPlaetze Anzahl der Plätze in diesem Raum
	 *  */
	RaumV3(String gebaeudeKuerzel, int raumnummer, int anzahlPlaetze){
		this.setKuerzel(gebaeudeKuerzel + " " + raumnummer);
		this.setAnzahlPlaetze(anzahlPlaetze);
	}

	public void print() {
		System.out.print("Kürzel: " + this.kuerzel); 
		System.out.print(", Plätze: " + this.anzahlPlaetze);
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
			System.err.println("Die Anzahl der Plätze muss größer als " + (MINIMUM - 1) + 
					" sein, ist aber " + plaetze + ". Leider " + (MINIMUM -plaetze) + " zu wenig. " );
		} // TODO Prüfung gegen Maximum 
		else {
			this.anzahlPlaetze = plaetze;
		}
			
	}
	
	public void setKuerzel(String kuerzel) {
		int MINIMALE_ANZAHL_ZEICHEN = 3;
		if(null == kuerzel) {
			System.err.println("Das Kürzel darf nicht null sein!" );
		}
		else if (kuerzel.length() < MINIMALE_ANZAHL_ZEICHEN) {
			System.err.println("Das Kürzel muss mindestens " + MINIMALE_ANZAHL_ZEICHEN + " Zeichen haben!" );
		}
		else {
			this.kuerzel = kuerzel;
		}
	}

	public static void main(String[] a) {
		// Ein Objekt der Klasse RaumV3 mit Kürzel und Sitzzahl instanziieren
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

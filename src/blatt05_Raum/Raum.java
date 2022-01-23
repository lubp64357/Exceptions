package blatt05_Raum;

/** "Normale" Klasse f�r R�ume, mit Konstruktoren, Settern und Gettern */
public class Raum {
	private String kuerzel;			// z.B. "E 201"
	private int anzahlPlaetze;		// wie viele Personen passen rein?
	private boolean hatAudio;		// gibt es eine Audioanlage?
	
	/** Konstruktor */
	public Raum(String kuerzel, int anzahlPlaetze){
		this.setKuerzel(kuerzel);
		this.setAnzahlPlaetze(anzahlPlaetze);
	}
	/** Alternativer Konstruktor mit Audioangabe */
	Raum(String kuerzel, int anzahlPlaetze, boolean hatAudio){
		this(kuerzel, anzahlPlaetze);	// Aufruf des Konstruktors mit 2 Parametern
		this.hatAudio = hatAudio;
	}
	
	/** Alternativer Konstruktor: K�rzel aus  K�rzel f�r Geb�udenamen und Raumnummer bauen
	 *  @param gebaeudeKuerzel K�rzel des Geb�udes, z.B. "E", "F", "SH", "LI"
	 *  @param anzahlPlaetze Anzahl der Pl�tze in diesem Raum
	 *  */
	Raum(String gebaeudeKuerzel, int raumnummer, int anzahlPlaetze){
		this.setKuerzel(gebaeudeKuerzel + " " + raumnummer);
		this.setAnzahlPlaetze(anzahlPlaetze);
	}
	
	/** Einen Raum am Bildschirm ausgeben */
	public void print() {
		System.out.print("K�rzel: " + this.getKuerzel() );
		System.out.print(", Pl�tze: " + this.getAnzahlPlaetze() );
		System.out.print(", Pl�tze bei Klausur: " + this.getAnzahlPlaetzeBeiKlausur() );
		if (this.hatAudio) {
			System.out.print(", mit Audio");	
		}
		else {
			System.out.print(", ohne Audio");	
		}
	}
	
	/** Anzahl der Pl�tze setzen */
	public void setAnzahlPlaetze(int plaetze) {
		final int MINIMUM = 1;
		final int MAXIMUM = 80;
		if(plaetze < MINIMUM || plaetze > MAXIMUM) {
			System.err.println("Die Anzahl der Pl�tze muss gr��er als " + 
					(MINIMUM - 1) + "  und kleiner als " + (MAXIMUM + 1) +" sein." );
		} // TODO Pr�fung gegen Maximum 
		else {
			this.anzahlPlaetze = plaetze;
		}
	}
	
	/** Anzahl der Pl�tze zur�ckgeben */
	public int getAnzahlPlaetze() {
		return this.anzahlPlaetze;
	}
	/** Anzahl der Pl�tze bei Klausuren zur�ckgeben */
	public int getAnzahlPlaetzeBeiKlausur() {
		int freiePlaetzeJePruefling = 2;
		return this.getAnzahlPlaetze() / (1 + freiePlaetzeJePruefling);
	}
	
	/** K�rzel setzen */
	public void setKuerzel(String kuerzel) {
		final int MINIMALE_ANZAHL_ZEICHEN = 2;
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
	/** K�rzel zur�ckgeben. Konvention: nur in Gro�buchstaben, egal, was in der Instanzvariable steht */
	public String getKuerzel() {
		return this.kuerzel.toUpperCase();
	}
	
	/** Audio setzen */
	public void setHatAudio(boolean hatAudio) {
		this.hatAudio = hatAudio;
	}

	/** Audio holen */
	public boolean getHatAudio() {
		return this.hatAudio;
	}

	public static void main(String[] a) {
		// Ein Objekt der Klasse Raum mit Geb�ude-K�rzel, Nummer und Sitzzahl instanziieren
		Raum f = new Raum("LI", 136, 20);
		f.setHatAudio( true );
		f.print();	
	}
	
}

package blatt05_Raum;

/** Klasse mit Vermeidung von falschen Daten durch Setter-Methoden */
public class RaumV2 {
	String kuerzel;		
	int anzahlPlaetze;		
	boolean hatAudio;	
	
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
		final int MINIMUM = 1; // minimale Platzanzahl
		if(plaetze < MINIMUM) {
			System.err.println("Die Anzahl der Pl�tze muss gr��er als " + (MINIMUM - 1) + 
					" sein, ist aber " + plaetze + ". Leider " + (MINIMUM -plaetze) + " zu wenig. " );
			// Ende des Semester werden Exceptions vorgestellt, die besser sind zur Fehlerbehandlung ...
		}
		else {
			this.anzahlPlaetze = plaetze;
		}
			
	}

	public void setKuerzel(String kuerzel) {
		int MINIMALE_ANZAHL_ZEICHEN = 3;
		if(null == kuerzel) {
			System.err.println("\nDas K�rzel darf nicht null sein!" );
		}
		else if (kuerzel.length() < MINIMALE_ANZAHL_ZEICHEN) {
			System.err.println("\nDas K�rzel muss mindestens " + MINIMALE_ANZAHL_ZEICHEN + " Zeichen haben!" );
		}
		else {
			this.kuerzel = kuerzel;
		}
			
	}

	public static void main(String[] a) {
		// Ein Objekt der Klasse RaumV2 instanziieren 
		RaumV2 f = new RaumV2();
		// Werte setzen:
		f.setKuerzel("E 302");
		f.setAnzahlPlaetze(1);
		// Am Bildschirm ausgeben: 
		f.print();	 

		f.setAnzahlPlaetze(77);
		System.out.println("\n");
		f.print();	 
		
		f.setKuerzel(null); // -> Fehlermeldung
	}

}
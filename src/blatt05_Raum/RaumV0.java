package blatt05_Raum;

/** Einfache Datenklasse für die Daten von Räumen (unschön, unsicher, aber einfach).  */
public class RaumV0 { 
	String kuerzel;			// z.B. "E 201"
	int anzahlPlaetze;		// wie viele Personen passen rein?
	boolean hatAudio;		// gibt es eine Audioanlage?
}

class V0Tests{
	/* Tests/Beispiele in main: */
	public static void main(String[] a) {
		// Ein Objekt der Klasse instanziieren (bauen, anlegen)
		RaumV0 h = new RaumV0(); // Jetzt ist Platz im Speicher für die Daten
		// Am Bildschirm ausgeben: 
		System.out.print("Kürzel: " + 
				h.kuerzel /* Komponentenzugriff mit "."-Operator */); 
		System.out.print(", Plätze: " + h.anzahlPlaetze);
		System.out.println(", Audio: " + h.hatAudio);
		// Ausgabe: Kürzel: null, Plätze: 0, Audio: false
		
		// Werte setzen:
		h.kuerzel = "E 201";
		h.anzahlPlaetze = 77;
		h.hatAudio = true;
		// Am Bildschirm ausgeben: 
		System.out.print("Kürzel: " + h.kuerzel);
		System.out.print(", Plätze: " + h.anzahlPlaetze);
		System.out.println(", Audio: " + h.hatAudio);
		// Ausgabe: Kürzel: E 201, Plätze: 77, Audio: true
		

		// Und noch ein Objekt der Klasse instanziieren 
		RaumV0 f = new RaumV0();
		// Werte setzen:
		f.kuerzel = "E 302";
		f.anzahlPlaetze = -17;
		// Am Bildschirm ausgeben: 
		System.out.print("Kürzel: " + f.kuerzel);
		System.out.print(", Plätze: " + f.anzahlPlaetze);
		System.out.println(", Audio: " + f.hatAudio);	
	}
}
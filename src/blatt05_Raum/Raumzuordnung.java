package blatt05_Raum;
import k04_types.Person;
/** Beispiel f�r Referenzen: Klasse f�r Mitarbeiter-Raumzuordnung */
public class Raumzuordnung {
	private Raum raum;		// Referenz auf Raum
	private Person nutzer;	// Referenz auf Nutzer/in
	private String grundFuerDieZuordnung; // Grund f�r Zuordnung (z.B. "B�roraum", "Labor") als Zeichenkette erg�nzen.
	// TODO Grund f�r Zuordnung (z.B. "B�roraum", "Labor") als Zeichenkette erg�nzen. 
	//		Darf nicht NULL sein und muss mindestens aus 3 Zeichen bestehen. 
	//		Bitte auch passende Zugriffsmethode und zus�tzlichen Konstruktor 
	//		mit Zuordnungsgrund hinzuf�gen.
	
	
	/** Konstruktor */
	public Raumzuordnung(Raum raum, Person nutzer) {
		// TODO: pr�fen, dass jeweils nicht null
		if(raum== null || nutzer == null) {
			System.err.println("Das Raum oder das Nutzer darf nicht null sein!");
		} else {
		this.raum = raum; this.nutzer = nutzer;
		}
	}
	
	public Raumzuordnung(Raum raum, Person nutzer, String grundFuerDieZuordnung) {
		this(raum, nutzer);
		this.setGrundFuerDieZuordnung(grundFuerDieZuordnung);
	}
	
	public void print() {
		this.getNutzer().print();
		System.out.print(" nutzt den Raum: ");
		this.getRaum().print();
		System.out.println(" als " + getGrundFuerDieZuordnung());
	}
	
	Raum getRaum() {
		return this.raum;
	}
	
	Person getNutzer() {
		return this.nutzer;
	}
	
	public void setGrundFuerDieZuordnung(String grundFuerDieZuordnung) {
		
			this.grundFuerDieZuordnung = grundFuerDieZuordnung;
	}
	
	public String getGrundFuerDieZuordnung() {
		final int MINIMALE_ANZAHL_ZEICHEN =3;
		if(null == grundFuerDieZuordnung) {
			System.err.println(" (Das Grund fuer die Zuordnung darf nicht null sein!)" );
		} else if(grundFuerDieZuordnung.length() <= MINIMALE_ANZAHL_ZEICHEN ) {
			System.err.println(" (Das Grund fuer die Zuordnung muss mindestens " + MINIMALE_ANZAHL_ZEICHEN + " Zeichen haben!)" );
		} 
		return this.grundFuerDieZuordnung;
	}
	public static void main(String[] a) { 
		// Br�ckl nutzt den Raum E 212a
		Person ub = new Person("Ulrich", "Br�ckl");
		Raum e212a = new Raum("e 212a", 2);
		Raumzuordnung ub2e212a = new Raumzuordnung(e212a, ub,"Labor");
		ub2e212a.print();	

		// Br�ckl nutzt au�erdem den Raum E 201
		Raumzuordnung ub2e201 = new Raumzuordnung(
				new Raum("e 201", 77, true), // keine Zwischenvariable f�r e201 n�tig...
				ub);
		// Den Raum dieser Zuordnung ausgeben:
		System.out.print("\n     Au�erdem: ");
		ub2e201.getRaum().print();
		System.out.println("\n");
		
		// Vogelsang nutzt den Raum E 209
		Raumzuordnung hv2e209 = new Raumzuordnung(
				new Raum("e 209", 3),
				new Person("Holger", "Vogelsang"), "");
		hv2e209.print();
		
	}

}
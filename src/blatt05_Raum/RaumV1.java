package blatt05_Raum;

/** Die obige Klasse RaumV0 "funktioniert" zwar, hat aber erhebliche M�ngel:
<ol>
	<li>Das Drucken am Bildschirm wiederholt sich immer wieder: 
		Viel Tipparbeit, viele Fehlerm�glichkeiten, englische true/false-Begriffe 
		-> Druckmethode bauen (Klasse RaumV1)</li>
	<li>Es k�nnen Objekte entstehen, die falsche Werte haben, z.B. negative Platzanzahlen 
		-> setter-Methode, die das pr�ft (Klasse RaumV2)</li>
	<li>Es k�nnen Objekte entstehen, die leer/unvollst�ndig sind: Konstruktor bauen, 
		der Parameter beim Anlegen eines Objektes pr�ft (Klasse RaumV3)</li>
	<li>Es fehlt ein gesicherter Zugriff auf die Daten 
		-> Getter-Methoden hinzuf�gen (Klasse Raum)</li>
</ol>
*/
public class RaumV1 {
String kuerzel;			
int anzahlPlaetze;		
boolean hatAudio;		

/** Einen Raum am Bildschirm ausgeben */
public void print() {
	System.out.print("K�rzel: " + this.kuerzel); // this: das aktuelle Objekt, zu dem die Methode geh�rt
	System.out.print(", Pl�tze: " + this.anzahlPlaetze);
	if (this.hatAudio) {
		System.out.print(", mit Audio");	
	}
	else {
		System.out.print(", ohne Audio");	
	}
}
public static void main(String[] a) {
	// Ein Objekt der Klasse RaumV1 instanziieren 
	RaumV1 f = new RaumV1();
	// Werte setzen:
	f.kuerzel = "E 302";
	f.anzahlPlaetze = -17;
	// Am Bildschirm ausgeben: 
	f.print();	 // ruft die print-Methode mit den Daten von f auf 
}

}

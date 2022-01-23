package blatt05_Raum;

/** Die obige Klasse RaumV0 "funktioniert" zwar, hat aber erhebliche Mängel:
<ol>
	<li>Das Drucken am Bildschirm wiederholt sich immer wieder: 
		Viel Tipparbeit, viele Fehlermöglichkeiten, englische true/false-Begriffe 
		-> Druckmethode bauen (Klasse RaumV1)</li>
	<li>Es können Objekte entstehen, die falsche Werte haben, z.B. negative Platzanzahlen 
		-> setter-Methode, die das prüft (Klasse RaumV2)</li>
	<li>Es können Objekte entstehen, die leer/unvollständig sind: Konstruktor bauen, 
		der Parameter beim Anlegen eines Objektes prüft (Klasse RaumV3)</li>
	<li>Es fehlt ein gesicherter Zugriff auf die Daten 
		-> Getter-Methoden hinzufügen (Klasse Raum)</li>
</ol>
*/
public class RaumV1 {
String kuerzel;			
int anzahlPlaetze;		
boolean hatAudio;		

/** Einen Raum am Bildschirm ausgeben */
public void print() {
	System.out.print("Kürzel: " + this.kuerzel); // this: das aktuelle Objekt, zu dem die Methode gehört
	System.out.print(", Plätze: " + this.anzahlPlaetze);
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

package blatt07;

public class TernarySalutation {
	/**
	 * Alle möglichen Grußformeln ausgeben 
	 */
	private static void testSalutation() {
		boolean bools[] = {true, false};
		for(boolean firstNameBase : bools) {
			for(boolean signature : bools) {
				System.out.println("\n..........<Mail-Text>..........\n"); // Platzhalter  
				System.out.println(salutation(firstNameBase, signature, "Kim", "May", "Raum E502\nTel.: 01234/567890"));
				System.out.println("\n"); // Abstand zur uebersichtlichen Ausgabe 
			}
		}
	}
	
	/**
	 * Grußformeln abhängig vom Bekanntheitsgrad und wahlweise mit oder ohne Signatur ausgeben
	 * @return Grußformeln
	 * @param onFirstNameBase Per-Du?
	 * @param signature Signatur anfügen?
	 * @param given	Vorname
	 * @param name Nachname
	 * @param signatureText Signatur
	 */
	static String salutation(boolean onFirstNameBase, boolean signature, String given, String name, String signatureText)
	{	
		return (onFirstNameBase ? signature ? 
				new String("Viele Gruesse \n" + given + "___________________\n" + signatureText): // ja,ja
				new String("Viele Gruesse \n" + given) : signature ? //ja,nein
				new String("Mit freundlichen Grüßen \n" + given + " "+ name + "___________________\n" + signatureText): //nein,ja
				new String("Mit freundlichen Grüßen \n" + given + " "+ name + "___________________\n")); // nein,nein
		 // TODO

	}
	
	public static void main(String[] args) {
		testSalutation();							
	}
}
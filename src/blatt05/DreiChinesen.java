package blatt05;

import java.lang.StringBuilder;

public class DreiChinesen {
	static final String text = "Drei Chinesen mit dem Kontrabass\n" + "sa�en auf der Stra�e und erz�hlten sich was.\n"
			+ "Da kam ein Mann: Ja was ist denn das?\n" + "Drei Chinesen mit dem Kontrabass.\n\n";

	/**
	 * Einen Text zentriert ausgeben. Es gen�gt eine L�sung f�r nichtproportionale
	 * Schriftarten.
	 * 
	 * @param text Text mit mehreren Zeilen (durch '\n' abgetrennt)
	 */
	static void printCentered(String text) {
		// Text im einen Array teilen
		String[] textArray = text.split("\n");
		// eine Variable fur die laengste Zeile  implementieren 
		int maxLength = textArray[0].length();
		// mit for-Schleife ueberpruefen, Welche ist das laengste Zeile
		for (int i = 0; i < textArray.length; i++) {
			if (textArray[i].length() > maxLength) {
				maxLength = textArray[i].length();
			}
		}
		//eine for-Schleife fuer die neue Zeilen 
		for (int i = 0; i < textArray.length; i++) {
			// neue Variable fuer das Platz vor der Zeile
			int beforeString = (maxLength - textArray[i].length()) / 2;
			// mit StringBuilder ein neues Array machen
			StringBuilder stringBuilder = new StringBuilder(textArray[i]);
			// stringBuilder.insert(offset, " "(was muss konkatiniert werden).repeat(wie oft))
			stringBuilder.insert(0, " ".repeat(beforeString));
			System.out.println(stringBuilder.toString());

		}
		System.out.println();
	}

	/**
	 * Vokale in Text ersetzen.
	 * 
	 * @param text        Text mit Vokalen
	 * @param replacement Ersatz f�r Vokale
	 * @return Text mit ge�nderten Vokalen
	 */
	static String changeVowels(String text, String replacement) {
		// Ein Array mit alle Vokale
		final String[] volwels = { "e", "a", "i", "o", "u", "y", "�", "�", "�" };
		//for-Schleife um alle Vokalen zu ver�ndern
		for(int i = 0;i < volwels.length; i++) {
		text = text.replaceAll(volwels[i].toString(), replacement);
		}
		return text; // TODO
	}

	public static void main(String[] args) {
		DreiChinesen.printCentered(text);
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "i"));
		DreiChinesen.printCentered(DreiChinesen.changeVowels(text, "�"));
	}

}
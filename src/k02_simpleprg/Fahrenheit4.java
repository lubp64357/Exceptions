
// Datei Fahrenheit4.java
package k02_simpleprg;

public class Fahrenheit4 {
	/**
	 * Geg.: Temperaturbereich in °F <br/>
	 * Ges.: Temperaturliste in °C
	 * 
	 * @param args
	 *            unused
	 */
	public static void main(String[] args) {

		final int UPPER = 250; // obere Grenze
		final int LOWER =   0; // untere Grenze
		final int STEP  =  25; // Schrittweite
		final int NUM_PER_ROW = 5;
		int i =1;
		for (int fahrenheit = LOWER; fahrenheit <= UPPER; fahrenheit = fahrenheit + STEP)
			//    Initialisierung  ; Bedingung          ; Fortsetzung: Schleifenvariable erhoehen			
		{	if(i %NUM_PER_ROW==0) {
			int celsius = 5 * (fahrenheit - 32) / 9;
			System.out.println(fahrenheit + "°F = " + celsius + "°C" + "	");
			i++;
		} 
		else 
			{
			int celsius = 5 * (fahrenheit - 32) / 9;
			System.out.print(fahrenheit + "°F = " + celsius + "°C" + "	");
			i++;
		}
		}
	}
}

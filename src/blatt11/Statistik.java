package blatt11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;

import blatt11.customexceptions.EmptyElementException;
import blatt11.customexceptions.EmptyStatisticException;
import blatt11.customexceptions.InvalidCharacterException;

/** Klasse, um Mittelwert zu berechnen
 * 
 * @author Ulrich.Broeckl@hs-karlsruhe.de 
 *
 */
public class Statistik{
 	private double summe;

	protected double n;
	
	String name;
	
	
	/** Konstruktor 
	 * @param name Identifikator/Name für die Statistik
	 */
	public Statistik(String name) throws RuntimeException{
//		if(this.name == "") {
//			throw new NullPointerException();
//		} else {
		this.name = name;
		this.summe = 0.;
		this.n = 0.;
	}
//		}
	
	/** Einen neuen Wert der Statistik hinzufügen
	 * 
	 * @param wert+
	 */
	public void addWert(double wert) {
		this.n++;
		this.summe += wert;
	}

	/**
	 * Durchschnitt berechnen
	 * @return Durchschnitt aller Werte
	 */
	double getDurchschnitt() throws RuntimeException {
		if(this.n==0.0) {
			throw new ArithmeticException();
		}else {
		return this.summe / this.n;}
	}
	
	/** Statistik in Zeichenkette ausgeben
	 * 
	 */
	@Override
	public String toString() throws RuntimeException {
		if (this.name == null) {
			throw new NullPointerException("Name of statistic must not be null");
		} else if (this.n == 0.) {
			throw new EmptyStatisticException("Empty statistic cannot be serialized.");
		} else if (this.name.length() == 0) {
			throw new EmptyElementException("Name of statistic must not be empty.");
		} else if (!Character.isLetter(this.name.charAt(0))) {
			throw new InvalidCharacterException("Name of statistic must start with a letter.");
		} else {
			return String.format("%12s: n==%10.0f, µ==%8f", this.name, this.n, this.getDurchschnitt());
		}

	}
	
	
	/** Statistik in Datei mit dem Namen der Statistik und der Endung ".statistik" ausgeben
	 * @throws RuntimeException 
	 * @throws IOException 
	 * @see https://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-it-in-java
	 */
	public void writeToFile() throws RuntimeException, IOException {
		if(this.name== null) {
			throw new IOException();
		} else {
		Files.write(Paths.get(this.name + ".statistik"), this.toString().getBytes());}
	}

}
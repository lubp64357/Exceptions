package blatt04;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Zusatzaufgabe: Klasse für das Zeichnen von Sternen entlang einer Spirale. Wir
 * leiten diesesmal von LoesungZufallsSterne ab, um die Methode
 * zeichneEinenStern wiederverwenden zu können.
 */
public class LoesungSterneAufSpirale extends LoesungZufallsSterne {
	int startX = this.getWidth() / 2;
	int startY = this.getHeight() / 3;
	int startR = this.getWidth() / 48;

	/** Konstruktor. Nichts zu ändern hier */
	public LoesungSterneAufSpirale() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1024, 768);
		this.setTitle("Lösung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu ändern hier. */
	public static void main(String[] args) {
		new LoesungSterneAufSpirale();

	}

	/**
	 * Bitte ab hier Lösung zum Zeichnen der Sterne auf der Spirale entwickeln.
	 */
	public void paint(Graphics g) {
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		this.spiraleSterne(g);
	}

	public void spiraleSterne(Graphics g) {
		int index =1;

		for (int numOfStars = 1; numOfStars <= 13; numOfStars++) {

			do {
				upRight(g);
				index++;

			} while (1 <= index && index < 3);

			do {
				upLeft(g);
				++index;

			} while (3 <= index && index <= 4);

			do {
				downLeft(g);
				++index;

			} while (5 <= index && index <= 8);
			do {
				downRight(g);
				++index;

			} while (9<= index && index <= 10);

			do {
				upRight(g);
				++index;

			} while (11 <= index && index <= 13);
		}
	}

	private void upLeft(Graphics g) {
		startY -= startR;
		startX -= startR;
		startR += 7;
		super.star(g, startX, startY, startR);
	}

	private void upRight(Graphics g) {
		startY -= startR;
		startX += startR;
		startR += 7;
		super.star(g, startX, startY, startR);
	}

	private void downRight(Graphics g) {
		startX += startR;
		startY += startR;
		startR += 7;
		super.star(g, startX, startY, startR);
	}

	private void downLeft(Graphics g) {
		startX -= startR;
		startY += startR;
		startR += 7;
		super.star(g, startX, startY, startR);
	}

}

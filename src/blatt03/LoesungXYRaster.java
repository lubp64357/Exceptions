package blatt03;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.text.AttributeSet.ColorAttribute;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungXYRaster extends JFrame {

	/** Konstruktor. Nichts zu ändern hier */
	public LoesungXYRaster() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(604, 417);
		this.setTitle("Lösung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu ändern hier. */
	public static void main(String[] args) {
		new LoesungXYRaster();
	}

	/**
	 * Paint-Methode. Nichts zu ändern hier. Diese Methode wird beim Öffnen des
	 * Fensters automatisch aufgerufen. Die Methode wird auch aufgerufen, wenn die
	 * Größe des Fensters verändert wird.
	 * 
	 * @param g Grafik, auf die gezeichnet wird.
	 */
	public void paint(Graphics g) {
		/* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
		g.clearRect(0, 0, this.getWidth(), this.getHeight());

		this.meinRaster(g); // Aufruf der selbst programmierten Methode
	}

	/**
	 * Hier bitte die Lösung, um das Raster zu zeichnen
	 * 
	 */
	public void meinRaster(Graphics g) {
		// TODO
		int x25 = this.getWidth() / 4; // x-Koordinate bei 25% der Fensterbreite (von links)
		int x75 = this.getWidth() * 3 / 4; // x-Koordinate bei 75% der Fensterbreite (von links)
		int y25 = this.getHeight() / 4; // y-Koordinate bei 25% der Fensterbreite (von oben)
		int y75 = this.getHeight() * 3 / 4; // y-Koordinate bei 75% der Fensterbreite (von oben)
		int xstart;
		int ystart;

		// TODO: Komplettes Rechteck zeichnen
		g.drawLine(x75, y25, x25, y25);
		g.drawLine(x25, y25, x25, y75);
		g.drawLine(x25, y75, x75, y75);
		g.drawLine(x75, y25, x75, y75);

		for (int i = 1; i <= 10; i++) {
			xstart = x25 + this.getWidth() * i / 20;
			if (i % 2 == 0) {
				g.setColor(Color.BLACK);
				g.drawLine(xstart, y25, xstart, y75);
			} else {
				g.setColor(Color.GRAY);
				g.drawLine(xstart, y25, xstart, y75);
			}
		}

		for (int i = 1; i <= 10; i++) {
			ystart = y25 + this.getHeight() * i / 20;
			if (i % 2 == 0) {
				g.setColor(Color.BLACK);
				g.drawLine(x25, ystart, x75, ystart);
			} else {
				g.setColor(Color.GRAY);
				g.drawLine(x25, ystart, x75, ystart);
			}
		}

	}
}

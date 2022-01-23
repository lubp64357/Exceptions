package blatt04;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse für das Zeichnen eines Sterns
 */
public class LoesungStern extends JFrame {

	/** Konstruktor. Nichts zu ändern hier */
	public LoesungStern() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 400);
		this.setTitle("Lösung in der Klasse " + this.getClass().getName());
		this.setVisible(true);
	}

	/** Main-Methode. Nichts zu ändern hier. */
	public static void main(String[] args) {
		new LoesungStern();
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

		this.myStar(g); // Aufruf der selbst programmierten Methode
	}

	/**
	 * Hier bitte die Lösung, um den Stern zu zeichnen
	 * 
	 */
	
	public void myStar(Graphics g) {
		// TODO

		paintMyStar(g);
	}

	private void paintMyStar(Graphics g) {
		int midX = this.getWidth() / 2;
		int midY = this.getHeight() / 2;
		float phi;
		int r = this.getHeight()/4;
		
		for (int i = 0; i < 40; i+=2) {
			
			phi =  (float) (2 * Math.PI * i / 40);
			
			g.setColor(Color.BLUE);
			g.drawLine(midX, midY, (int) (Math.cos(phi) * r + midX),
					(int) (Math.sin(phi) * r + midY));
			}
		
		for(int i= 1;i<40;i+=2) {
			
			phi =  (float) (2 * Math.PI * i / 40);
			g.setColor(Color.RED);
			g.drawLine(midX, midY, (int) (Math.cos(phi) * r / 2 + midX),
					(int) (Math.sin(phi) * r / 2 + midY));
		
		}
	}
}

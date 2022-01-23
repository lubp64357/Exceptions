package blatt03;

import java.awt.*;
import javax.swing.JFrame;

/**
 * Klasse, um ein Raster zu malen
 */
public class LoesungKegel extends JFrame {

    /** Konstruktor. Nichts zu ändern hier */
    public LoesungKegel(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(610,417);
        this.setTitle("Lösung in der Klasse " + this.getClass().getName()); 
        this.setVisible(true);
    }

    /** Main-Methode. Nichts zu ändern hier. */
    public static void main(String[] args){
    	new LoesungKegel();
    }
   
    /** Paint-Methode. Nichts zu ändern hier. Diese Methode 
     *  wird beim Öffnen des Fensters automatisch aufgerufen. 
     *  Die Methode wird auch aufgerufen, wenn die Größe des Fensters
     *  verändert wird. 
     *  @param g Grafik, auf die gezeichnet wird.
     *  */
    public void paint(Graphics g){
    	/* Löschen des Fensterinhalts (wichtig bei erneutem Zeichnen): */
    	g.clearRect(0, 0, this.getWidth(), this.getHeight());
    	
    	
    	this.meinKegel(g); // Aufruf der selbst programmierten Methode
    }
   
	/** 
	 * Hier bitte die Lösung, um den Kegel zu zeichnen
	 * 
	 */
   public void meinKegel(Graphics g){
	   // TODO
	   int x25 = this.getWidth() / 4; // x-Koordinate bei 25% der Fensterbreite (von links)
		int x75 = this.getWidth() * 3 / 4; // x-Koordinate bei 75% der Fensterbreite (von links)
		int y25 = this.getHeight() / 4; // y-Koordinate bei 25% der Fensterbreite (von oben)
		int y75 = this.getHeight() * 3 / 4; // y-Koordinate bei 75% der Fensterbreite (von oben)
		int xstart;
		int ystart;
		int lines= 41;

		// TODO: Komplettes Kegel
		g.drawLine(x75, y25, x25, y25);
		g.drawLine(x25, y75, x75, y75);
		g.drawLine(x25,y25,x75,y75);
		g.drawLine(x25,y75,x75,y25);
		double schrittWeite = (double) (x75 - x25) / (double)lines;
		for(int i=1; i<=lines;i++) {
			xstart =(int) (x25 +  i*schrittWeite);
			ystart = (int)(x75 - i* schrittWeite);
			
		g.setColor(Color.GRAY);
		g.drawLine(xstart,y25,ystart,y75);
		}
   } 
}
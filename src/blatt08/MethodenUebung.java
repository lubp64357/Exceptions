package blatt08;

public class MethodenUebung {
	public static void main(String[] args) {
		MethodenUebung t = new MethodenUebung();
		System.out.println("Betrag");
		System.out.println(t.betrag(-5));
		System.out.println("Abrunden");
		System.out.println(t.abrunden(2.34));
		System.out.println("Aufrunden");
		System.out.println(t.aufrunden(2.34));
		System.out.println("Teiler");
		t.rest(3, 2);
		System.out.println("Distanz");
		System.out.println(t.distanz(-4, 1, 2, 5));
		System.out.println("Kleinste");
		System.out.println(t.kleinste(2,2, 3));
		
	}
	
	private double betrag(double z) {
		z = z<0 ? -z: z;
		return z;
	}
	private int aufrunden(double z) {
		if(z % 1 == 0) {
		return (int) z;
		}	return (int) z+1;
		
	}
	private int abrunden(double z) {
		return (int) z;
	}
	private void rest(int z, int teiler) {
		if(z % teiler == 0) {
			System.out.println(teiler + " teilt " + z);
		} else {
			System.out.println(teiler + " teilt "+ z + "nicht.");
		}
	}
	private double distanz(int x1,int y1,int x2, int y2) {
		double dist = 0;
		dist = Math.sqrt(Math.pow((x1-x2), 2)+ Math.pow((y1-y2),2));
		return dist;
	}
	private int kleinste(int a, int b, int c) {
		if(a<=b && a<=c) {
			return a;
		}
		else if(b<=c && b<=a) {
			return b;
		} else {
			return c;
		}
	}
	

}

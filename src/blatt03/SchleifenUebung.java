package blatt03;

public class SchleifenUebung {
	public static void main(String[] args) {
		System.out.println("Alle Quadratzahlen von -4 ... 4 in 0.5er-Schritten:");
		for(double i =-4;i<=4;i+=0.5) {
			System.out.println("x, x^2: " + i + ", " + Math.pow(i, 2));
		}
		
		System.out.println("Alle Sinus, Cosinus von -4 ... 4 in 0.5er-Schritten:");
		for(double i =-4;i<=4;i+=0.5) {
			System.out.println("x, sin(x), cos(x):" + i +", "+ Math.sin(i) + ", " + Math.cos(i));
		}
	}
}

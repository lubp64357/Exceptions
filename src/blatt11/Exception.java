package blatt11;

public class Exception {
	/**
	* Zwei Werte dividieren
	* @param z, Zahl die dividiert wird (Zähler)
	* @param n, Zahl durch die dividiert wird (Nenner)
	* @return z / n
	*/
	public static int div(int z, int n) {
	return z / n;
	}
	public static void main(String[] args) {
		try {
			div(1,0);
		} catch(ArithmeticException ae ) {
			System.out.println("Fehlergrund: "+ ae.getMessage());
			ae.printStackTrace();
			
		}
		
	}

}

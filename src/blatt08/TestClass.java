package blatt08;

public class TestClass {
	public static void main(String[] args) {
		System.out.println("1. Aufgabe");
		prt1234(5);
		System.out.println("2. Aufgabe");
		prtSqr1234(5);
		System.out.println("3. Aufgabe");
		prt2468(7);
		System.out.println("4. Aufgabe");
		xxx(5);
		
	}
	
	
	static long prt1234(long n) {
		if(n>1)
			prt1234(n-1);
			System.out.println(n);
			return n;
		 
	 }
	static long prtSqr1234(long n) {
			
		 if(n>1)
			prtSqr1234(n-1);
		 	System.out.println(n*n);
		 	return n*n;
		 	
		 
		
	}
	public static long prt2468(long n) {
		
		if(n % 2 == 0 && n >=2) {
			
			prt2468(n-2);
			System.out.println(n);
			return n;
		} else if(n >=2) { 
			
			prt2468(n-3);
			System.out.println(n-1);
			return n;
		} else 
			return 0;
	}
	 public static void xxx(long n) {

		 while (n>0L) {
			 System.out.println(n--);
		 };
	

	 }
}

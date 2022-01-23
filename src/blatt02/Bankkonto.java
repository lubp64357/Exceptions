package blatt02;

import java.util.Scanner;

public class Bankkonto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihr Startguthaben ein:");
		double startguthaben = sc.nextDouble();
		System.out.println("Bitte geben Sie den Zinssatz (in %) ein:");
		double zins = sc.nextDouble();
		System.out.println("Bitte geben Sie die Laufzeit (in Jahren) ein:");
		int laufzeit = sc.nextInt();
		double erhoehung = 1000.00;
		for (int i = 1; i <= laufzeit; i++) {
			startguthaben = startguthaben * zins / 100 + startguthaben;
			startguthaben = startguthaben + erhoehung;
			System.out.println("Guthaben nach dem " + i + ". Jahr: " + startguthaben);
		}
	}
}

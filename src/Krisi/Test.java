package Krisi;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter how many passengers you will add.");
		int numberOfPassengers=sc.nextInt();
		Passenger[] passengers= new Passenger[numberOfPassengers];
		
		for(int i = 0; i < numberOfPassengers; i ++){
			
		System.out.println("Please, enter information about the passenger "+ (i+1) +" (age and true/false if the passenger has ticket).");
		
		int age = sc.nextInt();
		boolean haveTicket = sc.nextBoolean();
		
		passengers[i] = new PassengerWithValidTicket( age, haveTicket);	
				
		}

		for(int i = 0; i < numberOfPassengers; i ++){
			System.out.println("Passenger number: " + (i+1));
			if(passengers[i].CalculateTicketPrice() == -1) {}
			else 
				System.out.println("The price of ticket number " + (i + 1) + " is " + passengers[i].CalculateTicketPrice() + "leva.");
		}

				
				
		System.out.println("Please, enter how many are the wagons of the train.");
		
		int numberOfWagons = sc.nextInt();
		
		Train train = new Train(numberOfWagons);
		
		for(int i = 0; i < numberOfWagons; i ++){
		train.wagons[i] = new Wagon(numberOfPassengers);
		}
		
		for(int i = 0; i < numberOfWagons; i ++){
		
		for(int y = 0; y < numberOfPassengers; y ++){	
		train.wagons[i].addPassenger(passengers[y]);
		}	
		
		}
	    
		for(int i = 0; i < numberOfWagons; i ++){
			
		for(int y = 0; y < numberOfPassengers; y ++){
		train.wagons[i].Sort();
		}	
		
		}

		System.out.println("Please, enter the number of drivers.");
		int numberOfDrivers = sc.nextInt();

		Driver[] drivers= new Driver[numberOfDrivers];
		
		for(int i = 0; i < numberOfDrivers; i ++){
		System.out.println("Please, enter the name of the driver:");
		String name = sc.next();
		drivers[i] = new Driver(name);
		}
		sc.close();
	
		for(int i = 0; i < numberOfDrivers; i ++){
		train.addDriver(drivers[i]);
		}
		
		}
		
	

}

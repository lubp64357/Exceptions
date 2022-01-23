package Krisi;

public class Train {

public int NumberOfWagons=5;	
public String number;
public Wagon[] wagons= new Wagon[NumberOfWagons];
 int i = 0;

public Train(){}
public Train(int n){
	this.NumberOfWagons = n;
}
public Train(int n, String number){
	this.NumberOfWagons = n;
	this.number = number;
}

public void addWagon(Wagon wagon) throws IndexOutOfBoundsException{
try{
wagons[i] = wagon;
i++;
}
catch(IndexOutOfBoundsException ex){
System.out.println("Can't be added more wagons.");
}
}

 int y = 0;
public Driver[] drivers = new Driver[2];

public void addDriver(Driver driver) throws IndexOutOfBoundsException{
	try{
	drivers[y] = driver;
	y++;	
	}
	catch(IndexOutOfBoundsException ex){
	System.out.println("The drivers are enough.");
	}
}

}
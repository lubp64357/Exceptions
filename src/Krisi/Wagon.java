package Krisi;

import java.util.regex.*;

public class Wagon  {
	
	public int capacity = 50;	
	
	public void setCapacity(int c){
		this.capacity=c;
	}
	public int getCapacity(){
		return this.capacity;
	}
	
	public  Passenger[] passengers= new Passenger[capacity];
	int i = 0;
	
	public Wagon(){}
	public Wagon(int c){
		this.capacity = c;
	}
	public Wagon(Wagon wagon){
		this.capacity = wagon.capacity;
		this.passengers = wagon.passengers;
	}
	
	public void addPassenger(Passenger passenger) throws IndexOutOfBoundsException {
		try{
			if(passenger.CalculateTicketPrice()!=-1){
				passengers[i] = passenger;
				i++;	
			}
			else{
				System.out.println("This passenger can't be added...");
			}
		}
		catch(IndexOutOfBoundsException ex){
			System.out.println("There aren't more seats. Sorry!");
		}
	}
	
	public void FindPassenger(String re) {
		Pattern p = Pattern.compile(re);	
		for(int y = 0; y < capacity; y ++){
			Matcher m = p.matcher((CharSequence) passengers[y]);
			boolean b = m.matches();
			if(b == true){
				System.out.println(passengers[y]);
			}
		}
	}
	
	public void Sort(){
	Passenger Temp;
	for(int i = 0;i < capacity; i ++ ){
		for(int j = 1; j < capacity-i; j ++){
			if(this.passengers[j-1].name.compareTo(passengers[j].name) >= 1){
				Temp=passengers[j-1];
				passengers[j-1]=passengers[j];
				passengers[j]=Temp;	
			}
			if(passengers[j-1].name.compareTo(passengers[j].name) <= -1){	
			}
		}	
	}
	for(int i = 0; i < capacity; i ++){
		System.out.println(passengers[i]);
	}
	}
	
}

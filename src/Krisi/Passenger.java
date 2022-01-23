package Krisi;

public abstract class Passenger implements Comparable<Passenger> {
public String name;

public Passenger(){}
public Passenger(String name){
this.name = name;
}

public abstract int CalculateTicketPrice();

public void setName(String name){
this.name = name;
}

public String getName(){
return this.name;
}

@Override
public int compareTo(Passenger passenger){
return this.name.compareTo(passenger.name);
}

}
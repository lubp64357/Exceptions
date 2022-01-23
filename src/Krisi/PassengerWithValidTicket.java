package Krisi;

public class PassengerWithValidTicket extends Passenger implements     TicketCheck{

    boolean hasTicket = true;
    public int numberOfTicket = 0;
    public int age;

    public void setAge(int age){
    this.age = age;
    }

    public int getAge(){
    return this.age;
    }

    public void setHaveTicket(boolean haveTicket){
    this.hasTicket = haveTicket;
    }

    public PassengerWithValidTicket(){
    super();
    }

    public PassengerWithValidTicket( String name, int age, boolean haveTicket){
    this.name = name;
    this.age = age;
    this.hasTicket = haveTicket;
    }

    public PassengerWithValidTicket( int age, boolean haveTicket){
    this.age = age;
    this.hasTicket = haveTicket;
    }

    public PassengerWithValidTicket(PassengerWithValidTicket passenger){
    this.name = passenger.name;
    this.age = passenger.age;
    this.hasTicket = passenger.hasTicket;
    }

    @Override
    public int AllowAccess(){
    if(hasTicket == false){
    System.out.println("You can't enter without a ticket. You have to buy one.");
    return -1;
    }
    else{
    System.out.println("You can go inside. Have a nice trip!");
    return 1;
    }

    }

    @Override
    public int CalculateTicketPrice(){
    if(AllowAccess() == 1){
        if(age > 60) return 6;
        if (age <= 18 && age >= 7) return 10;
        if(age < 7) return 0;
        else return 12;
    }
    else{
    return 0;
    }

    }

}
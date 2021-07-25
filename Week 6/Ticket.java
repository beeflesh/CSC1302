/*Name: Savannah Smalley
Date: 7/18/21
Panther ID: 002-57-8974
Description: This code's purpose is to describe the behavior of the abstract Ticket class for it's use as
a parent class for StudentAdvanceTicket.java, AdvanceTicket.java, and WalkupTicket.java.
 */
//because it is abstract, we cannot implement Ticket by itself, but that's okay because the task
//does not ask us to.
public abstract class Ticket {
    //each ticket has a number and price
    int number;
    double price;
    //constructor for ticket
    public Ticket(int num){
        number=num;
    }
    //abstract getPrice() method that we don't have to define for Ticket.java (but that we will
    //have to specify in subclasses of Ticket.java)
    public abstract double getPrice();
    //getter for number
    public int getNum(){
        return number;
    }
    //toString to show string representation of the ticket and it's price.
    public String toString(){
        return "Number: "+number+", Price: "+getPrice();
    }
}

/*Name: Savannah Smalley
Date: 7/18/21
Panther ID: 002-57-8974
Description: StudentAdvanceTicket.java describes the behavior of the StudentAdvanceTicket object which
is a subclass of AdvanceTicket which is a subclass of Ticket.
 */
//extending from parent class AdvanceTicket
public class StudentAdvanceTicket extends AdvanceTicket{
    //ticket has a price that gets established after the ticket has been constructed with num of days
    double price;
    //constructor, supers the number and number of days from the parent class
    public StudentAdvanceTicket(int num,int days) {
        super(num,days);
    }
    //if the days are greater than 10, price is 15.0
    //else the StudentAdvanceTicket is 20.0.
    public double getPrice(){
        if(daysInAdvance>=10){
            return price=15.0;
        }else{
            return price=20.0;
        }
    }
    //toString for the string representation.
    public String toString(){
        return "Number: "+getNum()+", Price: "+getPrice()+" (ID required)";
    }
}

/*Name: Savannah Smalley
Date: 7/18/21
Panther ID: 002-57-8974
Description: AdvanceTicket.java describes the behavior of the AdvanceTicket object which
is a subclass of Ticket.
 */
//extending from the parent class
public class AdvanceTicket extends Ticket{
    //AdvanceTickets have a daysInAdvance variable that controls the price later on in getPrice()
    double price;
    int daysInAdvance;
    //constructor, supering the num from Ticket
    public AdvanceTicket(int num,int days) {
        super(num);
        daysInAdvance=days;
    }
//getPrice() returns different price values dependant on how many days in advance it is constructed with
    public double getPrice(){
        //if more than 10, price is 30.0
        if (daysInAdvance>=10){
            return price=30.0;
        }else{
            //else price is 40.0
            return price=40.0;
        }
    }
}

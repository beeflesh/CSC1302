/*Name: Savannah Smalley
Date: 7/18/21
Panther ID: 002-57-8974
Description: WalkupTicket.java describes the behavior of the WalkupTicket object which
is a subclass of Ticket.
 */
//extending from parent class
public class WalkupTicket extends Ticket{
    //encapsulated double price
   private double price;
   //constructor supering num from Ticket.java, setting price to 50.0
    public WalkupTicket(int num){
        super(num);
        price=50.0;
    }
    //getter for price
    public double getPrice(){
        return price;
    }
}

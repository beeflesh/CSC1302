/*Name: Savannah Smalley
Date: 7/18/21
Panther ID: 002-57-8974
Description: ticketClient.java allows us to show the application of the Ticket object as well
as it's subclasses
 */
//class start
public class ticketClient {
    //start of main()
    public static void main(String[] args) {
        //declarations of the tickets
        WalkupTicket test = new WalkupTicket(5);
        StudentAdvanceTicket test2= new StudentAdvanceTicket(6,9);
        AdvanceTicket test3 = new AdvanceTicket(7,13);
        //testing their toString methods
        System.out.println(test.toString());
        System.out.println(test2.toString());
        System.out.println(test3.toString());
    }
}

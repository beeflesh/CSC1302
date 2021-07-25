/*Name: Savannah Smalley
Date: 7/11/21
Panther ID: 002-57-8974
Description: This code is meant to sort through an accounts[] array of PaypalAccount objects to determine
the largest balance, average balance, and lowest balance. Using my panther number, we can also alter
certain array elements to hold the desired value.
 */
//imported for use of random and scanner
import java.util.*;
//class start
public class Bank {
    //start of main()
    public static void main(String[] args) {
        //abcOfPanther holds the number value of the first 3 digits of my panther ID
        // (002)
        int abcOfPanther=2;
        //largestBal will start at 0.0 so any account balance over that
        //will reassign it.
        double largestBal=0.0;
        //lowestBal starts higher than any value that can be achieved so that
        //the next lowest balance will reassign it.
        double lowestBal=99999;
        //these ID variables will hold the ID number of the largest balance and lowest balance
        int largestID=0;
        int lowestID=0;
        //declaration of random object
        Random fate = new Random();
        //declaration of scanner object
        Scanner console = new Scanner(System.in);
        //user prompt
        System.out.println("How many accounts would you like to create?");
        //user determines length of the accounts[] array with numOfAmount
        int numOfAmount=console.nextInt();
        //array is created with desired length
        PaypalAccount[] accounts = new PaypalAccount[numOfAmount];
        //sum will help us find the average later on.
        double sum=0;
        //for loop to run through the array and declare the PaypalAccount objects
        //with a random balance in the range of 0.0-1000.0 for each
        for (int i=0;i<numOfAmount;i++){
            accounts[i]= new PaypalAccount((1000.0)*fate.nextDouble());
            //if the ID of the account at i is equal to the abcOfPanther variable,
            //it will set the balance to the given value (which is the last 5 digits of
            //my panther id divided by 100)
            if (accounts[i].getID()==abcOfPanther){
                accounts[i].setBalance(789.74);
            }
            //if current balance is greater than largest balance, largest balance gets reassigned
            if (accounts[i].getBal()>largestBal){
                largestBal=accounts[i].getBal();
                largestID=accounts[i].getID();
                //if current balance is lower than lowest balance, lowest balance gets reassigned
            }else if (accounts[i].getBal()<lowestBal){
                lowestBal=accounts[i].getBal();
                lowestID=accounts[i].getID();
            }
            //sum adds all the balance values together each iteration
            sum+=accounts[i].getBal();
        }
        //if the ID value of abcOfPanther is not included in the array, it will set
        //the ID of the last element in the array equal to abcOfPanther and transfers
        //the balance of the first account to this last one.
        if (abcOfPanther>numOfAmount){
            accounts[numOfAmount-1].setID(abcOfPanther);
            accounts[numOfAmount-1].setBalance(accounts[0].getBal());
        }
        //Here all our printing happens.
        System.out.println("My Panther ID is 002-57-8974; my bank account id is 002 and balance is $789.74");
        //printing average
        System.out.printf("The average balance is: $%.2f",(sum/numOfAmount));
        //printing largest balance with its ID
        System.out.printf("\nThe account with the largest balance: accountID = "+largestID+", balance = $%.2f",largestBal);
        //printing lowest balance with its ID
        System.out.printf("\nThe account with the lowest balance: accountID = "+lowestID+", balance = $%.2f",lowestBal);
    }
}

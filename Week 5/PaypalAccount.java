/*Name: Savannah Smalley
Date: 7/11/21
Panther ID: 002-57-8974
Description: Describes the behavior of the PaypalAccount object for its use in Bank.java
 */
public class PaypalAccount {
//instance variables
    private double balance;
    private static int accountID=0;
//constructor for no parameters
    public PaypalAccount(){
        balance=0.0;
        //accountID will just go up by one when each account is created so
        //each account has a unique accountID
        accountID++;
    }
    //constructor to set balance
    public PaypalAccount(double bal){
        //balance is equal to whatever the PaypalAccount object is declared with
        balance=bal;
        accountID++;
    }
    //returns the number ID
    public int getID(){
        return accountID;
    }
    //returns a string to represent the ID (so that if something is number 9, it will
    //print as 009 etc)
    public String printID(){
        if (accountID<10){
            return "00"+accountID;
        }else if(accountID<100){
            return "0"+accountID;
        }else{
        return accountID+"";
        }
    }
    //returns the double balance of the given account
    public double getBal(){
        return balance;
    }
    //sets the balance to a given amount
    public double setBalance(double amount){
        return balance=amount;
    }
    //sets the ID to a given value
    public int setID(int given){
        return accountID=given;
    }
}

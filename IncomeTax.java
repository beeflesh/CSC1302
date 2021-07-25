/* Created by Savannah Smalley on 6/17/21

    The purpose of this code is to randomly generate the amount of input desired (1-15), then to assign that many
     income values and determine the corresponding tax and display the highest tax amount.
 */
//imported for use of Scanner
import java.util.*;
//Start of class
public class IncomeTax {
    //Start of main
    public static void main(String[] args) {
        //Declaration of the Scanner
        Scanner input = new Scanner(System.in);
        //Declaration of the Random object
        Random rand = new Random();
        //randomNum holds a random value from 1-15
        int randomNum = rand.nextInt(15)+1;
        //a double array is then declared using the length of that randomNum value
        double[] taxes = new double[randomNum];
        //this variable "i" will increment up in order to reach different elements in the array
        int i=0;
        //While randomNum is greater than or equal to 1
        // (it will increment down after each loop to execute
        // the number of times the randomNum had selected)
        while (randomNum>=1) {
            //Prompt
            System.out.println("Please enter the incomes of "+randomNum+" people: ");
            //The user's answer gets stored in income
            int income = input.nextInt();
            //The array taxes[] stores the tex values of all the incomes.
            //determineTax is it's own method to calculate the tax
            taxes[i] =determineTax(income);;
            //i increments up so that the corresponding position in the array is correct
            i++;
            randomNum--;
        }
        //Printing the tax amounts
        System.out.println("The tax amounts are as follows: ");
        //the value of j just runs through all the array elements positions
        for (int j =0;j<= taxes.length-1;j++) {
            System.out.print(+taxes[j] +", ");
        }
        //Here the array gets sorted from least to greatest
        Arrays.sort(taxes);
        //The we just print out the last element in the array.
        System.out.println("and the highest tax amount is: "+taxes[taxes.length-1]);
    }
    //This method determines the amount of tax for each income (income being passed as the parameter)
    public static double determineTax(int income) {
        //tax will hold the tax amount of the given income
        double tax;
        //Each if, if/else, and else statement contains the equations given on the task chart and
        // the returns that tax value to the main()
        if (income>8000) {
            tax = 230 + (income-8000)*.06;
        } else if (income>5000) {
            tax = 142.50 + (income - 5000) * .05;
        }else if (income>2500) {
            tax = 82.5+(income-2500)*.04;
        } else if (income>=750) {
            tax = 7.5+(income-750)*.02;
        } else {
            tax = income*.01;
        }
        return tax;
    }
}

/*Name: Savannah Smalley
Date: 7/12/21
Panther ID: 002-57-8974
Description: This code's purpose is to declare a Fraction array of specific length and to multiply each
pair of elements together, printing each resulting fraction as it goes.
 */
//imported for use of random
import java.util.*;
//start of class
public class MultiplyClient {
    //start of main()
    public static void main(String[] args) {
        //Declaration of random object
        Random fate = new Random();
        //Declaration of the fraction array of length 7 (because last digit of panther number
        //is 4 so 4+3=7)
        Fraction[] fractions = new Fraction[7];
        //for loop to create the Fraction objects in the array, setting each
        //numerator and denominator to a random int between 1 and 10.
        for(int i=0;i<fractions.length;i++){
            fractions[i]= new Fraction(fate.nextInt(10)+1, fate.nextInt(10)+1);
        }
        //for loop to multiply each pair of elements together. Since multiplying each
        //pair of 7 elements will result in 6 fractions, we change the condition of the
        //for loop to match this.
        for(int i=0;i<fractions.length-1;i++){
            //we call both the FractionMultiply() method for the math, and toString() to print
            //the String representation.
            System.out.println(fractions[i].FractionMultiply(fractions[i],fractions[i+1]).toString());
        }
    }
}

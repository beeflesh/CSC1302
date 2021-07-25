/* Created by Savannah Smalley on 6/19/21

    The purpose of this code is to count the digits in a given user input and display those values
    to the user until the user enters 0 or a negative number.
 */

//imported so I can use Scanner
import java.util.*;
//Start of class
public class RepeatedDigits {
//Start of main
    public static void main(String[] args) {
        //Scanner declaration
        Scanner input = new Scanner(System.in);
        //number will hold the value the user inputs
        int number=0;
        //digit will represent the current digit being evaluated in the while loop.
        int digit;
        //Start of the first while loop. Here the user is prompted, the value is assigned to the number
        //variable, and then each digit of the value will be evaluated in the second while loop.
        while (number>=0) {
            //This array will hold the occurrences of each digit for each value entered
            int[] occurrences = new int[10];
            //User is prompted
            System.out.println("Please enter a number: ");
            //number gets assigned by Scanner
            number = input.nextInt();
            //if number is just 0, we exit the while loop.
            if (number==0) {
                break;
            }
            //if the number is greater than 0, we isolate the digits with the modulous operation
            //the for loop runs through each digit value and if the value of i is equal to the digit, the
            //corresponding occurrence array value will go up by one.
            //Then, the number is divided by ten to reach the next digit in the number. This continues till number
            //reaches 0.
            while (number>0) {
                digit = number%10;
                for (int i=0;i<=9;i++) {
                    if (digit==i) {
                        occurrences[i]++;
                    }
                }
                number/=10;
            }
            //Here we just print the possible digits with proper spacing
            System.out.print("\t  Digit:\t0\t1\t2\t3\t4\t5\t6\t7\t8\t9\n");
            //Here the occurrence[] array values get printed + proper spacing
            System.out.print("Occurrences:\t");
            for(int i=0;i<=9;i++) {
                System.out.print(occurrences[i]+"\t");
            }
            System.out.println();
        }
        //This is what the user reaches if they enter 0 as the number.
        System.out.println("You have exited the program.");
    }
}

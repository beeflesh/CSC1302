/* Code created by Savannah Smalley
    Code created on 6/14/21

    The purpose of this code is to swap each pair of digits or letters dependant on user input.
 */

//Here I imported the * utility in order to use Scanner
import java.util.*;

//Class start
public class Swap {

    //Here is the main
    public static void main(String[] args) {
        //declaring the Scanner
        Scanner console = new Scanner(System.in);
        //Prompting user for input
        System.out.println("Please input a string to be swapped: ");
        //input gets stored in response2
        String response2 = console.nextLine();
        //Here we call the method that swaps the letters and print the result
        System.out.println(swapLetterPairs(response2));
        //Here we prompt the user for the digits to be swapped
        System.out.println("Please input a number to be swapped: ");
        // here we store that answer into response1
        int response1 = console.nextInt();
        // Here we print the result from the swapDigitPairs method
        System.out.println(swapDigitPairs(response1));



    }

    //Here is the start of the swapLetterPairs method starts here
    public static String swapLetterPairs(String m) {
        // Here we convert the string to a character array
        char[] ch = m.toCharArray();
        // This for-loop is where the swapping happens
        for (int i = 0; i < ch.length - 1; i += 2) {

            // placeholder will hold the value of ch[i] so that
            // both digits don't become the same one when swapped
            char placeholder = ch[i];
            // Here the character at position [i] will be replaced by ch[i+1] (the next value)
            ch[i] = ch[i + 1];
            ch[i + 1] = placeholder;
        }

        // Converting the result into a
        // string and return
        return new String(ch);
    }

//Here is the start of swapDigitPairs method
    public static int swapDigitPairs(int n) {

        int result = 0;
        int place = 1;
        //while number is greater than 9 (more than 1 digit) the while loop will continue
        while (n > 9) {
            //This math is where the digits get swapped.
            //We isolate the the digits one by one.
            result += place * 10 * (n % 10);
            //Here we remove the digit we isolated so we can get the next one
            n /= 10;
            //Here we get that next digit
            result += place * (n % 10);
            n /= 10;
            //Then we stitch all the digits back together
            place *= 100;
        }
        return result + place * n; //here we return the swapped digits :)


    }
}

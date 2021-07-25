/* Name: Savannah Smalley
Date: 7/6/21
Description: This program manipulates declared Fraction objects described in Fraction.java such as
scaling them up or down by a given factor.
 */
//imported for Scanner use
import java.util.Scanner;
//Start of class
public class FractionScale {
    //Start of main()
    public static void main(String[] args) {
        //Scanner Declaration
        Scanner input = new Scanner(System.in);
        //Intro and prompt for user to enter a fraction
        System.out.println("This program performs the scaling operations on a fraction.");
        System.out.println("Enter a fraction: ");
        //user input is stored in response variable
        String response = input.nextLine();
        //Here, all the spaces are taken out of the response String
        response = response.replaceAll(" ","");
        //and then passed through as a parameter in the creation of our first Fraction
        Fraction first = new Fraction(response);
        //our test fraction (1/3) will be used later when dividing the first fraction
        Fraction test = new Fraction(1,3);
        //which will tell us whether to scale up or down our fraction
        int which;
        //if up is true, scaleUp will happen, if up is false, scaleDown will happen
        boolean up = false;
        boolean valid;
        //repeated till user chooses 1 or 0
       do{
           //user prompt
            System.out.println("Scale up or down (1:up, 0: down): ");
            //response stored in which
            which = input.nextInt();
            //if which is 0, up is false and we break the loop
            if(which==0){
                up=false;
                valid=true;
                //if which is 1, up is true, we break the loop
            }else if(which==1){
                up=true;
                valid=true;
                //otherwise user needs to choose one of the previous choices
            }else{
                System.out.println("Please choose either 1 or 0.");
                valid = false;
            }
        } while(!valid);
       //User prompted for scale factor
        System.out.println("Enter a scale factor: ");
        //that factor is stored in scale variable
        int scale = input.nextInt();
        //which is passed through our scale method as our factor along with our up boolean variable from earlier.
        first.scale(scale,up);
        //then we print the fraction with our toString() method.
        System.out.println("The scaled fraction is: "+first.toString());

        //This is just a demonstration of the divide() method so you could see
        //how it works.
        System.out.println("\nDivision demonstration using "+first.toString()+" and "+test.toString()+":");
        System.out.println(first.divide(test).toString());



    }
}

/* Name: Savannah Smalley
Date: 7/6/21
Description: This Fraction.class describes the behavior of the Fraction object for it's use in FractionScale.java.

 */
//Start of class
public class Fraction {
//private int numerator stores top number
    private int numerator;
    //private int denominator stores bottom number
    private int denominator;

    //START OF CONSTRUCTORS
    //I have several constructors to allow Fraction objects to be made several different ways.
    //This first one is utilized when we let the user enter their fraction through scanner since
    //they are giving us a String. This constructor parses the input from the given String for the
    //integer before / and the integer after the / and assigns those to numerator and denominator.
    public Fraction(String frac){
        numerator=Integer.parseInt(frac.substring(0,frac.indexOf("/")));
        denominator=Integer.parseInt(frac.substring(frac.indexOf("/")+1));
    }
    //This constructor will create a fraction with a given int numerator and denominator.
    public Fraction(int num, int denum){
        numerator=num;
        denominator=denum;
    }
    //This constructor will create a fraction (0/1) if the user enters no parameters.
    public Fraction(){
        numerator=0;
        denominator=1;
    }
    //This constructor will create a fraction with the given num becoming the numerator and the denominator being 1.
    public Fraction(int num){
        numerator=num;
        denominator=1;
    }
    //END OF CONSTRUCTORS

    //scale() method scales a fraction up or down using the given factor depending on the given boolean value
    public void scale(int factor, boolean flag){
        //if flag is true and the factor isn't 0, we scale up
        if(flag&&factor!=0){
            scaleUp(factor);
        }else if(!flag&&factor!=0){
            //if flag is false and the factor isn't 0, we scale down
            scaleDown(factor);
        }else{
            //this is printed if the user enters 0 as the factor.
            System.out.println("You cannot divide by 0.");
        }
    }
//Here is the divide() method which returns a Fraction after dividing it
//using a given parameter against the current fraction.
    public Fraction divide(Fraction f){
        //Had to remember keep-change-flip for this
        int num=Fraction.this.numerator*f.denominator;
        int denum=Fraction.this.denominator*f.numerator;
        return new Fraction(num,denum);
    }
    //scale up just multiplies the numerator by a given factor
    public int scaleUp(int factor){
        return numerator*=factor;
    }
    //scale down multiplies the denominator with a given factor if it's not 0.
    public void scaleDown(int factor){
        if(factor==0){
            System.out.println("You cannot divide by 0.");
        }else{
            denominator*=factor;
    }
}
//toString allows us to print the fraction the way we're used to seeing it.
    public String toString() {
        return numerator+"/"+denominator;
    }
}

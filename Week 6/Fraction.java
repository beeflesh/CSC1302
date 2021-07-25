/*Name: Savannah Smalley
Date: 7/12/21
Panther ID: 002-57-8974
Description: Describes the behavior of the Fraction object for its use in
MultiplyClient.java
 */
//class start
public class Fraction {
    //two private instance variables, numerator and denominator
    private int numerator;
    private int denominator;
//constructor
    public Fraction(int num, int denom){
        this.numerator=num;
        this.denominator=denom;
    }
    //getNumerator() just returns the numerator of the given object
    public int getNumerator(){
        return numerator;
    }
    //getDenominator() just returns the denominator of the given object
    public int getDenominator(){
        return denominator;
    }
    //FractionMultiply() returns the resulting fraction product from two given fractions.
    public Fraction FractionMultiply(Fraction f1,Fraction f2){
        return new Fraction((f1.getNumerator()*f2.getNumerator()),f1.getDenominator()*f2.getDenominator());
    }
    //toString() creates a String representation of the fraction.
    public String toString(){
        return numerator+"/"+denominator;
    }


}

/*Name: Savannah Smalley
Date: 7/12/21
Panther ID: 002-57-8974
Description: This code's use is to demonstrate the behaviors we've specified
for the Cat and Animal objects and how inheritance relates the two classes.
 */
//start of class
public class Lab_11 {
    //start of main()
    public static void main(String[] args) {
        //Declaration of Cat object
        Cat firstCat = new Cat(false,"meats",4,"white");
        //printing the vegetarian boolean value using the getter isVeg()
        System.out.println("Cat is vegetarian? "+firstCat.isVeg());
        //printing the eats String value using the getter getDiet()
        System.out.println("Cat eats "+firstCat.getDiet());
        //printing the legs int value using the getter getLegNum()
        System.out.println("Cat has "+firstCat.getLegNum()+" legs.");
        //printing the color String value using the getter getColor()
        System.out.println("Cat color is "+firstCat.getColor());
    }
}

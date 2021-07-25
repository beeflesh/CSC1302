/*Name: Savannah Smalley
Date: 7/18/21
Panther ID: 002-57-8974
Description: Client for the ColoredPoint and Point objects as well as the Colored interface.
 */
//start of class
public class ColorClient {
    //start of main
    public static void main(String[] args) {
        //declaration of Point and ColoredPoints for comparison later on
        Point first = new Point(3,2);
        ColoredPoint test = new ColoredPoint(first,"red");
        Colored test3 = new ColoredPoint(first,"white");
        ColoredPoint test2= new ColoredPoint(first,"red");
        //our first example shows how the code can distinguish
        //unequal objects properly.
        System.out.println("First example: ");
        System.out.println("First ColoredPoint: "+test.toString());
        System.out.println("Second ColoredPoint: "+test3.toString());
        System.out.println("Are they equal? Answer: "+test.equals(test3));
        System.out.println();
        //our second example shows how the code can distinguish
        //equal objects properly
        System.out.println("Second example: ");
        System.out.println("First ColoredPoint: "+test.toString());
        System.out.println("Second ColoredPoint: "+test2.toString());
        System.out.println("Are they equal? Answer: "+test.equals(test2));
    }

}

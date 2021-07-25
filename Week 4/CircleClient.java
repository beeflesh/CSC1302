/* Code by Savannah Smalley
   Created on 6/30/21

   The purpose of this code is to create two objects (Point and Circle) and have them interact with
   methods that help display the area and circumference of a given circle, and then to tell the user
   whether or not a specified point is within the given circle.

 */
//Start of class CircleClient
public class CircleClient {
    //Start of main()
    public static void main(String[] args) {
        //Declaration of first point at (10,5)
        Point first = new Point(10,5);
        //Declaration of first Circle using the first Point and a radius of 7
        Circle firstCir = new Circle(first,7);
        //Printing out the Circle's information using firstCir.toString()
        System.out.println(firstCir.toString());
        //Here we're using printf to tidy up the output given by the getCircumference() and getArea() methods.
        //Both should display only up to two decimal points.
        System.out.printf("The circumference of the circle is: %.2f\n",firstCir.getCircumference());
        System.out.printf("The area of the circle is: %.2f\n",firstCir.getArea());
        //Here we declare another Point to be tested to see if it fits within the first Circle.
        Point test = new Point(5,7);
        //Here we call the method and print the result
        firstCir.contains(test);
    }
}

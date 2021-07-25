/* Code by Savannah Smalley
   Created on 6/30/21

   Describes the behavior of the Circle object.

 */
//Start of the Circle class for the Circle object
public class Circle{
//two private instance variables, one is a Point object (to get the x,y), and the other is the radius
    private Point center;
    private int radius;
//Constructor of the Circle object
    public Circle(Point p, int rad){
        //the point passed through as a parameter for the declaration of the object
        //is set at the private variable "center" to represent the center of the circle.
        //The radius is also a part of the Circle.
        this.center =p;
        this.radius=rad;
    }
    //getCenter() just returns the center Point
    public Point getCenter(){
        return center;
    }
    //getRadius() just returns the radius value
    public int getRadius(){
        return radius;
    }
    //getArea() returns the value of the area of a circle formula as a double.
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    //getCircumference() returns the value of the circumference of a circle formula as a double as well.
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    //toString prints the Circle object's information like it is listed in the Lab task document.
    public String toString(){
        return "Circle[center="+ center.toString()+",radius="+radius+"]";
    }
    //contains() tests the given point's distance from the center of the circle, and if the radius is greater,
    //contains() determines the point is within the circle.
    //Otherwise, it recognizes the point is outside the circle.
    public boolean contains(Point p){
        if (p.distance(p, center)>radius){
            System.out.println(p.toString()+" does not lie within the circle.");
            return false;
        }else{
            System.out.println(p.toString()+" lies within the circle.");
            return true;
        }
    }
}

/*Name: Savannah Smalley
Date: 7/18/21
Panther ID: 002-57-8974
Description: Describes the behavior of the ColoredPoint object that has a parent class of Point
and implements the Colored interface
 */
//start of class
public class ColoredPoint extends Point implements Colored {
    //instance variables
    private String color;
    private Point point;
    //constructor, supering the point constructor and using the proper x and y values by utilizing the getters
    //for x and y
    public ColoredPoint(Point p, String color){
        super(p.getX(), p.getY());
        this.color=color;
    }
    //getter for the Point object
    public Point getPoint(){
        return point;
    }
    //getter for the String color
    public String getColor(){
        return color;
    }
    //toString to represent the ColoredPoint object in string form
    public String toString(){
        return "The coordinates of the Point are: ("+super.getX()+", "+super.getY()+")\nand the color is: "+getColor();
    }
    //equals() compares the object in the parameter to the calling object to see if their values of
    //point and color are equal
    public boolean equals(Object o) {
        //if the object passed is a ColoredPoint object,
        if (o instanceof ColoredPoint) {
            //then it will compare that object's point and color values
            //to see if they are equal, and if they are, it returns true
            ColoredPoint other = (ColoredPoint) o;
            return point == other.point && color.equals(other.color);
            //else if the object passed is not a ColoredPoint object,
            //there is no way they can be equal so it returns false.
        } else {
            return false;
        }
    }

}


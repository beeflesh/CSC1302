/*Name: Savannah Smalley
Date: 7/18/21
Panther ID: 002-57-8974
Description: Describes the behavior of the Point object which is used as the parent class of ColoredPoint.
 */
//class start
public class Point {
//instance variables of the point (x,y)
    private int x;
    private int y;
    //constructor that calls the other constructor so that even if no parameters are entered upon
    //declaration, a Point can be constructed
    public Point() {
        this(0, 0);
    }
    //constructor that allows us to choose the x,y
    public Point(int x, int y) {
        setLocation(x, y);
    }
    //getter for x
    public int getX(){
        return x;
    }
    //getter for y
    public int getY(){
        return y;
    }
    //equals() compares the Point objects similar to the way it is done in ColoredPoint
    public boolean equals(Object o) {
        //if object passed is a Point,
        if (o instanceof Point) {
            Point other = (Point) o;
            //it compares the parameter's object values against the calling object's values
            return x == other.x && y == other.y;
        } else {
            //else if an object other than point is passed as a parameter, it will return false.
            return false;
        }
    }
    //setter for both x and y, also used in a constructor
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //toString for the String representation of the point.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}


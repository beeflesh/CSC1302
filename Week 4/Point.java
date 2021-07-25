/* Code by Savannah Smalley
   Created on 6/30/21

   Describes the behavior of the Point object.

 */
//Start of class Point for the Point object
public class Point {
//two private integers to hold the x,y values of the point
    private int x;
    private int y;
//constructor of the Point object
    public Point(int x, int y){
        //the x and y passed through as a parameter in the declaration of the Point gets
        //assigned to the private variables of the Point class for that given object.
        this.x=x;
        this.y=y;
    }
//toString() method prints the x,y coordinates like this: "(x,y)"
    public String toString() {
        return "("+x+","+y+")";
    }
    //distance() method calculates the distance between two points
    public double distance(Point a,Point b){
       return Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow((a.y-b.y),2));
    }
}

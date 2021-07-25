/*Name: Savannah Smalley
Date: 7/6/21
Panther ID: 002-57-8974
Description: Park.java describes the behavior of the Park object for it's use in ParkClient.java
 */

//imported for use of Random
import java.util.Random;

//class start
public class Park {
    //Here are my instance variables
    public String ParkName;
    public int ParkID;
    public String ParkShape;
    private double ParkLength;
//declaration of the random object
    public Random fate = new Random();
//This is my constructor I use for initializing biggestPark in ParkClient.java. This allows me to have an empty set to
    //compare the other parks to before reassignment occurs.
    public Park(){
        ParkName="empty";
        ParkID=10;
        //random object will decide 50/50 whether to give the empty park a Circle or Square shape
        if(fate.nextDouble()>.5){
            ParkShape="Circle";
        }else{
            ParkShape="Square";
        }
        ParkLength=0;
    }
//this constructor allocates names, id, shapes, and length to a given Park during declaration
    public Park(String name,int id,String shape,double length){
        ParkName=name;
        ParkID=id;
        ParkShape=shape;
        ParkLength=length;
    }
    //returns the name
    public String ParkNameGetter(){
        return ParkName;
    }
    //returns the id
    public int ParkIDGetter(){
        return ParkID;
    }
    //returns the length
    public double ParkLengthGetter(){
        return ParkLength;
    }
}

/*Name: Savannah Smalley
Date: 7/12/21
Panther ID: 002-57-8974
Description: Describes the behavior of the Animal object.
 */
public class Animal {
//instance variables
    private boolean vegetarian;
    private String eats;
    private int NumLegs;
//constructor
    public Animal(boolean veg, String food,int legs){
        vegetarian=veg;
        eats=food;
        NumLegs=legs;
    }
    //isVeg() just returns the boolean value of vegetarian (getter)
    public boolean isVeg(){
        return vegetarian;
    }
    //getDiet() returns the String eats (getter)
    public String getDiet(){
        return eats;
    }
    //getLegNum() returns the int legs (getter)
    public int getLegNum(){
        return NumLegs;
    }
    //setter for boolean vegetarian
    public boolean setVeg(boolean veg){
       return vegetarian=veg;
    }
    //setter for String eats
    public String setDiet(String foods){
       return eats=foods;
    }
    //setter for int NumLegs
    public int setLegs(int legs){
        return NumLegs=legs;
    }

}

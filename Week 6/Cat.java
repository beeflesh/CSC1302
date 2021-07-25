/*Name: Savannah Smalley
Date: 7/12/21
Panther ID: 002-57-8974
Description: Describes the behavior of Cat object which is a subclass of the Animal object parent class.
 */
//class start, extending from Animal
public class Cat extends Animal{
    //instance variable
    private String color;
//constructor
    public Cat(boolean veg, String food,int legs,String color){
        //super inherits the first piece of the constructor from the Animal class
        super(veg, food, legs);
        this.color=color;
    }
    //returns the color (getter)
    public String getColor(){
        return color;
    }
    //sets the color to a given one. (setter)
    public String setColor(String color){
        return this.color=color;
    }
}


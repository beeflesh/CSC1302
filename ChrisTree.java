/*This code is created by Savannah Smalley
This code was created on 6/14/21

The purpose of this code is to draw a tree figure using nested for-loops and the given parameters.

 */

public class ChrisTree {
    //Here I've declared two final variables, segment and height which allow the code to be scalable.
    public static final int HEIGHT = 4;
    public static final int SEGMENT = 3;
    //Start of the main
    public static void main(String[] args) {
        //Calling the tree method with the final variables as parameters
        tree(HEIGHT,SEGMENT);
        //The treestand method just adds the final lines of the end of the tree.
        treestand();
    }

    //Start of the tree() method
    public static void tree(int height,int segment) {
        //This variable k helps us get the correct amount of stars
        int k =-(SEGMENT+HEIGHT)+1;
        //Here is our outer most for-loop that determines the amount of segments
        for(int i=segment;i>=1;i--) {
            //Here is the first inner for-loop which dictates the height of each segment
            for (int j = height; j > 0; j--) {
                //Here is another inner for-loop for the amount of spaces
                for (int spaces = 1; spaces<=i+j; spaces++) {
                    System.out.print(" ");
                }
                //Here is our last for-loop for the stars
                for (int stars = 1; stars <=(i+j)+k; stars++) {
                    System.out.print("*");
                }
                //k increments up by 3 to get the correct amount of spaces and stars
                k+=3;
                System.out.println();
            }
            k-=9;
        }
    }
    //This is the treestand() method, which just adds the tree stand part of the figure
    public static void treestand() {
        System.out.print("       *\n       *\n    *******");

    }
}

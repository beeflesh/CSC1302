/* Name: Savannah Smalley
Date: 7/6/21
Description: This NBA.java creates two teams and generates the win/loss results for 3 games.
NBATeam object's behavior can be found in the NBATeam.java.
 */
//imported for use of Random
import java.util.Random;
//Start of class
public class NBA {
    //Start of main()
    public static void main(String[] args) {
        //creation of team Heat
        NBATeam heat = new NBATeam("Heat",0,0);
        //creation of team Spurs
        NBATeam spurs = new NBATeam("Spurs",0,0);
        //declaration of the random object
        Random fate= new Random();
        //giving our teams 3 rounds of gameplay
        int turns=3;
        //while we still haven't run out of turns,
        while(turns>0){
            //if the random double is above 0.5, heat wins
        if(fate.nextDouble()>0.5){
            heat.winAGame(spurs);
        }else{
            //otherwise, heat loses and spurs NumberOfWin++
            heat.loseAGame(spurs);
        }
        //turns decrement down each loop
        turns--;
    }
        //once we're done looping, we print the score results with our toString method.
        System.out.println(heat.toString()+"\n"+spurs.toString());
    }
}

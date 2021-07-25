/* Code by Savannah Smalley
Created On: 6/23/21
Last Edited: 7/6/21

The purpose of this file is to generate the outcome of a series of games between multiple NBATeam objects
described in the NBATeam.java.
 */
//imported for use of Random & Scanner
import java.util.Random;
import java.util.Scanner;

//Class start
public class NBA {
//Start of main()
    public static void main(String[] args) {
        //Scanner Declaration
        Scanner input = new Scanner(System.in);
        //holds yes/no based on whether the user wants to enter more player names
        String ifAddPlayer;
        //holds the player name
        String playerName;
        //Declaring Heat object
        System.out.println("Creating the NBA team Heats......");
        NBATeam Heat = new NBATeam("Heat");
        //User prompt for adding a player
        System.out.println("Add a player to team Heats? (yes/no)");
        ifAddPlayer=input.nextLine();
        //if user says yes, we add a given name to the playerArray in NBATeam.java, if user says no, breaks loop.
        while(ifAddPlayer.equalsIgnoreCase("yes")){
            System.out.println("What is the player's name? ");
            playerName=input.nextLine();
            Heat.addAPlayer(playerName);
            //and we ask if they want another player added
            System.out.println("Add another player? (yes/no) ");
            ifAddPlayer=input.nextLine();
        }
        //Declaring Spurs NBATeam object
        System.out.println("Creating the NBA team Spurs......");
        NBATeam Spurs = new NBATeam("Spurs");
        //user prompt for adding players
        System.out.println("Add a player to team Spurs? (yes/no)");
        ifAddPlayer=input.nextLine();
        //if user says yes, we add a given name to the playerArray in NBATeam.java, if user says no, breaks loop.
        while(ifAddPlayer.equalsIgnoreCase("yes")){
            System.out.println("What is the player's name? ");
            playerName=input.nextLine();
            Spurs.addAPlayer(playerName);
            System.out.println("Add another player? (yes/no) ");
            ifAddPlayer=input.nextLine();
        }
        //Once players are added to both teams, the game starts.
        System.out.println("Game on Now......");
        //Declaration of Random object
        Random fate = new Random();
        //Allowing for 7 games to be played.
        int turns=7;
        //While turns haven't ran out:
        while(turns>0) {
            //If the random double generated is greater than 0.5, Heat's NumberOfWin will go up by one,
            // Spurs' NumberOfLoss will go up by one.
            if (fate.nextDouble() > 0.5) {
                Heat.winAgame();
                Spurs.lossAgame();
                //OTHERWISE, Spurs' NumberOfWin++, Heat's NumberOfLoss++
            } else {
                Spurs.winAgame();
                Heat.lossAgame();
            }
            //if either team reaches 4 wins, we jump out of the loop.
            if(Heat.NumberOfWin==4){
                //prints winning text
                Heat.grandWinner();
                //breaks loop
                break;
            }else if(Spurs.NumberOfWin==4){
                //prints winning text
                Spurs.grandWinner();
                //breaks loop
                break;
            }
            //otherwise we keep going for 7 turns with
            //turns going down after each loop
            turns--;
        }
        //Here we print the teams, their players, and their scores.
        System.out.println(Heat.toString());
        System.out.println(Spurs.toString());
    }
}

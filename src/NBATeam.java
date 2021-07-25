/* Code by Savannah Smalley
Created On: 6/23/21
Last Edited: 7/6/21

The purpose of this file is to describe the NBATeam object behavior.
 */
//Start of class
public class NBATeam {

    //Each NBATeam object has a teamName, NumberOfWin, NumberOfLoss, and a playerArray containing the names
    //of the players.
    public String teamName;
    public int NumberOfWin=0;
    public int NumberOfLoss=0;
    //15 is the maximum number of players on an NBA team so we will make that our maximum
    public String[] playerArray= new String[15];
//This is the constructor method
    //We receive the givenName from the declaration of the object in NBA.java
    public NBATeam(String givenName) {
        //The name the object is declared with will be stored into the teamName instance variable.
        this.teamName = givenName;
    }
//winAgame() increases the object's NumberOfWin by 1 each time it is called.
    public int winAgame() {
       return NumberOfWin++;
    }
    //lossAgame() increases the object's NumberOfLoss by 1 each time it is called.
    public int lossAgame() {
        return NumberOfLoss++;
    }
    //setWinNum() sets the NumberOfWin to a given parameter n.
    public int setWinNum(int n) {
        return NumberOfWin = n;
    }
    //getWinNum() simply returns NumberOfWin
    public int getWinNum() {
        return NumberOfWin;
    }

    //toString() returns the team name as well as the names of all the players, the win number, and the loss number.
    public String toString() {
        return teamName+"["+NBATeam.this.printPlayers()+"] win #: "+NumberOfWin+" loss #: "+NumberOfLoss+"\n";
    }
    //prints the team name and the win text when called
    public void grandWinner(){
        System.out.println(teamName+" ***WON the SERIES!***");
    }
    //adds a player name to the player array of the NBATeam object.
    public void addAPlayer(String name){
        //for loop searches through the array for values that haven't been taken,
        //then assigns the next null it finds to that player name.
        for(int i=0;i< playerArray.length-1;i++){
            if (playerArray[i]==null){
                playerArray[i]=name;
                break;
            };
        };
    }
//prints the elements of the player array that do not contain a null value.
    //concatenates all of those player names into one players String that we use in toString()
    //to print the players.
    public String printPlayers(){
        String players = " ";
        for(int i=0;i< playerArray.length-1;i++){
            if (playerArray[i]!=null){
                players += playerArray[i]+" ";
            }
        }
        return players;
    }
}

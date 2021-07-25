/* Name: Savannah Smalley
Date: 7/6/21
Description: This NBATeam.java describes the behavior of the NBATeam object for it's use in NBA.java.
 */
//Start of class
public class NBATeam {

    //three private instance variables
    private String teamName;
    //one for team name, one for win, one for losses
    private int NumberOfWin;
    private int NumberOfLoss;

    //constructor to create an NBATeam with a given name, win and loss score.
    public NBATeam(String s,int w,int l){
        teamName=s;
        NumberOfWin=w;
        NumberOfLoss=l;
    }
    //win a game increases the current object's number of win but increases the number of loss for the
    //other team passed as a parameter
    public void winAGame(NBATeam teamB){
        NumberOfWin++;
        teamB.NumberOfLoss++;
    }
    //lose a game increases the current object's number of loss but increases the number of win for the
    //other team passed as a parameter
    public void loseAGame(NBATeam teamB){
        NumberOfLoss++;
        teamB.NumberOfWin++;
    }
    //toString creates a string with the team's name and score.
    public String toString(){
        return "Team "+teamName+" | win #: "+NumberOfWin+" | loss #: "+NumberOfLoss;
    }
}

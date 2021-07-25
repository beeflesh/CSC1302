/* Code by Savannah Smalley
Created on 6/25/21

The purpose of this code is to allow a user to play a game of Tic-Tac-Toe on the console with another
player 2.
 */

//imported for use of Scanner
import java.util.*;
//Start of class
public class ticTacToe {

    //this boolean variable will only become true when either playerOne has won, playerTwo has won,
    //or a draw has taken place.
 public static boolean gameEnd = false;
 //this character array will hold the characters '-' for default, 'x' for player one. 'o' for player two.
    //it is a 3x3 array to allow for input on each space of the board
 public static char[][] board = new char[3][3];
 //start of main()
    public static void main(String[] args) {
        //row holds number of rows
        int row;
        //column holds number of columns
        int column;
        //we start with player1Turn being true
        boolean player1Turn = true;
        //Declare our Scanner object
        Scanner response = new Scanner(System.in);
        //Created a for loop to set each element of the char[] to - at the start.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        //Welcome message
        System.out.println("Welcome to Tic-Tac-Toe! Here is the following 3x3 board.\n");
        //calling drawBoard for the first time with the initial '-' values
        drawBoard(board);

        //while gameEnd has not been reached, the loop will continue
        while(!gameEnd) {
            //if it is player1Turn, that player will be prompted to enter the next coordinates
            if (player1Turn) {
                System.out.println("Player one,");
                //otherwise, Player two is prompted
            } else {
                System.out.println("Player two,");
            }
            //Prompt for row
            System.out.println("Please enter the row index: ");
            //user enters the row value
            row = response.nextInt();
            //Prompt for column
            System.out.println("Please enter the column index: ");
            //user enters the column value
            column = response.nextInt();
            //if it's the first player's turn and that array value has not already been altered from '-'
            //then the user can change that char[] value to 'x' and it is no longer
            //player1Turn so that changes to false.
            if(player1Turn && board[row][column]=='-') {
                board[row][column] = 'x';
                player1Turn = false;
                //If it's not player1Turn and that array value has not already been altered from '-'
                //the user can change that char[] value to 'o' and then player1Turn becomes true again
            }else if(board[row][column]=='-' && player1Turn!=true) {
                board[row][column] = 'o';
                player1Turn = true;
            }else {
                //If neither of those are true, it means the user tried to pick a row,column
                //combination that had already been chosen. So here, we tell that to the user
                //and try again.
                System.out.println("Please choose an index that hasn't already been chosen.");
                continue;
            }
            //board gets drawn after each new character is assigned
            drawBoard(board);
            //determineWin() tests to see if either player has hit game win
            determineWin();
        }
    }
    //Here the drawBoard() method accepts a char[][] as a parameter and draws the board on the console
    public static void drawBoard(char[][] board) {
        //initial row of dashes
        System.out.println("-------------");
        //loop for each row/column
        for(int i=0; i<3;i++){
            for(int j=0;j<3;j++) {
                //printing the wall of the board
                System.out.print("| ");
                //printing the correct element and a space
                System.out.print(board[i][j]+" ");
            }
            //making sure to close the whole board with |'s
            System.out.print("|\n");
        }
        //final row of dashes
        System.out.println("-------------");
    }

    //determineWin() will return a boolean value of true if any of the instances of a player winning/losing/
    //or having a draw has been achieved.
    public static boolean determineWin() {
        //if player1 has a horizontal/vertical/or diagonal line of x's, they win and gameEnd is true.
        if ((board[0][0]=='x' && board[0][1]=='x' && board[0][2]=='x')||(board[2][0]=='x' && board[2][1]=='x' && board[2][2]=='x')||(board[1][0]=='x' && board[1][1]=='x' && board[1][2]=='x')||(board[0][0]=='x' && board[1][0]=='x' && board[2][0]=='x')||(board[0][0]=='x'&&board[1][1]=='x'&&board[2][2]=='x')||(board[0][1]=='x'&&board[1][1]=='x'&&board[2][1]=='x')||(board[0][2]=='x'&&board[1][2]=='x'&&board[2][2]=='x')||(board[2][0]=='x' && board[1][1]=='x' && board[0][2]=='x')) {
            System.out.println("Player one wins!");
            return gameEnd=true;
            //if player2 has a horizontal/vertical/or diagonal line of o's, they win and gameEnd is true.
        } else if ((board[0][0]=='o' && board[0][1]=='o' && board[0][2]=='o')||(board[2][0]=='o' && board[2][1]=='o' && board[2][2]=='o')||(board[1][0]=='o' && board[1][1]=='o' && board[1][2]=='o')||(board[0][0]=='o' && board[1][0]=='o' && board[2][0]=='o')||(board[0][0]=='o'&&board[1][1]=='o'&&board[2][2]=='o')||(board[0][1]=='o'&&board[1][1]=='o'&&board[2][1]=='o')||(board[0][2]=='o'&&board[1][2]=='o'&&board[2][2]=='o')||(board[2][0]=='o' && board[1][1]=='o' && board[0][2]=='o')) {
            System.out.println("Player two wins!");
            return gameEnd = true;
            //if any of these spaces haven't been changed from the default character '-', no game has been won.
        }else if(board[0][0]=='-' ||board[0][1]=='-' ||board[0][2]=='-'||board[1][1]=='-'||board[2][1]=='-'||board[2][2]=='-'||board[2][0]=='-'||board[1][2]=='-'||board[1][0]=='-') {
            return gameEnd = false;
            //otherwise, since we know at this point the board is full, anything other
            //than player1 winning or player2 winning is a draw
        }else{
            System.out.println("Draw!");
            //which also returns gameEnd=true;
            return gameEnd = true;
        }
    }


}

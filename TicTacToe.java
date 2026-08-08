import java.util.Arrays;
import java.util.Scanner;


public class TicTacToe {
    private  static  final char Empty_Box=' ';
    private static final char Player_1_Symbol='X';
    private static final char Player_2_Symbol='O';

    private final char [][] gameboard= new char [3][3];
    private final Scanner input= new Scanner(System.in);

    private String Player_1;
    private String Player_2;

    private String Current_Player;
    private String Who_Own_Game;

    public void startGame(){
        initializeBoard();
        askForUsersName();
        while(isNotGameOver())
        {
            drawBoard();
            printPlayerTurn();
            askForManeuver();
        }

        printGameover();

    }

    private  void initializeBoard(){
        for(char[] chars:gameboard){
            Arrays.fill (chars,Empty_Box);
        }
    }

    private void askForUsersName(){
        System.out.println("Welcome to Tic Tac Toe!");

        System.out.println("What is Yours Name?");
        Player_1=input.nextLine() ;

        System.out.println("Who is Your Opponent?");
        Player_2=input.nextLine();

        System.out.println("Who is Playing first? press "+"\n1 for"+ Player_1+ "\n2 for"+ Player_2);
        int player=input.nextInt();

        Current_Player=player==1?Player_1:Player_2;
    }

    private boolean isNotGameOver(){
        return !(isBoardIsFull() || hasAnyPlayerWon());
    }

    private void drawBoard(){
        System.out.println("|---|---|---|");
        for(char[] chars:gameboard){
            System.out.printf("| %c | %c | %c |%n",chars[0],chars[1],chars[2]);
            System.out.println("|---|---|---|");
        }
    }

    private void printPlayerTurn(){
        System.out.println(whoIsPlaying()+"'s turn");
    }

    private void askForManeuver(){
        int row,col;
        do{
            System.out.println("Enter a row Number(0,1,2): ");
            row=input.nextInt();

            System.out.println("Enter a collum Number(0,1,2): ");
            col=input.nextInt();
        }
        while (!validateInput(row,col));


        if(whoIsPlaying().equals(Player_1)){
                gameboard[row][col]=Player_1_Symbol;
                Current_Player=Player_2;
        }
        else {
                gameboard[row][col]=Player_2_Symbol;
                Current_Player=Player_1;
        }

    }

    private void printGameover(){
        drawBoard();
        System.out.println("\uD83C\uDFAE Game Over !\uD83C\uDFAE");

        if(Who_Own_Game !=null)
        {
            System.out.println(Who_Own_Game+" Won The Game, "+"Congratulation!\uD83C\uDFAE \uD83C\uDFAE ");
        }
        else {
            System.out.println("Sounds Like Its a Tie! Play again!");
        }
    }

    private boolean isBoardIsFull(){
        boolean result=true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(gameboard[i][j]==Empty_Box){
                    result=false;
                    break;
                }
            }
            if(!result)
                break;
        }

        return result;
    }

    private boolean hasAnyPlayerWon(){
        char cross=' ';
        for(int i=0;i<3;i++){
            if(gameboard[i][0]==gameboard[i][1] && gameboard[i][1]==gameboard[i][2] && gameboard[i][0] !=Empty_Box)
            {
                cross = gameboard[i][0];
            }
        }

        for(int j=0;j<3;j++){
            if(gameboard[0][j]==gameboard[1][j] && gameboard[1][j]==gameboard[2][j] && gameboard[0][j] !=Empty_Box)
            {
                cross=gameboard[0][j];
            }
        }

        if(gameboard[0][0]==gameboard[1][1] && gameboard[1][1]==gameboard[2][2] && gameboard[0][0]!=Empty_Box)
        {
            cross=gameboard[0][0];

        }
        if(gameboard[2][0]==gameboard[1][1] && gameboard[1][1]==gameboard[0][2] && gameboard[2][0]!=Empty_Box)
        {
            cross=gameboard[2][0];
        }

        if(cross==Player_1_Symbol)
            Who_Own_Game=Player_1;
        else if(cross== Player_2_Symbol)
            Who_Own_Game=Player_2;

        return Who_Own_Game !=null;

    }

    private String whoIsPlaying(){
        return Current_Player;
    }

    private boolean validateInput(int row,int col){
        boolean result=false;
        if(row<0 || col<0 || row>2 || col>2)
            System.out.println("The Position is off the bounds" + "of the board ,try again");

        else if(gameboard[row][col]!=Empty_Box)
            System.out.println("Someone has already made a move " + " at this position, try again");

        else {
            result=true;
        }
        return result;
    }


      public   static void main(String[] args) {
          TicTacToe game=new TicTacToe();
          game.startGame();
        }


}

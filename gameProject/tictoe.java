import java.util.*;

// ✅ Interface
interface Playables {
    void startGame();
    boolean isGameOver();
}

// ✅ Abstract Class
abstract class Player {
    protected String name;
    protected char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public abstract void makeMove(char[][] board, Scanner input);
}

// ✅ Concrete Class
class HumanPlayer extends Player {

    public HumanPlayer(String name, char symbol) {
        super(name, symbol);
    }

    @Override
    public void makeMove(char[][] board, Scanner input) {
        int row, col;

        while (true) {
            System.out.println(name + " enter row (0-2): ");
            row = input.nextInt();

            System.out.println(name + " enter col (0-2): ");
            col = input.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = symbol;
                break;
            } else {
                System.out.println("❌ Invalid move, try again!");
            }
        }
    }
}

// ✅ Main Game Class
public class tictoe implements Playables {

    private char[][] board = new char[3][3];
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Scanner input = new Scanner(System.in);

    public void startGame() {
        initializeBoard();
        setupPlayers();

        while (!isGameOver()) {
            drawBoard();
            System.out.println(currentPlayer.getName() + "'s turn");
            currentPlayer.makeMove(board, input);
            switchPlayer();
        }

        drawBoard();
        printResult();
    }

    private void initializeBoard() {
        for (char[] row : board) {
            Arrays.fill(row, ' ');
        }
    }

    private void setupPlayers() {
        System.out.println("Enter Player 1 Name:");
        String p1 = input.nextLine();

        System.out.println("Enter Player 2 Name:");
        String p2 = input.nextLine();

        player1 = new HumanPlayer(p1, 'X');
        player2 = new HumanPlayer(p2, 'O');

        currentPlayer = player1;
    }

    private void drawBoard() {
        System.out.println("\n|---|---|---|");
        for (char[] row : board) {
            System.out.printf("| %c | %c | %c |\n", row[0], row[1], row[2]);
            System.out.println("|---|---|---|");
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public boolean isGameOver() {
        return checkWin() || isBoardFull();
    }

    private boolean isBoardFull() {
        for (char[] row : board) {
            for (char c : row) {
                if (c == ' ') return false;
            }
        }
        return true;
    }

    private boolean checkWin() {
        // rows & columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' &&
                    board[i][0] == board[i][1] &&
                    board[i][1] == board[i][2]) return true;

            if (board[0][i] != ' ' &&
                    board[0][i] == board[1][i] &&
                    board[1][i] == board[2][i]) return true;
        }

        // diagonals
        if (board[0][0] != ' ' &&
                board[0][0] == board[1][1] &&
                board[1][1] == board[2][2]) return true;

        if (board[0][2] != ' ' &&
                board[0][2] == board[1][1] &&
                board[1][1] == board[2][0]) return true;

        return false;
    }

    private void printResult() {
        if (checkWin()) {
            switchPlayer(); // last player wins
            System.out.println( currentPlayer.getName() + "  wins!");
        } else {
            System.out.println(" It's a draw!");
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.startGame();
    }
}

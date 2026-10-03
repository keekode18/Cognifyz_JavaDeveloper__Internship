import java.util.Scanner;
public class TicTacToe {
     static void displayBoard(char[][] board) {
        System.out.println();
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println();
    }
    static boolean checkWinner(char[][] board, char player) {

    // Check rows
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == player &&
            board[i][1] == player &&
            board[i][2] == player) {
            return true;
        }
    }

    // Check columns
    for (int i = 0; i < 3; i++) {
        if (board[0][i] == player &&
            board[1][i] == player &&
            board[2][i] == player) {
            return true;
        }
    }

    // Check main diagonal
    if (board[0][0] == player &&
        board[1][1] == player &&
        board[2][2] == player) {
        return true;
    }

    // Check other diagonal
    if (board[0][2] == player &&
        board[1][1] == player &&
        board[2][0] == player) {
        return true;
    }

    return false;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] board={
            {'1','2','3'},
            {'4','5','6'},
            {'7','8','9'}
        };

        displayBoard(board);

        char player = 'X';

int turn;

for (turn = 1; turn <= 9; turn++) {
    if (turn == 10) {
    displayBoard(board);
    System.out.println("It's a draw!");
}


    displayBoard(board);

   int position;
int row;
int col;

while (true) {
    System.out.print("Player " + player + ", enter your position (1-9): ");
    position = sc.nextInt();

    if (position < 1 || position > 9) {
        System.out.println("Invalid position! Enter a number from 1 to 9.");
        continue;
    }

    row = (position - 1) / 3;
    col = (position - 1) % 3;

    if (board[row][col] == 'X' || board[row][col] == 'O') {
        System.out.println("Position already occupied! Choose another position.");
        continue;
    }

    break;
}

board[row][col] = player;
if (checkWinner(board, player)) {
    displayBoard(board);
    System.out.println("Player " + player + " wins!");
    break;
}

    if (player == 'X') {
        player = 'O';
    } else {
        player = 'X';
    }
}

        sc.close();

    }
    
}

public class AvailableCapturesForRook {
/*
On an 8 x 8 chessboard, there is one white rook.  There also may be empty squares, white bishops, and black pawns.  These are given as characters 'R', '.', 'B', and 'p' respectively. Uppercase characters represent white pieces, and lowercase characters represent black pieces.

The rook moves as in the rules of Chess: it chooses one of four cardinal directions (north, east, west, and south), then moves in that direction until it chooses to stop, reaches the edge of the board, or captures an opposite colored pawn by moving to the same square it occupies.  Also, rooks cannot move into the same square as other friendly bishops.

Return the number of pawns the rook can capture in one move.
*/




    public int numRookCaptures(char[][] board) {
        int x = 0;
        int y = 0;
        int total = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    y = i;
                    x = j;
                }
            }
        }
        int minus = x - 1;
        int plus = x + 1;
        while ( plus < board[0].length) {
            if (board[y][plus] == 'p') {
                total++;
                break;
            }
            else if (board[y][plus] == '.') {
                plus++;
            }
            else {
                break;
            }
        }
        while ( minus >= 0) {
            if (board[y][minus] == 'p') {
                total++;
                break;
            }
            else if (board[y][minus] == '.') {
                minus--;
            }
            else {
                break;
            }
        }

        minus = y - 1;
        plus = y + 1;
        while ( plus < board[0].length) {
            if (board[plus][x] == 'p') {
                total++;
                break;
            }
            else if (board[plus][x] == '.') {
                plus++;
            }
            else {
                break;
            }
        }
        while ( minus >= 0) {
            if (board[minus][x] == 'p') {
                total++;
                break;
            }
            else if (board[minus][x] == '.') {
                minus--;
            }
            else {
                break;
            }
        }

        return total;
    }








// [[".",".",".",".",".",".",".","."],
//  [".",".",".","p",".",".",".","."],
//  [".",".",".","R",".",".",".","p"],
//  [".",".",".",".",".",".",".","."],
//  [".",".",".",".",".",".",".","."],
//  [".",".",".","p",".",".",".","."],
//  [".",".",".",".",".",".",".","."],
//  [".",".",".",".",".",".",".","."]]

// [[".",".",".",".",".",".",".","."],
//  [".",".",".","p",".",".",".","."],
//  [".",".",".","p",".",".",".","."],
//  ["p","p",".","R",".","p","B","."],
//  [".",".",".",".",".",".",".","."],
//  [".",".",".","B",".",".",".","."],
//  [".",".",".","p",".",".",".","."],
//  [".",".",".",".",".",".",".","."]]




}

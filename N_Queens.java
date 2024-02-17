import java.util.ArrayList;
import java.util.List;

/**
 * N_Queens
 */
public class N_Queens {

    int[] leftRow, upperDiagonal, lowerDiagonal;
    List<List<String>> result;
    char[][] board;

    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<List<String>>();
        leftRow = new int[n];
        upperDiagonal = new int[2 * n - 1];
        lowerDiagonal = new int[2 * n - 1];
        board = new char[n][n];

        // Initial Board.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        return result;
    }

    public void solve(int col) {
        if (col == this.board.length) {
            this.result.add(snapshot(board));
            return;
        }

        for (int row=0; row<board.length; row++) {
            if (isValid(row, col)) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row+col] = 1;
                upperDiagonal[board.length - 1 + col - row] = 1;

                // Next Column recursion
                solve(col+1);

                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row+col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }

    public boolean isValid(int row, int col) {
        return leftRow[row] == 0 && lowerDiagonal[row+col] == 0 && upperDiagonal[board.length - 1 + col - row] == 0;
    }

    public List<String> snapshot(char[][] board) {
        List<String> result = new ArrayList<>();
        for (int i=0; i<board.length; i++) {
            result.add(new String(board[i]));
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
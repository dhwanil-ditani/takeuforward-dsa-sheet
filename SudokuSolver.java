public class SudokuSolver {

    boolean[][] rows = new boolean[9][9];
    boolean[][] cols = new boolean[9][9];
    boolean[][] boxes = new boolean[9][9];
    char[][] board = new char[9][9];

    public boolean isRowValid(int row, int val) {
        return !this.rows[row][val];
    }

    public boolean isColValid(int col, int val) {
        return !this.cols[col][val];
    }

    public boolean isBoxValid(int no, int val) {
        return !this.boxes[no][val];
    }

    public int getBoxNumber(int row, int col) {
        return row / 3 + col / 3;
    }

    public boolean isValid(int row, int col, int val) {
        return isRowValid(row, val) && isColValid(col, val) && isBoxValid(getBoxNumber(row, col), val);
    }

    public int getRow(int idx) {
        return idx/9;
    }

    public int getCol(int idx) {
        return idx%9;
    }

    public char toChar(int val) {
        return (char)(val + '0');
    }

    public int toInt(char val) {
        return val - '0';
    }

    public boolean solve(int idx) {
        while (this.board[getRow(idx)][getCol(idx)] != '.') {
            idx++;
        }

        if (idx > 81) {
            return true;
        }

        boolean hasSolution = false;

        int row = getRow(idx);
        int col = getCol(idx);

        for (int i=0; i<9; i++) {
            if (isValid(row, col, i)) {
                this.board[row][col] = toChar(i+1);
                this.rows[row][i] = true;
                this.cols[col][i] = true;
                this.boxes[getBoxNumber(row, col)][i] = true;
                if (solve(idx+1)) {
                    hasSolution = true;
                    break;
                } else {
                    this.board[row][col] = '.';
                    this.rows[row][i] = false;
                    this.cols[col][i] = false;
                    this.boxes[getBoxNumber(row, col)][i] = false;
                    continue;
                }
            }
        }

        return hasSolution;
    }

    public void solveSudoku(char[][] board) {
        for (int row=0; row<9; row++) {
            for (int col=0; col<9; col++) {
                if (board[row][col] != '.') {
                    int val = toInt(board[row][col]);
                    this.rows[row][val-1] = true;
                    this.cols[col][val-1] = true;
                    this.boxes[getBoxNumber(row, col)][val-1] = true;
                }
            }
        }

        this.board = board;

        solve(0);
    }

    public static void main(String[] args) {
        SudokuSolver s = new SudokuSolver();
        System.out.println(s.getRow(81));
    }
}

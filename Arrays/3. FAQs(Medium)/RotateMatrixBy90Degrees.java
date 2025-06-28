import java.util.Arrays;

class Solution {
    public void rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];
        for (int j=0; j<n; j++) {
            for (int i=n-1; i>=0; i--) {
                result[j][n-i-1] = matrix[i][j];
            }
        }
        for (int i=0; i<n; i++) {
            matrix[i] = Arrays.copyOf(result[i], n);
        }
    }
}

public class RotateMatrixBy90Degrees {
    
}

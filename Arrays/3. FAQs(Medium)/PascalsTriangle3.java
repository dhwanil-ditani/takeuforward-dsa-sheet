import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<Integer> generateRow(int row) {
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();

        ansRow.add(ans);

        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int) ans);
        }

        return ansRow;
    }

    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for (int row = 1; row <= n; row++) {
            pascalTriangle.add(generateRow(row));
        }
        
        return pascalTriangle;
    }
}

public class PascalsTriangle3 {
    
}

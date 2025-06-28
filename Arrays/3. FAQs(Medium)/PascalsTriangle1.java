class Solution {
    private int nCr(int n, int r) {
        if (n < r) return 0;

        r = Math.min(r, n - r);

        if (r == 1) return n;

        int res = 1;
        
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        
        return res;
    }

    public int pascalTriangleI(int r, int c) {
       return nCr(r-1, c-1);
    }
}

public class PascalsTriangle1 {
    
}

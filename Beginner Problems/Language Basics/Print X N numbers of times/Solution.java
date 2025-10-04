import java.util.Scanner;

class Solution {
    public void printX(int X, int N) {
        for (int i=0; i<N; i++) {
            System.out.print(X + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();
        new Solution().printX(X, N);

        sc.close();
    }
}
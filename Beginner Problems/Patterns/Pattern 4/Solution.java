import java.util.Scanner;

class Solution {
    public void pattern4(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Solution().pattern4(sc.nextInt());
        sc.close();
    }
}
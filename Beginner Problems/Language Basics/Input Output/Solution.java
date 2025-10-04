import java.util.Scanner;

class Solution {
    public void printNumber(Scanner sc) {
        System.out.println(sc.nextInt());
    }

    public static void main(String[] args) {
        new Solution().printNumber(new Scanner(System.in));
    }
}

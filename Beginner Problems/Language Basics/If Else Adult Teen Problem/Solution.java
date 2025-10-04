import java.util.Scanner;

class Solution {
    public void isAdult(int age) {
        String output = "";
        if (age >= 18) {
            output = "Adult";
        } else {
            output = "Teen";
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Solution().isAdult(sc.nextInt());
        sc.close();
    }
}
import java.util.Scanner;

class Solution {
    public void studentGrade(int marks) {
        String output = "";
        if (marks >= 90) {
            output = "Grade A";
        } else if (marks >= 70) {
            output = "Grade B";
        } else if (marks >= 50) {
            output = "Grade C";
        } else if (marks >= 35) {
            output = "Grade D";
        } else {
            output = "Fail";
        }
        System.out.print(output);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Solution().studentGrade(sc.nextInt());
        sc.close();
    }
}
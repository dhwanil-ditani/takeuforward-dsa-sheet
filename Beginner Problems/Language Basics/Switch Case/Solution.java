import java.util.Scanner;

class Solution {
    public void whichWeekDay(int day) {
        String output = "";
        switch (day) {
            case 1:
                output = "Monday";
                break;

            case 2:
                output = "Tuesday";
                break;

            case 3:
                output = "Wednesday";
                break;

            case 4:
                output = "Thursday";
                break;

            case 5:
                output = "Friday";
                break;

            case 6:
                output = "Saturday";
                break;

            case 7:
                output = "Sunday";
                break;
            
            default:
                output = "Invalid";
                break;
        }
        System.out.print(output);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Solution().whichWeekDay(sc.nextInt());
        sc.close();
    }
}
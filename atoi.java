import java.util.Scanner;

class Solution {
    public static int atoi(String str) {
        int result = 0;
        str = str.trim();
        boolean isPositive = true;
        int i = 0;

        if (str.length() > 0) {
            if (str.charAt(0) == '+') {
                i++;
                isPositive = true;
            } else if (str.charAt(0) == '-') {
                i++;
                isPositive = false;
            }
        }

        while (i < str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                // System.out.println(str.charAt(i) - '0');
                result = (result * 10) + (str.charAt(i) - '0');
            } else {
                break;
            }
            i++;
        }

        if (isPositive) {
            return result;
        } else {
            return 0 - result;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(atoi(str));

        in.close();
    }
}

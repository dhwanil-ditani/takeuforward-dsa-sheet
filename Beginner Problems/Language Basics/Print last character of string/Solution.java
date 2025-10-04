import java.util.Scanner;

class Solution {
    public char lastChar(String s) {
        return s.charAt(s.length()-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char output = new Solution().lastChar(sc.next());
        System.out.print(output);
        sc.close();
    }
}
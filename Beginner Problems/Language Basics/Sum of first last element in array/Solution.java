import java.util.Scanner;

class Solution {
    public int sumOfFirstAndLast(int[] nums) {
        int n = nums.length;
        return nums[0] + nums[n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");
        int n = tokens.length;
        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[i] = Integer.parseInt(tokens[i]);
        }
        int output = new Solution().sumOfFirstAndLast(nums);
        System.out.println(output);
        sc.close();
    }
}
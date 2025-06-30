public class Solution {
    public int largestElement(int[] nums) {
        int n = nums.length;

        int max = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }
}
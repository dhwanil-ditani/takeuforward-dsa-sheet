public class Solution {
    public int largestElement(int[] nums) {
        int n = nums.length;

        // Initialize variable max as a placeholder to store the largest element.
        int max = nums[0];

        // Traverse the entire array to search the largest element.
        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }
}
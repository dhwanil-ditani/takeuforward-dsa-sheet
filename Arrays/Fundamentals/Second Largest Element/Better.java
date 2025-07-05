class Solution {
    public int secondLargestElement(int[] nums) {
        int n = nums.length;

        if (n < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, nums[i]);
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
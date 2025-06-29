public class Solution {
    public int[] selectionSort(int[] nums) {
        int n = nums.length;

        // loop to track the starting index of the unsorted part of the array.
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            // loop to find the smallest element in the unsorted part of the array.
            for (int j = i; j < n; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }

            // Put the smallest element found at the beginning. For this we swap the
            // smallest element found with i (the beginning of the unsorted part of the
            // array.). This makes the array from index 0 to i sorted.
            if (minIdx != i)
                swap(nums, i, minIdx);
        }

        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

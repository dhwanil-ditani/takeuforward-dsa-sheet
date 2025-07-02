public class Solution {
    public int[] insertionSort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            int key = nums[i]; // Current element to insert
            int j = i - 1;

            // Shift elements that are getter than key by one position
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            nums[j + 1] = key; // Insert key at the current position
        }

        return nums;
    }
}

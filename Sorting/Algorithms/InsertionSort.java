/**
 * <h3>Intuition</h3>
 * <p>
 * Insertion sort builds a sorted array one element at a time by repeatedly
 * picking the next element and inserting it into its correct position within
 * the already sorted part of the array.
 * </p>
 * <h3>Approach</h3>
 * <p>
 * 
 * </p>
 */
class Solution {
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

public class InsertionSort {

}
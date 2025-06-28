/**
 * <h3>Intuition</h3>
 * <p>
 * The selection sort algorithm sorts an array by repeatedly finding the minimum
 * element from the unsorted part and putting it at the beginning. The largest
 * element will end up at the last index of the array.
 * </p>
 * <h3>Pseudocode</h3>
 * <p>
 * 
 * </p>
 */
class Solution {
    public int[] selectionSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int minIdx = i;
            for (int j = i; j < n; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
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

public class SelectionSort {

}

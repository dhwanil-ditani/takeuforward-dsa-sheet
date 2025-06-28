/**
 * <h3>Intuition</h3>
 * <p>
 * The bubble sort algorithm sorts an array by repeatedly swapping adjacent
 * elements if they are in the wrong order. The largest elements "bubble" to the
 * end of the array with each pass.
 * </p>
 * <h3>Approach</h3>
 * <li></li>
 * <li></li>
 * <li></li>
 * <li></li>
 * <p>
 * </p>
 */
class Solution {
    public int[] bubbleSort(int[] nums) {
        int n = nums.length;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }

        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

public class BubbleSort {

}
import java.util.Arrays;

class Solution {
    public int secondLargestElement(int[] nums) {
        int n = nums.length;

        // If the array has less than 2 elements, then there is no second largest
        // element.
        if (n < 2) {
            return -1;
        }

        Arrays.sort(nums);

        int largest = nums[n - 1];
        int secondLargest = -1;

        // Traverse the array from the end to find the second largest element, as there
        // can be multiple entries of largest element.
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != largest) {
                secondLargest = nums[i];
                break;
            }
        }

        return secondLargest;
    }
}
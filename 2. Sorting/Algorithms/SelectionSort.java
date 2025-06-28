class Solution {
    public int[] selectionSort(int[] nums) {
        int n = nums.length;
        
        for (int i=0; i<n; i++) {
            int min = i;
            for (int j=i; j<n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            swap(nums, i, min);
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


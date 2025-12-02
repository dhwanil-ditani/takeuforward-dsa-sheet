class Solution {
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void moveZeroes(int[] nums) {
        int p_zeros = 0;
        int p_non_zeros = 0;
        int n = nums.length;

        while (p_zeros < n && p_non_zeros < n) {
            while (nums[p_zeros] != 0) {
                p_zeros++;
                p_non_zeros++;
            }
            while (nums[p_non_zeros] == 0) {
                p_non_zeros++;
            }
            swap(nums, p_non_zeros, p_zeros);
        }
    }
}
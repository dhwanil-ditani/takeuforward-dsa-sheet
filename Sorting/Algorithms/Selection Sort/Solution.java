import java.util.Scanner;

class Solution {
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int[] selectionSort(int[] nums) {
        int n = nums.length;

        for (int i=0; i<n; i++) {
            int min = i;
            for (int j=i; j<n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            if (min != i) {
                swap(nums, i, min);
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] tokens = in.nextLine().split(" ");
        int[] nums = new int[tokens.length];

        for (int i=0; i<nums.length; i++) {
            nums[i] = Integer.parseInt(tokens[i]);
        }

        int[] output = new Solution().selectionSort(nums);

        for (int i=0; i<output.length; i++) {
            System.out.print(output[i] + " ");
        }
        System.out.println();

        in.close();
    }
}

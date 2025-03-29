class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int iPos = 0, iNeg = 1;

        for (int i=0; i<n; i++) {
            if (nums[i] < 0) {
                result[iNeg] = nums[i];
                iNeg += 2;
            } else {
                result[iPos] = nums[i];
                iPos += 2;
            }
        }

        return result;
    }
}


public class RearrangeArrayElementsBySign {
    
}

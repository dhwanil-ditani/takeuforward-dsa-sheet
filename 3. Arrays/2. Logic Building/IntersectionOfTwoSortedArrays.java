import java.util.Arrays;

class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        int i1 = 0, i2 = 0, i3 = 0;
        int[] nums3 = new int[Math.min(nums1.length, nums2.length)];
        while (i1 < nums1.length && i2 < nums2.length) {
            if (nums1[i1] == nums2[i2]) {
                nums3[i3] = nums1[i1];
                i3++;
                i1++;
                i2++;
            } else {
                if (nums1[i1] < nums2[i2]) {
                    i1++;
                } else {
                    i2++;
                }
            }
        }
        return Arrays.copyOf(nums3, i3);
    }
}


public class IntersectionOfTwoSortedArrays {
    
}

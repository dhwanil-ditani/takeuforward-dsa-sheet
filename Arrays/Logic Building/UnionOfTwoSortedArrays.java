import java.util.Arrays;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int i1 = 0, i2 = 0, i3 = 0;
        int[] result = new int[nums1.length + nums2.length];
        while (i1 < nums1.length && i2 < nums2.length) {
            int min = Math.min(nums1[i1], nums2[i2]);
            if (i3 == 0 || result[i3-1] != min) {
                result[i3] = min;
                i3++;
            }
            if (min == nums1[i1]) i1++;
            if (min == nums2[i2]) i2++;
        }
        while (i1 < nums1.length) {
            if (result[i3-1] != nums1[i1]) {
                result[i3] = nums1[i1];
                i3++;
            }
            i1++;
        }
        while (i2 < nums2.length) {
            if (result[i3-1] != nums2[i2]) {
                result[i3] = nums2[i2];
                i3++;
            }
            i2++;
        }
        return Arrays.copyOf(result, i3);
    }
}


public class UnionOfTwoSortedArrays {

    
}
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                element = nums[i];
            } else if (element == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == element) {
                count++;
            }
        }

        if (count > (n / 2)) {
            return element;
        }

        return -1;
    }
}

public class MajorityElement1 {

}

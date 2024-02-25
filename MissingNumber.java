import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int n = nums.length;
        return (n * (n+1) / 2) - total;
    }
}

public class MissingNumber {
    
}

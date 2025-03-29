import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> leaders(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>(); 
        int max = Integer.MIN_VALUE;
        for (int i=n-1; i>=0; i--) {
            if (nums[i] > max) {
                max = nums[i];
                result.add(0, max);
            }
        }
        return result;
    }
}

public class LeadersInAnArray {

    
}
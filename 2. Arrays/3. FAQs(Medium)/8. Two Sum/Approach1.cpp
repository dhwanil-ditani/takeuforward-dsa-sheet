#include <bits/stdc++.h>

using namespace std;

class Solution {
   public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> m;
        int n = nums.size();
        for (int i=0; i<n; i++) {
            int num = nums[i];
            int diff = target - num;
            if (m.find(diff) != m.end()) {
                return {m[diff], i};
            }
            m[num] = i;
        }
        return {-1, -1};
    }
};

int main() {
    vector<int> nums = {1, 6, 2, 10, 3};
    int target = 7;

    //create an instance of Solution class
    Solution sol;
    
    // Call the twoSum method from Solution class
    vector<int> ans = sol.twoSum(nums, target);

    // Print the result
    cout << "[" << ans[0] << ", " << ans[1] << "]" << endl;

    return 0;
}

#include <bits/stdc++.h>
using namespace std;

class Solution {
   public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        set<vector<int>> tripletSet;
        int n = nums.size();

        sort(nums.begin(), nums.end());

        for (int i = 0; i < n; i++) {
            int target = 0 - nums[i];
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    vector<int> temp = {nums[i], nums[left], nums[right]};
                    sort(temp.begin(), temp.end());
                    tripletSet.insert(temp);
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        vector<vector<int>> ans(tripletSet.begin(), tripletSet.end());
        return ans;
    }
};

int main() {
    vector<int> nums = {2, -2, 0, 3, -3, 5};
    // -3 -2 0 2 3 5

    // Create an instance of Solution class
    Solution sol;

    vector<vector<int>> ans = sol.threeSum(nums);

    // Print the result
    for (auto& triplet : ans) {
        cout << "[";
        for (auto& num : triplet) {
            cout << num << " ";
        }
        cout << "] ";
    }
    cout << "\n";

    return 0;
}
#include <bits/stdc++.h>
using namespace std;

class Solution {
   public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        set<vector<int>> tripletSet;
        int n = nums.size();

        for (int i=0; i<n; i++) {
            int target = nums[i];
            int left = i+1, right = n-1;

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    vector<int> temp = {nums[i], nums[left], nums[right]};
                    sort(temp.begin(), temp.end());
                    tripletSet.insert(temp);
                }
            }
            
        }
    }
};
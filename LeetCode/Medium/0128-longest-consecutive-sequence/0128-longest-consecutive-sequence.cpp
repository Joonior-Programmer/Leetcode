class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> numSet;
        int ret = 0;
        for (int i = 0; i < nums.size(); ++i) numSet.insert(nums[i]);
        
        for (int num : nums){
            if (numSet.find(num - 1) == numSet.end()){
                int curr = num + 1;
                while (numSet.find(curr) != numSet.end()) ++curr;
                ret = max(ret, curr - num);
                if (ret > nums.size() / 2) break;
            }
        }
        
        return ret;
    }
};
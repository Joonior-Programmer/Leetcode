class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_set<int> contains;
        for (int i = 0; i < nums.size(); ++i){
            if (contains.find(nums[i]) != contains.end()) return true;
            contains.insert(nums[i]);
        }
        return false;
    }
};
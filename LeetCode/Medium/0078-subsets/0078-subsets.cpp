class Solution {
public:
    vector<int> nums;
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> ret;
        vector<int> curr;
        this->nums = nums;
        
        dfs(0, curr, ret);
        
        return ret;
    }
    
    void dfs(int idx, vector<int>& curr, vector<vector<int>>& ret){
        if (idx > nums.size()) return;
        
        ret.push_back(vector<int>(curr));
        
        for (int i = idx; i < nums.size(); ++i){
            curr.push_back(nums[i]);
            dfs(i + 1, curr, ret);
            curr.pop_back();
        }
    }
};
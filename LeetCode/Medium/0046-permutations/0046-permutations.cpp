class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> ret;
        
        if (nums.size() == 1) {
            ret.push_back(nums);
            return ret;
        }
        
        for (int i = 0; i < nums.size(); ++i){
            vector<int> next = deleteIndex(nums, i);
            vector<vector<int>> perms = permute(next);
            
            for (int j = 0; j < perms.size(); ++j){
                perms[j].push_back(nums[i]);
                ret.push_back(perms[j]);
            }
        }
        
        return ret;
    }
    
    vector<int> deleteIndex(vector<int>& arr, int idx){
        vector<int> temp(arr.size()-1);
        int j = 0;
        
        for (int i = 0; i < arr.size(); ++i){
            if (i != idx) temp[j++] = arr[i];
        }
        
        return temp;
    }
};
class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        vector<int> count(nums.size()+1);
        vector<int> ret(2);
        
        for (int i = 0; i < nums.size(); ++i) ++count[nums[i]];
        
        for (int i = 1; i < count.size(); ++i){
            if (count[i] == 0) ret[1] = i;
            else if (count[i] == 2) ret[0] = i;
        }
        
        return ret;
    }
};
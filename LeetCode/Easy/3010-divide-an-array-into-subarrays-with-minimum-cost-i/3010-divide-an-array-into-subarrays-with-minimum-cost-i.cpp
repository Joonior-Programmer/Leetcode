class Solution {
public:
    int minimumCost(vector<int>& nums) {
        int ret = nums[0];
        int left = 2;
        vector<int> count(51);
        
        for (int i = 1; i < nums.size(); ++i) ++count[nums[i]];
        
        int i = 1;
        
        while (left > 0){
            if (count[i] > 0){
                count[i]--;
                ret += i;
                left--;
            } else ++i;
        }
        
        return ret;
    }
};
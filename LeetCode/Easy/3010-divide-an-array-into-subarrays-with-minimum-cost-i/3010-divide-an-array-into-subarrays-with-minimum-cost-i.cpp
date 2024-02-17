class Solution {
public:
    int minimumCost(vector<int>& nums) {
        int ret = nums[0];
        int first = 999;
        int second = 999;
        
        for (int i = 1; i < nums.size(); ++i){
            int temp = nums[i];
            if (temp < first){
                second = first;
                first = temp;
            } else if (temp < second) second = temp;
        }
        
        return ret + first + second;
    }
};
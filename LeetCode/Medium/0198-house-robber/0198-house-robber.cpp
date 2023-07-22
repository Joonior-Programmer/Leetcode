class Solution {
public:
    int rob(vector<int>& nums) {
        int curr1 = 0;
        int curr2 = 0;
        
        for (int i = 0; i < nums.size(); ++i){
            int temp = max(curr1 + nums[i], curr2);
            curr1 = curr2;
            curr2 = temp;
        }
        
        return max(curr1, curr2);
    }
};
class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n = nums.size();
        int maxPosition = nums[0];
        
        for (int i = 1; i < n; ++i){
            if (maxPosition < i) return false;
            maxPosition = max(maxPosition, i + nums[i]);
            if (maxPosition >= n) return true;
        }
        
        return true;
    }
};
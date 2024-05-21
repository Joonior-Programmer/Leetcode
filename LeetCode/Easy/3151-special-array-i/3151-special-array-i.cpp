class Solution {
public:
    bool isArraySpecial(vector<int>& nums) {
        bool isOdd = true;
        
        if (nums[0] % 2 == 0) isOdd = false;
        
        for (int i = 1; i < nums.size(); ++i){
            if (nums[i] % 2 == isOdd) return false;
            
            isOdd = !isOdd;
        }
        
        return true;
    }
};
class Solution {
public:
    int findGCD(vector<int>& nums) {
        int a = INT_MAX;
        int b = INT_MIN;
        
        for (int i = 0; i < nums.size(); ++i){
            int temp = nums[i];
            a = min(a, temp);
            b = max(b, temp);
        }
        
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
};
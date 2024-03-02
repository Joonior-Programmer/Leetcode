class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> count(20001);
        int j = 0;
        
        for (int i = 0; i < nums.size(); ++i) ++count[nums[i] + 10000];
        
        while (count[10000] > 0) {
            count[10000]--;
            nums[j++] = 0;
        }
        
        for (int i = 1; i < 10001; ++i){
            while (count[10000+i] > 0) {
                count[10000+i]--;
                nums[j++] = i * i;
            }
            
            while (count[10000-i] > 0) {
                count[10000-i]--;
                nums[j++] = i * i;
            }    
        }
        
        return nums;
    }
};
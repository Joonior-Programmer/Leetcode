class Solution {
public:
    void sortColors(vector<int>& nums) {
        vector<int> count(3);
        int idx = 0;
        
        for (int i = 0; i < nums.size(); ++i) ++count[nums[i]];
        
        for (int i = 0; i < nums.size(); ++i){
            while (count[idx] == 0) ++idx;
            
            nums[i] = idx;
            count[idx]--;
        }
    }
};
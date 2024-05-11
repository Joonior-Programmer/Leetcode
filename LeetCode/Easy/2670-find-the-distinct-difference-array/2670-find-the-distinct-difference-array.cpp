class Solution {
public:
    vector<int> distinctDifferenceArray(vector<int>& nums) {
        int n = nums.size();
        vector<int> count(51);
        vector<bool> checkPrefix(51);
        
        int prefix = 0;
        int elements = 0;
        
        for (int i = 0; i < n; ++i) 
            if (count[nums[i]]++ == 0) ++elements;
        
        for (int i = 0; i < n; ++i){
            int temp = nums[i];
            if (!checkPrefix[temp]) {
                ++prefix;
                checkPrefix[temp] = true;
            }
            
            if (count[temp]-- == 1) elements--;
            
            nums[i] = prefix - elements;
        }
        
        return nums;
    }
};
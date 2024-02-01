class Solution {
public:
    vector<vector<int>> divideArray(vector<int>& nums, int k) {
        vector<vector<int>> ret(nums.size()/3, vector<int>(3));
        vector<int> count(100001);
        int j = 1;
        
        for (int i = 0; i < nums.size(); ++i) ++count[nums[i]];
        
        for (int i = 0; i < nums.size() / 3; ++i){
            vector<int> temp(3);
            
            while (count[j] < 1) ++j;
            
            int min = j;
            int l = 0;
            
            while (l < 3){
                if (j - min > k) return vector<vector<int>>(0);
                
                if (count[j] > 0) {
                    temp[l++] = j;
                    count[j]--;
                }
                else ++j;
            }
            
            ret[i] = temp;
        }
        
        return ret;
    }
};
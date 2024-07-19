class Solution {
public:
    int numberOfPoints(vector<vector<int>>& nums) {
        vector<bool> count(101);
        int ret = 0;
        
        for (vector<int> v : nums){
            for (int i = v[0]; i < v[1] + 1; i++)
                if (!count[i]){
                    ++ret;
                    count[i] = true;
                }
        }
        
        return ret;
    }
};
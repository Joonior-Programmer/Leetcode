class Solution {
public:
    int heightChecker(vector<int>& heights) {
        int ret = 0;
        vector<int> compare = heights;
        sort(compare.begin(), compare.end());
        
        
        for (int i = 0; i < heights.size(); ++i)
            if (heights[i] != compare[i]) ++ret;
        
        return ret;
    }
};
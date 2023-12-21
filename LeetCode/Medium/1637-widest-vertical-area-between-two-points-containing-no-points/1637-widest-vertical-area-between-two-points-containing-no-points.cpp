class Solution {
public:
    int maxWidthOfVerticalArea(vector<vector<int>>& points) {
        vector<int> x(points.size());
        
        for (int i = 0; i < x.size(); ++i) x[i] = points[i][0];
        
        sort(x.begin(), x.end());
        
        int ret = 0;
        
        for (int i = 1; i < x.size(); ++i) ret = max(ret, x[i] - x[i-1]);
        
        return ret;
    }
};
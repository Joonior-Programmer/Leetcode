class Solution {
public:
    vector<vector<int>> construct2DArray(vector<int>& original, int m, int n) {
        ios_base::sync_with_stdio(false);
        cin.tie(0); 
        cout.tie(0);
        
        if (original.size() != m * n) return vector<vector<int>>(0);
        
        vector<vector<int>> ret(m, vector<int>(n));
        
        for (int row = 0; row < m; ++row)
            for (int col = 0; col < n; ++col)
                ret[row][col] = original[row * n + col];
        
        return ret;
    }
};
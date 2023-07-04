class Solution {
public:
    int equalPairs(vector<vector<int>>& grid) {
        unordered_map<long, int> exist;
        int n = grid.size();
        int ret = 0;
        
        for (int i = 0; i < n; ++i) {
            long hashed = hash(grid[i]);
            if (exist.find(hashed) == exist.end()) {
                exist[hashed] = 1;    
            } else {
                ++exist[hashed];
            }
        }
        
        for (int c = 0; c < n; ++c) {
            long hashed = 5;
            
            for (int r = 0; r < n; ++r) {
                hashed = (hashed * 5 + grid[r][c]) % 431554984;
            }
            
            if (exist.find(hashed) != exist.end()) ret += exist[hashed];
        }
        
        return ret;
    }
    
    long hash(vector<int>& vector) {
        long hashed = 5;
        
        for (int i = 0; i < vector.size(); ++i) hashed = (hashed * 5 + vector[i]) % 431554984;
        
        return hashed;
    }
};
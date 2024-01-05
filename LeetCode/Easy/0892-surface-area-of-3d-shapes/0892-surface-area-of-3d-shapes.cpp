class Solution {
public:
    int surfaceArea(vector<vector<int>>& grid) {
        if (grid.size() == 1)
            return grid[0][0] * 4 + 2;
        
        int n = grid.size();
        
        int ret = 0;
        int temp = grid[0][0];
        if (temp != 0)
            ret += temp * 4 + 2;
        

        for (int i = 1; i < n; ++i){
            temp = grid[0][i];
            if (temp != 0)
                ret += temp * 4 + 2 - min(temp, grid[0][i-1]) * 2;
            temp = grid[i][0];
            if (temp != 0)
                ret += temp * 4 + 2 - min(temp, grid[i-1][0]) * 2;
        }
        
        for (int i = 1; i < n; ++i)
            for (int j = 1; j < n; ++j){
                temp = grid[i][j];
                if (temp != 0)
                    ret += temp * 4 + 2 - 
                        (min(temp, grid[i-1][j]) + 
                            min(temp, grid[i][j-1])) * 2;
            }
        
        return ret;
    }
};
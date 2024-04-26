class Solution {
public:
    int minFallingPathSum(vector<vector<int>>& grid) {
        int rowLen = grid.size();
        int colLen = grid[0].size();

        if (colLen == 1) return grid[0][0];

        for (int row = rowLen - 1; row > 0; row--){
            int first = INT_MAX;
            int second = INT_MAX;
            int idx = 0;
            for (int col = 0; col < colLen; ++col){
                int temp = grid[row][col];
                if (temp < first){
                    idx = col;
                    second = first;
                    first = temp;
                } else if (temp < second) second = temp;
            }
            
            for (int col = 0; col < colLen; ++col){
                if (idx == col) grid[row-1][col] += second;
                else grid[row-1][col] += first;
            }
        }

        int ret = INT_MAX;
        
        for (int i = 0; i < colLen; ++i) ret = min(ret, grid[0][i]);
        
        return ret;
    }
};
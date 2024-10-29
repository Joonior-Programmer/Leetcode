class Solution {
public:
    int maxMoves(vector<vector<int>>& grid) {
        int rowLen = grid.size();
        int colLen = grid[0].size();
        
        vector<int> prev(rowLen, 1);
        
        for (int col = 1; col < colLen; ++col){
            vector<int> curr(rowLen);

            for (int row = 0; row < rowLen; ++row){
                if (row > 0 && grid[row-1][col-1] < grid[row][col]) curr[row] |= prev[row-1];
                if (row < rowLen - 1 && grid[row+1][col-1] < grid[row][col]) curr[row] |= prev[row+1];
                if (grid[row][col-1] < grid[row][col]) curr[row] |= prev[row];
            }
            
            bool isGood = false;
            
            for (int i = 0; i < rowLen; ++i)
                if (curr[i]){
                    isGood = true;
                    break;
                }
            
            if (!isGood) return col - 1;
            
            prev = curr;
        }

        return colLen - 1;
    }
};
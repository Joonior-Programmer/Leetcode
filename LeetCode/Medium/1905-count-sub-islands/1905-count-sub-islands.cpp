class Solution {
public:
    vector<vector<int>> grid1;
    vector<vector<int>> grid2;
    int rowLen;
    int colLen;
    
    int countSubIslands(vector<vector<int>>& grid1, vector<vector<int>>& grid2) {
        std::ios::sync_with_stdio(false);
        std::cin.tie(nullptr);
        std::cout.tie(nullptr);
        
        int ret = 0;
        
        this->grid1 = grid1;
        this->grid2 = grid2;
        rowLen = grid1.size() - 1;
        colLen = grid1[0].size() - 1;

        for (int r = 0; r < rowLen + 1; ++r)
            for (int c = 0; c < colLen + 1; ++c)
                if (this->grid1[r][c] == 1 && this->grid2[r][c] == 1)
                    if (dfs(r, c)) ++ret;

        
        return ret;
    }
    
    bool dfs(int row, int col){
        if (grid1[row][col] == 0 && grid2[row][col] == 1) return false;

        if (grid2[row][col] == 0) {
            grid2[row][col] = 0;
            return true;
        }

        grid2[row][col] = 0;

        bool l = true, r = true, u = true, d = true;

        if (row < rowLen) r = dfs(row + 1, col);
        if (row > 0) l = dfs(row - 1, col);
        if (col < colLen) u = dfs(row, col + 1);
        if (col > 0) d = dfs(row, col - 1);

        return l && r && u && d;
    }
};
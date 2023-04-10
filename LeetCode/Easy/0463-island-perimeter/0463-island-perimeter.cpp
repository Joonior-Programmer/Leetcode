class Solution {
public:
    int islandPerimeter(vector<vector<int>>& grid) {
        int ret = 0;
        for (int row = 0; row < grid.size(); ++row){
            for (int col = 0; col < grid[0].size(); ++col){
                if (grid[row][col] == 0) continue;
                ret += 4;
                if (row > 0 && grid[row - 1][col] == 1) ret -= 2;
                if (col > 0 && grid[row][col - 1] == 1) ret -= 2;
            }
        }
        return ret;
    }
};
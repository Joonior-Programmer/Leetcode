class Solution {
public:
    int orangesRotting(vector<vector<int>>& grid) {
        queue<pair<int, int>> q;
        int ret = 0;
        int rotten = 0;
        int fresh = 0;
        int rowLen = grid.size() - 1;
        int colLen = grid[0].size() - 1;
        
        for (int i = 0; i < rowLen + 1; ++i){
            for (int j = 0; j < colLen + 1; ++j){
                if (grid[i][j] == 2) {
                    q.push(make_pair(i, j));
                    ++rotten;
                } else if (grid[i][j] == 1) ++fresh;
            }
        }
        
        int total = fresh + rotten;
        
        if (total == rotten) return 0;
        
        while (!q.empty()){
            int repeat = q.size();
            for (int i = 0; i < repeat; ++i){
                int row = q.front().first;
                int col = q.front().second;
                q.pop();
                
                if (row > 0 && grid[row-1][col] == 1){
                    ++rotten;
                    q.push(make_pair(row-1, col));
                    grid[row-1][col] = 2;
                }
                if (row < rowLen && grid[row+1][col] == 1){
                    ++rotten;
                    q.push(make_pair(row+1, col));
                    grid[row+1][col] = 2;
                }
                if (col > 0 && grid[row][col-1] == 1){
                    ++rotten;
                    q.push(make_pair(row, col-1));
                    grid[row][col-1] = 2;
                }
                if (col < colLen && grid[row][col+1] == 1){
                    ++rotten;
                    q.push(make_pair(row, col+1));
                    grid[row][col+1] = 2;
                }
            }

            ++ret;
            if (total == rotten) return ret;
            
        }
        
        return -1;
        
    }
};
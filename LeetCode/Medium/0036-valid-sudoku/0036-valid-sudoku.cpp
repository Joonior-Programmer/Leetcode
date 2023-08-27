class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        int row[9][9]{0};
        int col[9][9]{0};
        int box[9][9]{0};
        
        for (int r = 0; r < 9; ++r){
            for (int c = 0; c < 9; ++c){
                int v = board[r][c] - 49;
                
                if (v < 0) continue;

                int boxNum = c / 3 + 3 * (r / 3);

                if (row[r][v] > 0 || col[c][v] > 0 || box[boxNum][v] > 0) return false;

                ++row[r][v];
                ++col[c][v];
                ++box[boxNum][v];
            }
        }
        
        return true;
    }
};
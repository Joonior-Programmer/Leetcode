class Solution {
public:
    int rowLen;
    int colLen;
    int n;
    vector<vector<char>> board;
    string word;
    bool exist(vector<vector<char>>& board, string word) {
        rowLen = board.size();
        colLen = board[0].size();
        n = word.size();
        this->word = word;
        this->board = board;

        for (int row = 0; row < rowLen; ++row){
            for (int col = 0; col < colLen; ++col){
                if (board[row][col] == word[0]){
                    if (dfs(row, col, 0)) return true;
                }
            }
        }
        
        return false;
    }
    
    bool dfs(int row, int col, int idx){
        ++idx;
        if (idx == n) return true;

        char temp = board[row][col];
        board[row][col] = '?';

        if (row > 0 && board[row-1][col] == word[idx] && dfs(row-1, col, idx)) return true;
        if (row < rowLen - 1 && board[row+1][col] == word[idx] && dfs(row+1, col, idx)) return true;
        if (col > 0 && board[row][col-1] == word[idx] && dfs(row, col-1, idx)) return true;
        if (col < colLen - 1 && board[row][col+1] == word[idx] && dfs(row, col+1, idx)) return true;
        
        board[row][col] = temp;
        
        return false;
    }
};
class Trie {
public:
    Trie* trie[26];
    string value;
    Trie() : value("") {
        for (int i = 0; i < 26; ++i) {
            trie[i] = nullptr;
        }
    }
};

class Solution {
public:
    int rowLen;
    int colLen;
    vector<vector<char>> board;
    vector<string> findWords(vector<vector<char>>& board, vector<string>& words) {
        this->board = board;
        vector<string> ret;
        
        Trie* trie = new Trie();

        rowLen = board.size() - 1;
        colLen = board[0].size() - 1;

        for (int i = 0; i < words.size(); ++i){
            Trie* curr = trie;
            for (int j = 0; j < words[i].size(); ++j){
                if (curr->trie[words[i][j] - 'a'] == nullptr) curr->trie[words[i][j] - 'a'] = new Trie();
                curr = curr->trie[words[i][j] - 'a'];
            }
            curr->value = words[i];
        }

        for (int row = 0; row < rowLen + 1; ++row){
            for (int col = 0; col < colLen + 1; ++col){
                dfs(row, col, trie, ret);
            }
        }

        return ret;
    }

    void dfs(int row, int col, Trie* parent, vector<string>& ret){
        char v = board[row][col] - 'a';
        if (parent->trie[v] == nullptr) return;

        Trie* curr = parent->trie[v];

        if (!curr->value.empty()){
            ret.push_back(curr->value);
            curr->value = "";
        }

        char temp = board[row][col];
        board[row][col] = '!';

        if (row > 0 && board[row-1][col] != '!') dfs(row-1, col, curr, ret);
        if (row < rowLen && board[row+1][col] != '!') dfs(row+1, col, curr, ret);
        if (col > 0 && board[row][col-1] != '!') dfs(row, col-1, curr, ret);
        if (col < colLen && board[row][col+1] != '!') dfs(row, col+1, curr, ret);

        board[row][col] = temp;
    }
};

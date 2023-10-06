class Solution {
    int rowLen;
    int colLen;
    List<String> ret;
    char[][] board;
    public List<String> findWords(char[][] board, String[] words) {
        ret = new ArrayList();
        Trie trie = new Trie();
        this.board = board;
        
        rowLen = board.length - 1;
        colLen = board[0].length - 1;
        
        for (int i = 0; i < words.length; ++i){
            char[] word = words[i].toCharArray();
            Trie curr = trie;
            for (int j = 0; j < word.length; ++j){
                if (curr.trie[word[j] - 'a'] == null) curr.trie[word[j] - 'a'] = new Trie();
                curr = curr.trie[word[j] - 'a'];
            }
            curr.value = new String(word);
        } 

        for (int row = 0; row < rowLen + 1; ++row){
            for (int col = 0; col < colLen + 1; ++col){
                dfs(row, col, trie);
            }
        }
        
        return ret;
    }
    
    private void dfs(int row, int col, Trie parent){
        if (board[row][col] == '!' || parent.trie[board[row][col]-'a'] == null) return;
        
        Trie curr = parent.trie[board[row][col]-'a'];
        
        if (curr.value != null){
            ret.add(curr.value);
            curr.value = null;
        }
        
        char temp = board[row][col];
        board[row][col] = '!';

        if (row > 0) dfs(row-1, col, curr);
        if (row < rowLen) dfs(row+1, col, curr);
        if (col > 0) dfs(row, col-1, curr);
        if (col < colLen) dfs(row, col+1, curr);

        board[row][col] = temp;
    }
}

class Trie {
    Trie[] trie;
    String value;
    
    Trie(){
        trie = new Trie[26];
        value = null;
    }
}
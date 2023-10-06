type Trie struct {
    trie []*Trie
    value string
}

func findWords(board [][]byte, words []string) []string {
    ret := make([]string, 0)
    
    trie := &Trie{make([]*Trie, 26), ""}
    
    rowLen := len(board) - 1
    colLen := len(board[0]) - 1
    
    for i := 0; i < len(words); i++ {
        curr := trie
        for j := 0; j < len(words[i]); j++ {
            if curr.trie[words[i][j] - 'a'] == nil { 
                curr.trie[words[i][j] - 'a'] = &Trie{make([]*Trie, 26), ""} 
            }
            curr = curr.trie[words[i][j] - 'a']
        }
        curr.value = words[i]
    }
    
    dfs := func (row, col int, parent *Trie) {}
    dfs = func(row, col int, parent *Trie) {
        v := board[row][col] - 'a'
        
        if parent.trie[v] == nil { return }
        
        curr := parent.trie[v]
        
        if len(curr.value) != 0 {
            ret = append(ret, curr.value)
            curr.value = ""
        }
        
        board[row][col] = '!'
        
        if row > 0 && board[row-1][col] != '!' { dfs(row-1, col, curr) }
        if row < rowLen && board[row+1][col] != '!' { dfs(row+1, col, curr) }
        if col > 0 && board[row][col-1] != '!' { dfs(row, col-1, curr) }
        if col < colLen && board[row][col+1] != '!' { dfs(row, col+1, curr) }
        
        board[row][col] = v + 'a'
    }
    
    
    for row := 0; row < rowLen + 1; row++ {
        for col := 0; col < colLen + 1; col++ {
            dfs(row, col, trie)
        }
    }
    
    return ret
}
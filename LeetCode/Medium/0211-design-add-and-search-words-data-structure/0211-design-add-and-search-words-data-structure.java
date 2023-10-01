class WordDictionary {
    Trie trie;
    char[] word;

    public WordDictionary() {
        trie = new Trie();
    }
    
    public void addWord(String word) {
        Trie curr = trie;
        char[] temp = word.toCharArray();
        for (int i = 0; i < temp.length; ++i){
            if (curr.trie[temp[i] - 97] == null) curr.trie[temp[i] - 97] = new Trie();
            curr = curr.trie[temp[i] - 97];
        }
        curr.valid = true;
    }
    
    public boolean search(String word) {
        this.word = word.toCharArray();
        return dfs(trie, 0);
    }

    private boolean dfs(Trie curr, int idx){        
        for (int i = idx; i < word.length; ++i){
            if (word[i] == '.'){
                for (int j = 0; j < 26; ++j){
                    if (curr.trie[j] != null) {
                        if (dfs(curr.trie[j], i+1)) return true;
                    }
                }
                return false;
            } else if (curr.trie[word[i] - 97] == null) return false;
            else curr = curr.trie[word[i] - 97];
        }

        if (curr.valid) return true;
        return false;
    }
}

class Trie {
    boolean valid;
    Trie[] trie;
    
    public Trie(){
        this.trie = new Trie[26];
        valid = false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
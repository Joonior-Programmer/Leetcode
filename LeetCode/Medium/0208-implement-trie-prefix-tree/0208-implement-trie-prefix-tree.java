class Trie {
    Trie[] trie;
    boolean isEnd = false;
    
    public Trie() {
        trie = new Trie[26];
    }
    
    public void insert(String word) {
        Trie curr = this;
        
        for (char v : word.toCharArray()){
            if (curr.trie[v - 'a'] == null) curr.trie[v-'a'] = new Trie();
            curr = curr.trie[v-'a'];
        }
        
        curr.isEnd = true;
    }
    
    public boolean search(String word) {
        Trie curr = this;
        
        for (char v : word.toCharArray()){
            if (curr.trie[v - 'a'] == null) return false;
            curr = curr.trie[v-'a'];
        }
        
        return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Trie curr = this;
        
        for (char v : prefix.toCharArray()){
            if (curr.trie[v - 'a'] == null) return false;
            curr = curr.trie[v-'a'];
        }
        
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
class Trie {
public:
    Trie* trie[26];
    bool valid;
};

class WordDictionary {
public:
    Trie* trie;
    string word;
    
    WordDictionary() {
        trie = new Trie();
    }
    
    void addWord(string word) {
        Trie* curr = trie;
        
        for (int i = 0; i < word.size(); i++){
            if (curr->trie[word[i]-97] == nullptr) curr->trie[word[i]-97] = new Trie();
            curr = curr->trie[word[i]-97];
        }
        curr->valid = true;
    }
    
    bool search(string word) {
        this->word = word;
        return dfs(trie, 0);
    }
    
    bool dfs(Trie* curr, int idx){
        for (int i = idx; i < word.size(); ++i){
            if (word[i] == '.'){
                for (int j = 0; j < 26; ++j){
                    if (curr->trie[j] != nullptr){
                        if (dfs(curr->trie[j], i + 1)) return true;
                    }
                }
                return false;
            } else if (curr->trie[word[i] - 97] == nullptr) return false;
            else curr = curr->trie[word[i]-97];
        }
        
        if (curr->valid) return true;
        return false;
    }
};



/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary* obj = new WordDictionary();
 * obj->addWord(word);
 * bool param_2 = obj->search(word);
 */
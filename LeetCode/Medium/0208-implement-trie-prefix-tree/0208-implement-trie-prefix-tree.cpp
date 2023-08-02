class Trie {
public:
    Trie* trie[26]{NULL};
    bool isEnd = false;

    Trie() {
    }
    
    void insert(string word) {
        Trie* curr = this;

        for (int i = 0; i < word.size(); ++i){
            if (!curr->trie[word[i]-'a']) curr->trie[word[i]-'a'] = new Trie();
            curr = curr->trie[word[i]-'a'];
        }

        curr->isEnd = true;
    }
    
    bool search(string word) {
        Trie* curr = this;

        for (int i = 0; i < word.size(); ++i){
            if (!curr->trie[word[i]-'a']) return false;
            curr = curr->trie[word[i]-'a'];
        }

        return curr->isEnd;
    }
    
    bool startsWith(string prefix) {
        Trie* curr = this;

        for (int i = 0; i < prefix.size(); ++i){
            if (!curr->trie[prefix[i]-'a']) return false;
            curr = curr->trie[prefix[i]-'a'];
        }

        return true;
    }
};

/**
 * Your Trie object will be instantiated and called as such:
 * Trie* obj = new Trie();
 * obj->insert(word);
 * bool param_2 = obj->search(word);
 * bool param_3 = obj->startsWith(prefix);
 */
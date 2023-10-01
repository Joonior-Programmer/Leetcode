type Trie struct {
    trie []*Trie
    valid bool
}

type WordDictionary struct {
    trie *Trie
}


func Constructor() WordDictionary {
    return WordDictionary{&Trie{make([]*Trie, 26), false}}
}


func (this *WordDictionary) AddWord(word string)  {
    curr := this.trie
    
    for i := 0; i < len(word); i++ {
        if curr.trie[word[i]-97] == nil { 
            curr.trie[word[i]-97] = &Trie{make([]*Trie, 26), false} 
        }
        curr = curr.trie[word[i]-97]
    }
    curr.valid = true
}


func (this *WordDictionary) Search(word string) bool {
    return dfs(this.trie, 0, word)
}

func dfs (curr *Trie, idx int, word string) bool {
    for i := idx; i < len(word); i++ {
        if word[i] == '.' {
            for j := 0; j < 26; j++ {
                if curr.trie[j] != nil {
                    if dfs(curr.trie[j], i + 1, word) {
                        return true
                    }
                }
            }
            return false
        } else if ( curr.trie[word[i] - 97] == nil ) {
            return false
        } else { curr = curr.trie[word[i] - 97] }
    }
    
    if curr.valid { return true }
    return false
}


/**
 * Your WordDictionary object will be instantiated and called as such:
 * obj := Constructor();
 * obj.AddWord(word);
 * param_2 := obj.Search(word);
 */
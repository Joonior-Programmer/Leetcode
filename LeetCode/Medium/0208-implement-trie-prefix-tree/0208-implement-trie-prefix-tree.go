type Trie struct {
    Trie [26]*Trie
    IsEnd bool
}


func Constructor() Trie {
    return Trie{}
}


func (this *Trie) Insert(word string)  {
    curr := this
    
    for _, v := range word {
        if curr.Trie[v-'a'] == nil {
            curr.Trie[v-'a'] = &Trie{}
        }
        
        curr = curr.Trie[v-'a']
    }
    
    curr.IsEnd = true
}


func (this *Trie) Search(word string) bool {
    curr := this
    
    for _, v := range word {
        if curr.Trie[v-'a'] == nil { return false }    
        curr = curr.Trie[v-'a']
    }
    
    return curr.IsEnd
}


func (this *Trie) StartsWith(prefix string) bool {
    curr := this
    
    for _, v := range prefix {
        if curr.Trie[v-'a'] == nil { return false }
        curr = curr.Trie[v-'a']
    }
    
    return true
}


/**
 * Your Trie object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Insert(word);
 * param_2 := obj.Search(word);
 * param_3 := obj.StartsWith(prefix);
 */
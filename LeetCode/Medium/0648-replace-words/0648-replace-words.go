type Trie struct {
	word     string
	children [26]*Trie
}

func (t *Trie) Insert(word string) {
	curr := t
	for _, ch := range word {
		index := ch - 'a'
		if curr.children[index] == nil { curr.children[index] = &Trie{} }
		curr = curr.children[index]
	}
	curr.word = word
}

func replaceWords(dictionary []string, sentence string) string {
    trie := &Trie{}
	
    for _, word := range dictionary { trie.Insert(word)	}

	words := strings.Split(sentence, " ")

	for i, word := range words {
		curr := trie
		for _, ch := range word {
			if curr.word != "" { break }
			index := ch - 'a'
			if curr.children[index] != nil {
				curr = curr.children[index]
			} else {
				break
			}
		}
		if curr.word != "" { words[i] = curr.word }
	}

	return strings.Join(words, " ")
}
func findSubstring(s string, words []string) []int {
    	ret := []int{}
	n := len(s)
	wordLen := len(words[0])
	numWords := len(words)
	totalLen := wordLen * numWords
	count := make(map[string]int)

	for _, word := range words {
		count[word]++
	}

	for i := 0; i < wordLen; i++ {
		l := i
		r := i
		tempCount := make(map[string]int)
		for r+wordLen <= n {
			tempWord := s[r : r+wordLen]
			r += wordLen
			if _, exists := count[tempWord]; exists {
				tempCount[tempWord]++
				for tempCount[tempWord] > count[tempWord] {
					tempCount[s[l : l+wordLen]]--
					l += wordLen
				}
				if r-l == totalLen {
					ret = append(ret, l)
					tempCount[s[l : l+wordLen]]--
					l += wordLen
				}
			} else {
				tempCount = make(map[string]int)
				l = r
			}
		}
	}

	return ret
}
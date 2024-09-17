func uncommonFromSentences(s1 string, s2 string) []string {
    count := make(map[string]int)
	result := []string{}
	
	splitAndCount := func(s string) {
		words := strings.Fields(s)
		for _, word := range words {
			count[word]++
		}
	}
	
	splitAndCount(s1)
	splitAndCount(s2)
	
	for word, freq := range count {
		if freq == 1 {
			result = append(result, word)
		}
	}
	
	return result
}
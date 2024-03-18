type Word struct {
	index int
	word  string
}

type ByIndex []Word

func (a ByIndex) Len() int           { return len(a) }
func (a ByIndex) Less(i, j int) bool { return a[i].index < a[j].index }
func (a ByIndex) Swap(i, j int)      { a[i], a[j] = a[j], a[i] }


func sortSentence(s string) string {
    words := strings.Split(s, " ")
	pairs := make([]Word, len(words))

	for i, word := range words {
		lastChar := word[len(word)-1]
		index, _ := strconv.Atoi(string(lastChar))
		pairs[i] = Word{index, word[:len(word)-1]}
	}

	sort.Sort(ByIndex(pairs))

	var result strings.Builder
	for i, pair := range pairs {
		result.WriteString(pair.word)
		if i != len(pairs)-1 {
			result.WriteString(" ")
		}
	}

	return result.String()
}
func arrayStringsAreEqual(word1 []string, word2 []string) bool {
    var a bytes.Buffer
    var b bytes.Buffer
    
    for i := 0; i < len(word1); i++ { a.WriteString(word1[i]) }
    for i := 0; i < len(word2); i++ { b.WriteString(word2[i]) }
    
    return a.String() == b.String()
}
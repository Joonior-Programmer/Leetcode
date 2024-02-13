func firstPalindrome(words []string) string {
    for _, word := range words {
        l := 0
        r := len(word) - 1

        for l < r {
            if word[l] != word[r] { break }
            l++
            r--
        }

        if l >= r { return word }
    }

    return ""
}
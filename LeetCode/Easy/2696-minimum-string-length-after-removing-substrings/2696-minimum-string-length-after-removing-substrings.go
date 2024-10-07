func minLength(s string) int {
    n := len(s)
    stack := make([]byte, n)

    j := 0

    for i := 0; i < n; i++ {
        v := s[i]

        if j > 0 && ((stack[j-1] == 'A' && v == 'B') || (stack[j-1] == 'C' && v == 'D')) {
            j--
        } else {
            stack[j] = v
            j++
        }
    }

    return j        
}
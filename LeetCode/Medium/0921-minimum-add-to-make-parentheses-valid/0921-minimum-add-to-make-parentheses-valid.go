func minAddToMakeValid(s string) int {
    n := len(s)
    stack := make([]rune, n)
    j := 0

    for _, v := range s {
        if j > 0 && stack[j-1] == '(' && v == ')' {
            j--
        } else { 
            stack[j] = v 
            j++
        }
    }

    return j
}
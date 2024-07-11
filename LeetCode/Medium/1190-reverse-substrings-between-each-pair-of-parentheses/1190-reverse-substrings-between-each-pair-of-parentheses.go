func reverseParentheses(s string) string {
    ret := make([]byte, 0)
    stack := make([]int, 0)
    idx := 0

    rev := func (l, r int){}
    rev = func (l, r int){
        fmt.Println(l, r)
        for l < r {
            ret[l], ret[r] = ret[r], ret[l]
            l++
            r--
        }
    }

    for i := 0; i < len(s); i++ {
        if s[i] == '(' {
            stack = append(stack, len(ret))
        } else if s[i] == ')' {
            rev(stack[len(stack)-1], len(ret) - 1)
            stack = stack[:len(stack)-1]
        } else {
            ret = append(ret, s[i]) 
            idx++
        }
    }
    
    return string(ret[:])
}
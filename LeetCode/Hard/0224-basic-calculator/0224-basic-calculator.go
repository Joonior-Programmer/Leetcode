func calculate(s string) int {
    ret := 0
    op := 1
    temp := 0
    stack := make([]int, 0)
    
    for _, v := range s {
        if unicode.IsDigit(v) {
            temp = temp * 10 + int(v - '0')
        } else if v == '+' {
            ret += op * temp
            op = 1
            temp = 0
        } else if v == '-' {
            ret += op * temp
            op = -1
            temp = 0
        } else if v == '(' {
            stack = append(stack, ret)
            stack = append(stack, op)
            ret = 0
            op = 1
        } else if v == ')' {
            ret += op * temp
            ret *= stack[len(stack)-1]
            ret += stack[len(stack)-2]
            stack = stack[:len(stack)-2]
            temp = 0
        }
    }
    
    ret += op * temp
    
    return ret
}
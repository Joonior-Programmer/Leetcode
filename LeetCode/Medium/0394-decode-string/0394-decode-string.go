func decodeString(s string) string {
    stack := make([]string, 0)
	repeat := make([]int, 0)
	cur := ""
	rp := 0

	for i := 0; i < len(s); i++ {
		if s[i] >= '0' && s[i] <= '9' {
			rp = rp*10 + int(s[i]-'0')
		} else if s[i] == '[' {
			stack = append(stack, cur)
			repeat = append(repeat, rp)
			rp = 0
			cur = ""
		} else if s[i] == ']' {
			temp := ""
			if len(stack) > 0 {
				temp = stack[len(stack)-1]
				stack = stack[:len(stack)-1]
			}
			temp += strings.Repeat(cur, repeat[len(repeat)-1])
			repeat = repeat[:len(repeat)-1]
			cur = temp
		} else {
			cur += string(s[i])
		}
	}

	return cur
}
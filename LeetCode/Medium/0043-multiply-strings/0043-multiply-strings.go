func multiply(num1 string, num2 string) string {
    n := len(num1)
	m := len(num2)
	ret := make([]int, n+m)

	for i := n - 1; i >= 0; i-- {
		v0 := int(num1[i] - '0')
		for j := m - 1; j >= 0; j-- {
			temp := v0 * int(num2[j]-'0') + ret[i+j+1]
			ret[i+j+1] = temp % 10
			ret[i+j] += temp / 10
		}
	}

	idx := 0
	for idx < len(ret) && ret[idx] == 0 {
		idx++
	}

	if len(ret) == idx {
		return "0"
	}

	var result strings.Builder
	for i := idx; i < len(ret); i++ {
		result.WriteString(strconv.Itoa(ret[i]))
	}

	return result.String()
}
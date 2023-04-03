func addStrings(num1 string, num2 string) string {
    ret := make([]string, 0)
    carry := 0
    i := len(num1) - 1
    j := len(num2) - 1
    for i > -1 && j > -1 {
        carry += int(num1[i]) + int(num2[j]) - 96
        ret = append(ret, strconv.Itoa(carry % 10))
        carry /= 10
        i--
        j--
    }

    for i > -1 {
        carry += int(num1[i]) - 48
        ret = append(ret, strconv.Itoa(carry % 10))
        carry /= 10
        i--
    }

    for j > -1 {
        carry += int(num2[j]) - 48
        ret = append(ret, strconv.Itoa(carry % 10))
        carry /= 10
        j--
    }

    if carry != 0 { ret = append(ret, strconv.Itoa(carry%10))}

    for i, j := 0, len(ret)-1; i < j; i, j = i + 1, j - 1{
        ret[i], ret[j] = ret[j], ret[i]
    }

    return strings.Join(ret, "")
}
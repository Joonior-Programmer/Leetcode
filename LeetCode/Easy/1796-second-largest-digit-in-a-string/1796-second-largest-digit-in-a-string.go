func secondHighest(s string) int {
    first, second := -1, -1
    used := make([]bool, 10)

    for _, v := range s {
        if v > 47 && v < 58 && !used[v - 48] {
            temp := int(v - '0')

            if temp > first {
                second = first
                first = temp
            } else if temp > second { second = temp }

            used[temp] = true
        }
    }

    return second
}
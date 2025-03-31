func calculateTax(brackets [][]int, income int) float64 {
    var ret float64= 0
    prev := 0

    for _, bracket := range brackets {
        if income == 0 { break }

        upper := bracket[0]
        temp := min(upper - prev, income)
        ret += float64(temp) * float64(bracket[1]) / 100
        income -= temp
        prev = upper
    }

    return ret
}

func min(a, b int) int {
    if a < b { return a }
    return b
}
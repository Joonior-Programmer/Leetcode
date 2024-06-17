func judgeSquareSum(c int) bool {
    l := 0
    r := int(math.Sqrt(float64(c)))

    for l <= r {
        temp := l * l + r * r

        if temp == c { return true }
        if temp < c {
            l++
        } else { r-- }
    }

    return false
}
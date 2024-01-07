func areaOfMaxDiagonal(dimensions [][]int) int {
    l := 0
    w := 0

    for _, v := range dimensions {
        original := l * l + w * w
        newArea := v[0] * v[0] + v[1] * v[1]

        if newArea > original || (original == newArea && l * w < v[0] * v[1]) {
            l = v[0]
            w = v[1]
        }
    }

    return l * w;
}
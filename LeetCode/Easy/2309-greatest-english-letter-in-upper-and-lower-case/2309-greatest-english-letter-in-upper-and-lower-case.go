func greatestLetter(s string) string {
    lower := make([]bool, 26)
    upper := make([]bool, 26)

    for _, v := range s {
        if v > 96 {
            lower[v-97] = true
        } else { upper[v-65] = true }
    }

    for i := 25; i > -1; i-- {
        if upper[i] && lower[i] { return string('A' + i) }
    }

    return ""
}
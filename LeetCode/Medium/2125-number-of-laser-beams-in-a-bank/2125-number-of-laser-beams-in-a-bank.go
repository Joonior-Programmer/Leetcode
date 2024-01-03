func numberOfBeams(bank []string) int {
    ret := 0
    prev := 0

    for _, row := range bank {
        temp := 0
        for i := 0; i < len(row); i++ { temp += int(row[i] - '0') }

        if temp > 0 {
            ret += prev * temp
            prev = temp
        }
    }

    return ret
}
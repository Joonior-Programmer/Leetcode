func findMinDifference(timePoints []string) int {
    n := len(timePoints)
    time := make([]int, n)
    exist := make([]bool, 1440)
    i := 0

    for _, v := range timePoints {
        temp := (int(v[0]) - 48) * 600 + (int(v[1]) - 48) * 60 + 
        (int(v[3]) - 48) * 10 + int(v[4]) - 48

        if exist[temp] { return 0 }

        exist[temp] = true
        time[i] = temp
        i++
    }

    sort.Ints(time)

    ret := 24 * 60 - time[n-1] + time[0]

    for i = 1; i < n; i++ { ret = min(ret, time[i] - time[i-1]) }

    return ret
}

func min(a, b int) int {
    if b < a { return b }
    return a
}
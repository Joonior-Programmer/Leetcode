func findWinners(matches [][]int) [][]int {
    count := make(map[int]int)
    ret := make([][]int, 2)
    ret[0] = make([]int, 0)
    ret[0] = make([]int, 0)

    for i := 0; i < len(matches); i++ {
        if _, ok := count[matches[i][0]]; !ok {
            count[matches[i][0]] = 0
        }
        
        if _, ok := count[matches[i][1]]; ok {
            count[matches[i][1]]++
        } else { count[matches[i][1]]++ }
    }

    for k, v := range count {
        if v == 0 {
            ret[0] = append(ret[0], k)
        } else if v == 1 { ret[1] = append(ret[1], k) }
    }

    sort.Ints(ret[0]);
    sort.Ints(ret[1]);

    return ret;
}
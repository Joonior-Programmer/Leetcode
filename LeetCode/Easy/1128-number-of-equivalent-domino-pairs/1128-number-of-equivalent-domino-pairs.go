func numEquivDominoPairs(dominoes [][]int) int {
    count := make([][]int, 10)
    ret := 0

    for i := 0; i < 10; i++ { count[i] = make([]int, 10) }
    
    for i := 0; i < len(dominoes); i++ {
        v1 := dominoes[i][0]
        v2 := dominoes[i][1]

        if v1 < v2 {
            count[v1][v2]++
        } else { count[v2][v1]++ }
    }

    for i := 1; i < 10; i++ {
        for j := 1; j < 10; j++ {
            ret += (count[i][j]*(count[i][j]-1)) / 2;
        }
    }
    
    return ret;
}
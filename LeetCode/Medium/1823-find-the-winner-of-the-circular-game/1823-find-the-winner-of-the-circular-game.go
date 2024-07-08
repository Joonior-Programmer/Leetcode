func findTheWinner(n int, k int) int {
    players := make([]bool, n)
    i := 0
    k--
    turn := k
    ret := 0

    for j := 0; j < n - 1; j++{
        for turn > 0 {
            if i == n { i -= n }

            if players[i] {
                i++ 
            } else {
                turn--
                i++
            }                
        }

        if i >= n { i = 0 }
        for players[i] {
            i++
            if i == n { i = 0 }
        }

        players[i] = true
        i++
        turn = k
    }

    for j := 0; j < n; j++ {
        if !players[j] {
            ret = j + 1
            break;
        }
    }

    return ret
}
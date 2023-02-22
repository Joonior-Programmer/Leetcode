func isHappy(n int) bool {
    visited := make(map [int]bool)
    for n != 1 {
        if visited[n] {
            return false
        }
        visited[n] = true
        temp := 0
        tempN := n
        for tempN > 0 {
            temp += (tempN % 10) * (tempN % 10)
            tempN /= 10
        }
        n = temp
    }
    return true
}
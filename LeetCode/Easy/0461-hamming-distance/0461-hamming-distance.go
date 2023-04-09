func hammingDistance(x int, y int) int {
    ret := 0
    for x != 0 || y != 0 {
        if (x & 1) != (y & 1) {ret++}
        x >>= 1
        y >>= 1
    }
    return ret
}
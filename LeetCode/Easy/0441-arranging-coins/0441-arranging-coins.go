func arrangeCoins(n int) int {
    var l int64 = 1
    var r int64 = int64(n)
    var mid int64
    var temp int64
    var newN int64 = r
    for l <= r {
        mid = (l+r) / 2
        temp = mid * (mid+1) / 2
        if newN >= temp { 
            l = mid + 1
        } else { r = mid - 1}
    }
    return int(r)
}
func isPerfectSquare(num int) bool {
    
    var l int64 = 1;
    var r int64 = int64(num);
    target := r
    var mid int64;
    for l < r {
        mid = (l + r) / 2;
        if mid * mid == target {
            return true
        } else if mid * mid < target {
            l = mid + 1
        } else {r = mid}
    }
    if num * num == num {return true}
    return false
}
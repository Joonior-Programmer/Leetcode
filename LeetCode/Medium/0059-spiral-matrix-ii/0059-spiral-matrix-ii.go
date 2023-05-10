func generateMatrix(n int) [][]int {
    ret := make([][]int, 0)
    
    for i := 0; i < n; i++ {
        ret = append(ret, make([]int, n))
    }
    
    cur := 1;
    left := 0;
    right := n;
    top := 0;
    bottom := n;
    target := n * n;
    
    for cur <= target {
        for i := left; i < right; i++ {
            ret[top][i] = cur
            cur++
        }
        top++

        for i := top; i < bottom; i++ {
            ret[i][right-1] = cur
            cur++
        }
        right--

        for i := right - 1; i > left - 1; i-- {
            ret[bottom-1][i] = cur
            cur++
        }
        bottom--

        for i := bottom - 1; i > top - 1; i-- {
            ret[i][left] = cur
            cur++
        }
        left++
    }
    return ret;
}
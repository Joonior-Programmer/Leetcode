func spiralOrder(matrix [][]int) []int {
    ret := make([]int, 0)
    left := 0
    right := len(matrix[0])
    top := 0;
    bottom := len(matrix)
    for left < right && top < bottom {
        for i := left; i < right; i++ { ret = append(ret, matrix[top][i]) }
        top++

        for i := top; i < bottom; i++ { ret = append(ret, matrix[i][right-1]) }
        right--

        if (left >= right || top >= bottom) {break}

        for i := right - 1; i > left - 1; i-- { ret = append(ret, matrix[bottom-1][i]) }
        bottom--;

        for i := bottom - 1; i > top - 1; i-- { ret = append(ret, matrix[i][left])}
        left++
    }
    return ret;
}
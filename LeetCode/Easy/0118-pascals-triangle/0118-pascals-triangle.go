func generate(numRows int) [][]int {
    var ret [][]int
    for i := 0; i < numRows; i++{
        temp := make([]int, i+1)
        for j := 0; j < i+1; j++ {
            if j == i || j == 0 {
                temp[j] = 1
            } else {
                temp[j] = ret[i-1][j-1] + ret[i-1][j]
            }
        }
        ret = append(ret, temp)
    }
    return ret
}
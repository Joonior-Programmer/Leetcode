func getRow(rowIndex int) []int {
    ret := make([]int, 1+rowIndex)
    ret[0] = 1
    
    for i := 1; i < rowIndex + 1; i++{
        temp := make([]int, i)
        copy(temp, ret)
        for j := 1; j < i + 1; j++ {
            if i == j { ret[j] = 1 }
            if i != j { ret[j] += temp[j-1] }
        }
    }
    return ret
}
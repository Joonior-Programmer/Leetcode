func findMatrix(nums []int) [][]int {
    count := make([]int, 201)
    ret := make([][]int, 0)
    
    for _, num := range nums {
        if count[num] == len(ret) { ret = append(ret, make([]int, 0)) }
        ret[count[num]] = append(ret[count[num]], num)
        count[num]++
    }
            
    return ret
}
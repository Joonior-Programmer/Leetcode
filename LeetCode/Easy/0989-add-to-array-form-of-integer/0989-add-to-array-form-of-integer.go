func addToArrayForm(num []int, k int) []int {
    var ret []int
    i := len(num) - 1
    
    for i > -1 || k > 0 {
        if i > -1 {
            k += num[i]
            i--
        }
        ret = append(ret, k % 10)
        k /= 10
    }
    
    for i, j := 0, len(ret)-1; i < j;i, j = i+1, j-1 {
        fmt.Println("1")
        ret[i], ret[j] = ret[j], ret[i]
    }
    return ret
}
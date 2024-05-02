func findMaxK(nums []int) int {
    check := make([]bool, 2001)
        
    for _, v := range nums { check[v+1000] = true }

    for i := 1000; i > -1; i-- {
        if check[i+1000] && check[1000-i] { return i }
    }

    return -1
}
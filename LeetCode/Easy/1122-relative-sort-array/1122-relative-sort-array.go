func relativeSortArray(arr1 []int, arr2 []int) []int {
    count := make([]int, 1001)
    idx := 0

    for i := 0; i < len(arr1); i++ { count[arr1[i]]++ }

    for _, v := range arr2 {
        for count[v] > 0 {
            arr1[idx] = v
            idx++
            count[v]--
        }
    }

    for i := 0; i < 1001; i++ {
        for count[i] > 0 {
            arr1[idx] = i
            idx++
            count[i]--
        }
    }

    return arr1
}
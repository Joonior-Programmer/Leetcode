func countTriplets(arr []int) int {
    n := len(arr)
    ret := 0

    for i := 0; i < n; i++ {
        temp := arr[i]

        for j := i + 1; j < n; j++ {
            temp ^= arr[j]
            if temp == 0 { ret += j - i }
        }
    }

    return ret;
}
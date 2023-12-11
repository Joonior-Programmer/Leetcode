func findSpecialInteger(arr []int) int {
    n := len(arr)
    target := n / 4
    curr := arr[0]
    count := 1

    for i := 1; i < n; i++ {
        if curr == arr[i] {
            count++
        } else {
            count = 1
            curr = arr[i]
        }

        if count > target { break }
    }

    return curr
}
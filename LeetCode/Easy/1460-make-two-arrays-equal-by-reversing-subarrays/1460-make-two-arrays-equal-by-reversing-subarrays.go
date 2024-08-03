func canBeEqual(target []int, arr []int) bool {
    n := len(target)
    a := make([]int, 1001)
    b := make([]int, 1001)

    for i := 0; i < n; i++{
        a[target[i]]++
        b[arr[i]]++
    }

    for i := 1; i < 1001; i++ {
        if a[i] != b[i] { return false }
    }

    return true;
}
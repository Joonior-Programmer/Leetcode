func findKthPositive(arr []int, k int) int {
    i := 0;
    min_num := 1;
    for j := 0; j < len(arr); j++ {
        if arr[j] != min_num {
            if arr[j] - min_num >= k - i { return min_num + k - i - 1; }
            i += arr[j] - min_num;
            min_num = arr[j] + 1;
            continue
        }
        min_num += 1
    }
    return min_num + k - i - 1;
}
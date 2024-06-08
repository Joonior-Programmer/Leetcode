func checkSubarraySum(nums []int, k int) bool {
    exist := make(map[int]int)
    exist[0] = -1;
    curr := 0;

    for i := 0; i < len(nums); i++ {
        curr = (curr + nums[i]) % k

        if _, ok := exist[curr]; ok {
            if i - exist[curr] > 1 { return true }
        } else { exist[curr] = i }
    }

    return false
}
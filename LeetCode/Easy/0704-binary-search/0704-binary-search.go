func search(nums []int, target int) int {
    l, r := 0, len(nums) - 1

    for l <= r {
        mid := (l + r) / 2
        v := nums[mid]

        if v == target {
            return mid
        } else if v < target {
            l = mid + 1
        } else {
            r = mid - 1
        }
    }

    return -1
}
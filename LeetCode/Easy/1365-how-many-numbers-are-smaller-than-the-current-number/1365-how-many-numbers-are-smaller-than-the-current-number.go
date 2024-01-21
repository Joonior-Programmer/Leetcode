func smallerNumbersThanCurrent(nums []int) []int {
    count := make([]int, 101)
    curr := 0

    for i := 0; i < len(nums); i++ { count[nums[i]]++ }

    for i := 0; i < 101; i++ {
        temp := count[i]
        count[i] = curr
        curr += temp
    }

    for i := 0; i < len(nums); i++ { nums[i] = count[nums[i]] }

    return nums
}
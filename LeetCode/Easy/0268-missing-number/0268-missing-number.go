func missingNumber(nums []int) int {
    sum := 0
    originalSum := 0
    for i := 0; i < len(nums); i++ {sum += nums[i]}
    for i := 1; i < len(nums)+1; i++ {originalSum += i}
    return originalSum - sum
}
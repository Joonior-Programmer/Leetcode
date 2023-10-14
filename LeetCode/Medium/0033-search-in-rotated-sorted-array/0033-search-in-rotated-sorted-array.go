func search(nums []int, target int) int {
    l := 0
    r := len(nums) - 1
    mid := 0

    for l < r {
        mid = (r + l) / 2

        if nums[mid] > nums[r] {
          l = mid + 1  
        } else { r = mid }
    }

    if nums[l] <= target && target <= nums[len(nums) - 1] {
        r = len(nums) - 1
    } else {
        r = l
        l = 0
    }

    for l <= r {
        mid = (r + l) / 2
        if nums[mid] == target {
            return mid 
        } else if nums[mid] < target {
            l = mid + 1  
        } else { r = mid - 1 }
    }

    return -1
}
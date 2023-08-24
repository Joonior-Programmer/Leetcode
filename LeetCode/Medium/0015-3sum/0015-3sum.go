func threeSum(nums []int) [][]int {
    sort.Ints(nums)
    ret := make([][]int, 0)
    n := len(nums) - 1
    
    for i := 0; i < n - 1; i++ {
        if i > 0 && nums[i] == nums[i-1] { continue }
        l := i + 1
        r := n
        
        for l < r {
            sum := nums[i] + nums[l] + nums[r]
            if sum == 0 {
                ret = append(ret, []int{nums[i], nums[l], nums[r]})
                l++
                r--
                
                for l < r && nums[l] == nums[l-1] {l++}
                for l < r && nums[r] == nums[r+1] {r--}
                
            } else if sum < 0 { 
                l++ 
            } else {
                r--
            }
        }
    }
    
    return ret
}
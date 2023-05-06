func numSubseq(nums []int, target int) int {
    ret := 0
    pow := make([]int, len(nums))
    mod := 1000000007
    pow[0] = 1
    
    for i := 1; i < len(nums); i++ {
        pow[i] = (pow[i-1] * 2) % mod
    }
    
    l, r := 0, len(nums) - 1
    
    sort.Ints(nums)
    
    for l <= r {
        if nums[l] + nums[r] > target {
            r--
        } else {
            ret = (ret + pow[r-l]) % mod
            l++
        }
    }
    
    return ret
}
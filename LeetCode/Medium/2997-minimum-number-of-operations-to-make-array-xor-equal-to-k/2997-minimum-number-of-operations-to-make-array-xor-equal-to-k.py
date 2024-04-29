class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        curr = nums[0]
        ret = 0
        
        for v in nums[1:]:
            curr ^= v
        
        while curr or k:
            if curr % 2 != k % 2:
                ret += 1
            curr >>= 1
            k >>= 1
            
        return ret
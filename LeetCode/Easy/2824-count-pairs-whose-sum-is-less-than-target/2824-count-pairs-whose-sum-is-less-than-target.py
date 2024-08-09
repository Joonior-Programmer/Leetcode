class Solution:
    def countPairs(self, nums: List[int], target: int) -> int:
        ret = 0
        n = len(nums)
        
        for i in range(n):
            for j in range(i+1, n):
                if nums[i] + nums[j] < target:
                    ret += 1
                
        return ret
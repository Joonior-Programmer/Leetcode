class Solution:
    def arithmeticTriplets(self, nums: List[int], diff: int) -> int:
        n = len(nums)
        ret = 0
        
        for i in range(n):
            for j in range(i+1, n):
                if nums[j] - nums[i] == diff:
                    for k in range(j+1, n):
                        if nums[k] - nums[j] == diff:
                            ret += 1
        
        return ret
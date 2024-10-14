class Solution:
    def maxKelements(self, nums: List[int], k: int) -> int:
        nums = [-v for v in nums]
        heapify(nums)

        ret = 0
        
        for i in range(k):
            ret -= heappushpop(nums, floor(nums[0] / 3))
        
        return ret
        
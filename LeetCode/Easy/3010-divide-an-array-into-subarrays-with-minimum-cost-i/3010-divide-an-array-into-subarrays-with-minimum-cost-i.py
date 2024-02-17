class Solution:
    def minimumCost(self, nums: List[int]) -> int:
        ret = nums[0]
        first = 999
        second = 999
        
        for i in range(1, len(nums)):
            temp = nums[i]
            if temp < first:
                second = first
                first = temp
            elif temp < second:
                second = temp
        
        return ret + first + second
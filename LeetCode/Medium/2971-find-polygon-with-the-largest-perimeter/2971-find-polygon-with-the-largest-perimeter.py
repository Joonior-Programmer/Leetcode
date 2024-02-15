class Solution:
    def largestPerimeter(self, nums: List[int]) -> int:
        nums.sort()
        sum_num = sum(nums)
        
        while len(nums) > 2:
            if nums[-1] >= sum(nums) - nums[-1]:
                sum_num -= nums[-1]
                nums.pop()
            else:
                break
        
        if len(nums) < 3:
            return -1
        
        return sum(nums)
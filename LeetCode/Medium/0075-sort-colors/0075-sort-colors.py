class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        count = [0] * 3
        
        for num in nums:
            count[num] += 1
        
        idx = 0
        
        for i in range(len(nums)):
            while not count[idx]:
                idx += 1
                
            nums[i] = idx
            count[idx] -= 1
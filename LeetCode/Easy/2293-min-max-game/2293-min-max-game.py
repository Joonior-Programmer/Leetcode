class Solution:
    def minMaxGame(self, nums: List[int]) -> int:
        while len(nums) > 1:
            temp = [0] * (len(nums) // 2)
            
            i = 0
            is_min = True
            while i < len(nums):
                if is_min:
                    temp[i//2] = min(nums[i], nums[i+1])
                else:
                    temp[i//2] = max(nums[i], nums[i+1])
                is_min = not is_min
                i += 2
            
            nums = temp
        
        return nums[0]
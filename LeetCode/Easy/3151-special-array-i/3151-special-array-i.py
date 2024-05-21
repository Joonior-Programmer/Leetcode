class Solution:
    def isArraySpecial(self, nums: List[int]) -> bool:
        is_odd = True
        
        if not nums[0] % 2:
            is_odd = False
        
        for i in range(1, len(nums)):
            if is_odd == nums[i] % 2:
                return False
            is_odd = not is_odd
        
        return True
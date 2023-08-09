class Solution:
    def canJump(self, nums: List[int]) -> bool:
        max_position = nums[0]

        for i in range(1, len(nums)):
            if max_position < i:
                return False
            max_position = max(max_position, i + nums[i])
            
        return True
class Solution:
    def jump(self, nums: List[int]) -> int:
        max_position = 0
        next_max = 0
        ret = 0

        for i in range(len(nums)-1):
            next_max = max(next_max, i + nums[i])
            if i == max_position:
                ret += 1
                max_position = next_max
        
        return ret
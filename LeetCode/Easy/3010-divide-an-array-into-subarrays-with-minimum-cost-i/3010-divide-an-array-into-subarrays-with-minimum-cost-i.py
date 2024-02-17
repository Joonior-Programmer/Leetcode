class Solution:
    def minimumCost(self, nums: List[int]) -> int:
        count = Counter(nums)
        left = 2
        i = 1
        ret = nums[0]
        count[nums[0]] -= 1
        
        while left:
            if count[i]:
                count[i] -= 1
                ret += i
                left -= 1
            else:
                i += 1
        
        return ret
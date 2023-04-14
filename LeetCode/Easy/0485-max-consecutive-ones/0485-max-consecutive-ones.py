class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        ret = 0
        temp = 0
        for num in nums:
            if num == 0:
                ret = max(temp, ret)
                temp = 0
                continue
            temp += 1
        return max(temp, ret)
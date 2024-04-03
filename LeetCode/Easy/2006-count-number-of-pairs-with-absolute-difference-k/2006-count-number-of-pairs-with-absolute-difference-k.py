class Solution:
    def countKDifference(self, nums: List[int], k: int) -> int:
        n = len(nums)
        count = [0] * 101
        ret = 0

        for i in range(n):
            count[nums[i]] += 1

        for i in range(1, 101-k):
            ret += count[i] * count[i+k] 

        return ret
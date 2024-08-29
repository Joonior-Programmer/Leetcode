class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        count = Counter(nums)
        ret = 0

        for v in count.values():
            ret += v * (v - 1) // 2
        
        return ret
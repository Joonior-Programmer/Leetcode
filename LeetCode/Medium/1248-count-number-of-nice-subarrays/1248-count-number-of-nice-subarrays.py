class Solution:
    def numberOfSubarrays(self, nums: List[int], k: int) -> int:
        n = len(nums)
        count = [0] * (n + 1)
        count[0] += 1
        curr = 0
        ret = 0

        for v in nums:
            if v % 2:
                curr += 1
            if curr >= k and count[curr-k]:
                ret += count[curr-k]
            count[curr] += 1
            
        
        return ret
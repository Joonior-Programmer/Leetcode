class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        exist = defaultdict(int)
        ret = 0
        curr = 0
        
        for v in nums:
            curr = (curr + v) % k

            if curr == 0:
                ret += 1

            if curr in exist:
                ret += exist[curr]
            
            exist[curr] += 1
        
        return ret
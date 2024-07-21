class Solution:
    def lastVisitedIntegers(self, nums: List[int]) -> List[int]:
        seen = deque()
        ret = []
        k = 0
        
        for v in nums:
            if v != -1:
                k = 0
                seen.appendleft(v)
            else:
                k += 1

                if k > len(seen):
                    ret.append(-1)
                else:
                    ret.append(seen[k-1])
                
        return ret
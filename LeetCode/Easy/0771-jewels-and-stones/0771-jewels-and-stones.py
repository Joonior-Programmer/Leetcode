class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        types = set([jewel for jewel in jewels])
        ret = 0
        
        for v in stones:
            if v in types:
                ret += 1
        
        return ret
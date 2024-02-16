class Solution:
    def findLeastNumOfUniqueInts(self, arr: List[int], k: int) -> int:
        counter = Counter(arr)
        count = [0] * (len(arr) + 1)
        ret = 0
        
        for v in counter.values():
            count[v] += 1
            ret += 1
        
        i = 1
        
        while k:
            if count[i]:
                count[i] -= 1
                k -= i
                ret -= 1
            else:
                i += 1
            
            if k < 1:
                break
        
        if k < 0:
            return ret + 1
        return ret
            
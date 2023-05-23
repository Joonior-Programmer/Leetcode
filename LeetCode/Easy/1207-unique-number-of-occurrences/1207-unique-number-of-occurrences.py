class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        count = [0] * 2000
        ret = [0] * 1001
        for v in arr:
            count[v+1000] += 1
        
        for v in count:
            if v == 0:
                continue
            if ret[v] != 0:
                return False
            ret[v] += 1
            
        return True
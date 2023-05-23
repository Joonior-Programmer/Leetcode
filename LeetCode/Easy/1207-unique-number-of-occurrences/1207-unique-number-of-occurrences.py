class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        count = [0] * 2000
        ret = set()
        for v in arr:
            count[v+1000] += 1
        
        for v in count:
            if v != 0 and v in ret:
                return False
            ret.add(v)
            
        return True
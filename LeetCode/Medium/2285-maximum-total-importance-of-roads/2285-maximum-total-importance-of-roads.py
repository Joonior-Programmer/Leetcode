class Solution:
    def maximumImportance(self, n: int, roads: List[List[int]]) -> int:
        count = [0] * n
        order = []
        ret = 0
        curr = 1
        
        for v0, v1 in roads:
            count[v0] += 1
            count[v1] += 1
        
        for v in count:
            heappush(order, v)
        
        while order:
            ret += heappop(order) * curr
            curr += 1
        
        return ret
        
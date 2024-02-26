class Solution:
    def findCenter(self, edges: List[List[int]]) -> int:
        count = [0] * (len(edges) + 2)
        ret = 0
        
        for v0, v1 in edges:
            count[v0] += 1
            count[v1] += 1
        
        for i in range(1, len(count)):
            if count[i] > ret:
                ret = i
        
        return ret
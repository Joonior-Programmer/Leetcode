class Solution:
    def findLucky(self, arr: List[int]) -> int:
        n = len(arr)
        count = [0] * 501
        
        for v in arr:
            count[v] += 1
        
        for i in range(n, 0, -1):
            if count[i] == i:
                return i
        
        return -1
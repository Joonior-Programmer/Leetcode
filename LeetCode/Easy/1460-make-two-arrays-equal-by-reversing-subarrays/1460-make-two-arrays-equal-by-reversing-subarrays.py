class Solution:
    def canBeEqual(self, target: List[int], arr: List[int]) -> bool:
        n = len(target)
        a = [0] * 1001 
        b = [0] * 1001
        
        for i in range(n):
            a[target[i]] += 1
            b[arr[i]] += 1
        
        for i in range(1, 1001):
            if a[i] != b[i]:
                return False
        
        return True
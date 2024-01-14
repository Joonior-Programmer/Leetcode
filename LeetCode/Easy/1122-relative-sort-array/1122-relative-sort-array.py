class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        count = [0] * 1001
        i = 0
        
        for v in arr1:
            count[v] += 1
        
        for v in arr2:
            while count[v]:
                arr1[i] = v
                count[v] -= 1
                i += 1
        
        for j in range(1001):
            while count[j]:
                arr1[i] = j
                count[j] -= 1
                i += 1
            
        return arr1
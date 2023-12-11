class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        n = len(arr)
        limit = n * 0.25
        curr = arr[0]
        count = 1
        
        for i in range(1, n):
            if arr[i] == curr:
                count += 1
            else:
                curr = arr[i]
                count = 1

            if count > limit:
                return curr
        
        return curr
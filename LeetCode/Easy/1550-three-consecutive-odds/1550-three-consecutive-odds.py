class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        i = 0
        
        while i < len(arr) - 2:
            if arr[i+2] % 2 == 0:
                i += 3
            elif arr[i+1] % 2 == 0:
                i += 2
            elif arr[i] % 2 == 0:
                i += 1
            else:
                return True
        
        return False
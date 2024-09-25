class Solution:
    def largeGroupPositions(self, s: str) -> List[List[int]]:
        ret = []
        n = len(s)
        i = 0

        while i < n:
            j = i + 1

            while j < n and s[j] == s[i]:
                j += 1
            
            if j - i > 2:
                ret.append([i, j - 1])
            
            i = j
        
        return ret
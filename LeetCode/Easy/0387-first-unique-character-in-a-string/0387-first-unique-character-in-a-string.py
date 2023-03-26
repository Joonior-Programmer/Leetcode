class Solution:
    def firstUniqChar(self, s: str) -> int:
        counter = Counter(s)
        
        if 1 not in counter.values():
            return -1
        
        for i in range(len(s)):
            if counter[s[i]] == 1:
                return i
            
        

                
            
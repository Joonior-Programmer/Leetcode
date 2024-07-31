class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:
        if len(words) != len(s): return False
        
        for i in range(len(s)):
            if words[i][0] != s[i]: return False
        
        return True
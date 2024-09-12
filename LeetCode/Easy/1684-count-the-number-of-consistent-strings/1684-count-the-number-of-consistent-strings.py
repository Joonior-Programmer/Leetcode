class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        allow = set(allowed)
        ret = len(words)
        
        for word in words:
            for v in word:
                if v not in allow:
                    ret -= 1
                    break
        
        return ret
                    
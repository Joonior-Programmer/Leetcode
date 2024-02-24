class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        count = Counter(text)
        ret = 99999
        
        ret = min(ret, count["b"])
        ret = min(ret, count["a"])
        ret = min(ret, count["l"] // 2)
        ret = min(ret, count["o"] // 2)
        ret = min(ret, count["n"])
        
        return ret
        
        
        
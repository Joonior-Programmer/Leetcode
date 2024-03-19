class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        ret = 0

        for v in sentences:
            ret = max(ret, len(v.split()))
    
        return ret
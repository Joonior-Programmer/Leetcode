class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        ret = []

        i = 0
        j = 0

        while i < len(word1) and j < len(word2):
            ret.append(word1[i])
            ret.append(word2[j])
            i += 1
            j += 1
        
        if i < len(word1):
            ret.append(word1[i:])
        elif j < len(word2):
            ret.append(word2[j:])

        return "".join(ret)

class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        ret = 0
        idxs1 = [0] * 26

        for i in range(len(s)):
            idxs1[ord(s[i]) - 97] = i
        
        for i in range(len(t)):
            ret += abs(idxs1[ord(t[i]) - 97] - i)
        
        return ret
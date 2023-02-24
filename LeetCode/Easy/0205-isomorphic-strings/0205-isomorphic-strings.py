class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping_s = defaultdict(str)
        mapping_t = defaultdict(str)
        for i in range(len(s)):
            if s[i] not in mapping_s and t[i] not in mapping_t:
                mapping_s[s[i]] = t[i]
                mapping_t[t[i]] = s[i]
            elif mapping_s[s[i]] != t[i] or mapping_t[t[i]] != s[i]:
                return False
        return True
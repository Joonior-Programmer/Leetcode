class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(" ")
        if len(s) != len(pattern):
            return False
        used = set()
        ret = [""] * 26
        i = 0

        for v in pattern:
            if not ret[ord(v)-97] and s[i] not in used:
                ret[ord(v)-97] = s[i]
                used.add(s[i])
            elif ret[ord(v)-97] != s[i]:
                return False
            i += 1
        return True
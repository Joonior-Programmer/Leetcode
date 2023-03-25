class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        rn = Counter(ransomNote)
        mz = Counter(magazine)
        for k, v in rn.items():
            if k not in mz or mz[k] < v:
                return False
        return True
class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        counter = [0] * 26
        for v in s:
            counter[ord(v) - 97] += 1
        for v in t:
            counter[ord(v) - 97] -= 1
        for i in range(len(counter)):
            if counter[i] != 0:
                return chr(i + 97)
        
class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        ret = ""
        is_reverse = True
        for i in range(0, len(s), k):
            ret += s[i:i+k][::-1] if is_reverse else s[i:i+k]
            is_reverse = not is_reverse

        return ret
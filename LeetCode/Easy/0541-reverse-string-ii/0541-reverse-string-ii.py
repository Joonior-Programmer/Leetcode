class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        ret = ""
        is_reverse = True
        for i in range(k-1, len(s), k):
            if is_reverse:
                for j in range(i, i-k, -1):
                    ret += s[j]
            else:
                for j in range(i-k+1, i+1):
                    ret += s[j]
            is_reverse = not is_reverse

        if len(s) % k != 0:
            if is_reverse:
                ret += s[len(s) // k * k:][::-1]
            else:
                ret += s[len(s) // k * k:]
        return ret
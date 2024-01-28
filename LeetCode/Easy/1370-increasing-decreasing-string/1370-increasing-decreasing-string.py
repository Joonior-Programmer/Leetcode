class Solution:
    def sortString(self, s: str) -> str:
        count = [0] * 26
        ret = [""] * len(s)
        i = 0
        l, r = 0, 25

        for v in s:
            count[ord(v)-97] += 1

        while i < len(s):
            while l < r and not count[l]:
                l += 1
            
            ret[i] = chr(l+97)
            i += 1
            count[l] -= 1

            for j in range(l + 1, r + 1):
                if count[j]:
                    count[j] -= 1
                    ret[i] = chr(j+97)
                    i += 1
        
            if i == len(s):
                break

            while r > l and not count[r]:
                r -= 1

            ret[i] = chr(r+97)
            i += 1
            count[r] -= 1

            for j in range(r - 1, l - 1, -1):
                if count[j]:
                    count[j] -= 1
                    ret[i] = chr(j+97)
                    i += 1

        return "".join(ret)
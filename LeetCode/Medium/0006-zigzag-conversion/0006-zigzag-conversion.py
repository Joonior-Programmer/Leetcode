class Solution:
    def convert(self, s: str, numRows: int) -> str:
        ret = [[] for i in range(numRows)]
        i = 0
        n = len(s)

        while i < n:
            temp = 0
            while i < n and temp < numRows:
                ret[temp].append(s[i])
                temp += 1
                i += 1
            
            temp = numRows - 2
            while i < n and temp > 0:
                ret[temp].append(s[i])
                temp -= 1
                i += 1

        return "".join("".join(v) for v in ret)

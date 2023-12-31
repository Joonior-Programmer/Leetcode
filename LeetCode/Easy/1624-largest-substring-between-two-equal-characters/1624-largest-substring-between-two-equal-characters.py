class Solution:
    def maxLengthBetweenEqualCharacters(self, s: str) -> int:
        count = defaultdict(int)
        ret = -1
        
        for i in range(len(s)):
            temp = s[i]
            if temp in count:
                ret = max(ret, i-count[temp]-1)
            else:
                count[temp] = i

        return ret
class Solution:
    def maximumNumberOfStringPairs(self, words: List[str]) -> int:
        count = [[False] * 26 for i in range(26)]
        ret = 0

        for word in words:
            a = ord(word[0]) - 97
            b = ord(word[1]) - 97

            if count[a][b]:
                ret += 1
            else:
                count[a][b] = True
                count[b][a] = True

        return ret
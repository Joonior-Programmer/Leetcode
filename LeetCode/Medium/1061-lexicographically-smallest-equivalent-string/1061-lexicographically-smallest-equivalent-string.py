class Solution:
    def smallestEquivalentString(self, s1: str, s2: str, baseStr: str) -> str:
        # alpha = list(ascii_lowercase)
        # result = ""
        # for i in range(len(s1)):
        #     char1 = alpha[ord(s1[i]) - 97]
        #     char2 = alpha[ord(s2[i]) - 97]
        #     toChar = min(char1, char2)
        #     fromChar = max(char1, char2)
        #     for j in range(26):
        #         if alpha[j] == fromChar:
        #             alpha[j] = toChar
        
        # for v in baseStr:
        #     result += alpha[ord(v) - 97]
        
        # return result

        findRoot = {}
        result = ""
        def find(char):
            findRoot.setdefault(char, char)
            if char not in findRoot:
                return char
            if char != findRoot[char]:
                findRoot[char] = find(findRoot[char])
            return findRoot[char]

        def union(char1, char2):
            root_x = find(char1)
            root_y = find(char2)
            if root_x < root_y:
                findRoot[root_y] = root_x
            else:
                findRoot[root_x] = root_y

        for v, w in zip(s1, s2):
            union(v, w)

        for v in baseStr:
            result += find(v)
        return result
class Solution:
    def ladderLength(self, beginWord: str, endWord: str, wordList: List[str]) -> int:
        wordList = set(wordList)

        if endWord not in wordList:
            return 0

        length = len(beginWord)
        ret = 1
        stack = [beginWord]
        idx = 0

        while idx < len(stack):
            ret += 1
            end = len(stack)
            
            for i in range(idx, end):
                idx += 1
                temp = stack[i]

                for j in range(length):
                    for v in string.ascii_lowercase:
                        val = temp[:j] + v + temp[j+1:]
                        if val in wordList:
                            if val == endWord:
                                return ret
                            stack.append(val)
                            wordList.remove(val)

        return 0


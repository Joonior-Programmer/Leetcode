class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:
        order = {v : i for i, v in enumerate(order)}
        for i in range(len(words) - 1):
            next_len = len(words[i+1])
            for j in range(len(words[i])):
                if j > next_len-1:
                    return False
                elif order[words[i][j]] > order[words[i+1][j]]:
                    return False
                elif order[words[i][j]] < order[words[i+1][j]]:
                    break
        return True
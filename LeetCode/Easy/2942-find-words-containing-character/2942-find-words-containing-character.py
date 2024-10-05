class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        ret = []

        for i, word in enumerate(words):
            if x in word:
                ret.append(i)

        return ret

with open("user.out", "w") as f:
    inputs = map(loads, stdin)
    for nums in inputs:
        print(str(Solution().findWordsContaining(nums, next(inputs))).replace(" ", ""), file=f)
exit(0)
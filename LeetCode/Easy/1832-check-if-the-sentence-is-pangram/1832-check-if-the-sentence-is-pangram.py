class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        count = Counter(sentence)

        for v in "abcdefghijklmnopqrstuvwxyz":
            if v not in count:
                return False

        return True
        
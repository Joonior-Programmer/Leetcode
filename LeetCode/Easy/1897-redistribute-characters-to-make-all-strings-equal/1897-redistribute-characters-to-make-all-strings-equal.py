class Solution:
    def makeEqual(self, words: List[str]) -> bool:
        word = "".join(words)
        char = set(word)
        n = len(words)

        for v in char:
            if word.count(v) % n != 0:
                return False
        
        return True
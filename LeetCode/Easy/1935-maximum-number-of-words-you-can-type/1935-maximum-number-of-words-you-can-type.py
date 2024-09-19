class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        text = text.split()
        ret = len(text)
        broken = set([v for v in brokenLetters])

        for word in text:
            for v in word:
                if v in broken:
                    ret -= 1
                    break
        
        return ret
class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        l, r = 0, 0
        
        
        for v in word:
            if v == ch:
                break
            r += 1
        
        if r == len(word):
            return word
        
        word = list(word)
        
        while l < r:
            word[l], word[r] = word[r], word[l]
            l += 1
            r -= 1
        
        return "".join(word)
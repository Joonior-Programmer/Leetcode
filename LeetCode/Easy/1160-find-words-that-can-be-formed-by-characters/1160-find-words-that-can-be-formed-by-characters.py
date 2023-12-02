class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        ret = 0
        chars = Counter(chars)

        for word in words:
            chars_copy = chars.copy()
            condition = True
            for v in word:
                if chars_copy[v]:
                    chars_copy[v] -= 1
                else:
                    condition = False
                    break
            if condition:
                ret += len(word)
        
        return ret
class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        count = [101] * 26
        ret = []
        
        for word in words:
            temp = [0] * 26
            
            for v in word:
                temp[ord(v) - 97] += 1
            
            for i in range(26):
                count[i] = min(count[i], temp[i])
        
        for i in range(26):
            for j in range(count[i]):
                ret.append(chr(i+97))
        
        return ret
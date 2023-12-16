class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        mos = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
        
        ret = set()
        
        for word in words:
            temp = ""
            for v in word:
                temp += mos[ord(v) - 97]
            ret.add(temp)
        
        return len(ret)
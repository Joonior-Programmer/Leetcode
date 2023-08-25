class Solution:
    def findSubstring(self, s: str, words: List[str]) -> List[int]:
        n = len(s)
        length = len(words[0])
        l = 0
        r = length * len(words)
        ret = []
        temp = Counter(words)

        while r < n+1:
            temp_count = temp.copy()
            condition = True
 
            for i in range(l, r, length):
                if s[i:i+length] not in temp_count:
                    condition = False
                    break
                temp_count[s[i:i+length]] -= 1
            
            if condition:
                for v in temp_count.values():
                    if v != 0:
                        condition = False
                        break
                
                if condition:
                    ret.append(l)

            l += 1
            r += 1

        return ret
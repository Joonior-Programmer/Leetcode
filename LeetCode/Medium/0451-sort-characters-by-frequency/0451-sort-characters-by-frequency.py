class Solution:
    def frequencySort(self, s: str) -> str:
        count = [0] * 128
        freq = [0] * (len(s) + 1)
        ret = [""] * len(s)
        
        for v in s:
            temp = ord(v)
            count[temp] += 1
        
        for v in count:
            freq[v] += 1
        
        i = len(freq) - 1
        idx = 0
        
        while i > 0:
            while freq[i]:
                for j in range(128):
                    if count[j] == i:
                        char = chr(j)
                        for _ in range(i):
                            ret[idx] = char
                            idx += 1
                        
                        freq[i] -= 1
            i -= 1
            
        return "".join(ret)
                
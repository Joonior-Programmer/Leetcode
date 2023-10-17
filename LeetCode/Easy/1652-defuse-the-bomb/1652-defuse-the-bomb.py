class Solution:
    def decrypt(self, code: List[int], k: int) -> List[int]:
        if k == 0:
            return [0] * len(code)
        
        ret = [0] * len(code)
        n = len(code)

        if k > 0:
            last = 1
            temp = 0
            i = 1
            
            while last <= k:
                temp += code[last]
                last += 1
            
            ret[0] = temp

            while i < n:
                if last == n:
                    last = 0
                temp -= code[i]
                temp += code[last]
                ret[i] = temp
                last += 1
                i += 1
        else:
            last = k
            temp = 0
            i = 1
            
            while last < 0:
                temp += code[last]
                last += 1
            
            ret[0] = temp

            while i < n:
                temp -= code[k]
                temp += code[i-1]
                ret[i] = temp
                k += 1
                i += 1
        
        return ret
        
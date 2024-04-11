class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        n = len(num)
        ret = [num[0]]
        i = 1
        
        while i < n:
            while k and ret:
                if ret[-1] > num[i]:
                    ret.pop()
                    k -= 1
                else:
                    break
                    
            if ret or num[i] != "0":
                ret.append(num[i])
            
            i += 1

        if k:
            ret = ret[:len(ret)-k]

        if not ret:
            return "0"

        return "".join(ret)
        
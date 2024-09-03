class Solution:
    def getLucky(self, s: str, k: int) -> int:
        ret = "".join(str(ord(v) - 96) for v in s)
            
        ret = int(ret)
        
        while k:
            temp = 0
            
            while ret:
                temp += ret % 10
                ret //= 10
            
            ret = temp
            k -= 1
        
        return ret
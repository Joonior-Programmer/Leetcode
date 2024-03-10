class Solution:
    def maximum69Number (self, num: int) -> int:
        ret = num
        curr = 0
        digit = -1

        while (num > 0):
            if num % 10 == 6:
                digit = curr
            
            num //= 10
            curr += 1
        

        if digit > -1:
            ret += 3 * 10 ** digit

        return ret
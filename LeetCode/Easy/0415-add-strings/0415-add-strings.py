class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        ret = []
        carry = 0
        i = len(num1) - 1
        j = len(num2) - 1
        while i > -1 or j > -1 or carry:
            if i > -1:
                carry += int(num1[i])
            if j > -1:
                carry += int(num2[j])
            ret.append(str(carry % 10))
            carry //= 10
            i -= 1
            j -= 1


        return "".join(ret[::-1])
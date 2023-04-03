class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        is_one_plus = False
        ret = ""
        i = len(num1) - 1
        j = len(num2) - 1
        while i > -1 and j > -1:
            added = int(num1[i]) + int(num2[j]) + is_one_plus
            is_one_plus = False
            if added > 9:
                is_one_plus = True
                added %= 10
            ret = str(added) + ret
            i -= 1
            j -= 1

        if i > -1:
            ret = str(int(num1[:i+1]) + is_one_plus) + ret
            is_one_plus = False
        elif j > -1:
            ret = str(int(num2[:j+1]) + is_one_plus) + ret
            is_one_plus = False
        elif is_one_plus:
            ret = "1" + ret

        return ret
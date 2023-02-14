class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        def checkLength():
            for i in range(6, -1, -1):
                temp = 0
                for j in range(i, -1, -1):
                    temp += 26 ** j
                if temp <= columnNumber:
                    return i
        
        remained = checkLength()

        ret = ""
        for i in range(checkLength(), -1, -1):
            deduct = 26 ** i
            divided = columnNumber // deduct
            columnNumber -= int(divided * deduct)
            if columnNumber == 0:
                divided -= 1
                columnNumber += deduct

            if i == 0:
                ret += chr(65 + divided)
            else:
                ret += chr(64 + divided)

        return ret
            
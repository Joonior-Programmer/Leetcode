class Solution:
    def isValid(self, s: str) -> bool:
        temp = []
        for v in s:
            if temp and (temp[-1] + v == "[]" or temp[-1] + v == "{}" or temp[-1] + v == "()"):
                temp.pop()
            else:
                temp.append(v)

        return not temp

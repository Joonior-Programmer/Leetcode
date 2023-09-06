class Solution:
    def calculate(self, s: str) -> int:
        ret = 0
        pre_op = "+"
        s += "+"
        temp = 0
        stack = []

        for v in s:
            if v.isdigit():
                temp = temp*10 + int(v)
            elif v in ["+", "-"]:
                if pre_op == "+":
                    ret += temp
                else:
                    ret -= temp
                pre_op = v
                temp = 0
            elif v == "(":
                stack.append(ret)
                stack.append(pre_op)
                ret = 0
                temp = 0
                pre_op = "+"
            elif v == ")":
                if pre_op == "+":
                    ret += temp
                else:
                    ret -= temp
                if stack.pop() == "+":
                    ret += stack.pop()
                else:
                    ret = stack.pop() - ret
                temp = 0
                pre_op = "+"
        return ret
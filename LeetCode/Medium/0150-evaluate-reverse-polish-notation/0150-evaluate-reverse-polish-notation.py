class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        operators = set(["*", "/", "+", "-"])
        stack = []

        for v in tokens:
            if v in operators:
                back = stack.pop()
                front = stack.pop()
                if v == "*":
                    stack.append(front * back)
                elif v == "/":
                    stack.append(int(front / back))
                elif v == "+":
                    stack.append(front + back)
                else:
                    stack.append(front - back)
            else:
                stack.append(int(v))

        return stack[0]
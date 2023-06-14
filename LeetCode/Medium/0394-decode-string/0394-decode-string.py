class Solution:
    def decodeString(self, s: str) -> str:
        stack = []

        for v in s:
            if v != "]":
                stack.append(v)
            else:
                temp = ""
                repeat = ""
                while stack[-1] != "[":
                    temp += stack.pop()
                
                stack.pop()

                while stack and stack[-1].isdigit():
                    repeat += stack.pop()
                stack.append(int(repeat[::-1]) * temp)

        return "".join([v[::-1] for v in stack])
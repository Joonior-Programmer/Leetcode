class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        stack = []
        
        for v in s:
            if stack and stack[-1] == "(" and v == ")":
                stack.pop()
            else:
                stack.append(v)
        
        return len(stack)
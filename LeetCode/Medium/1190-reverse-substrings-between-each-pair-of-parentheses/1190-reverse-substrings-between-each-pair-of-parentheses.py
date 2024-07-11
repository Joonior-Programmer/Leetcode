class Solution:
    def reverseParentheses(self, s: str) -> str:
        ret = []
        stack = []
        idx = 0
        
        def rev(l, r):
            print(l, r)
            while l < r:
                ret[l], ret[r] = ret[r], ret[l]
                l += 1
                r -= 1
        
        for i in range(len(s)):
            if s[i] == "(":
                stack.append(idx)
            elif s[i] == ")":
                rev(stack.pop(), len(ret) - 1)
            else:
                ret.append(s[i])
                idx += 1
        
        return "".join(ret)
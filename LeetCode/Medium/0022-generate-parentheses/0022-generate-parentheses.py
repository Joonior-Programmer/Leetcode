class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        ret = []
        curr = []
        def dfs(l, r):
            if l + r == n * 2:
                ret.append("".join(curr))
                return
            
            if l < n:
                curr.append("(")
                dfs(l + 1, r)
                curr.pop()
            if r < l:
                curr.append(")")
                dfs(l, r + 1)
                curr.pop()
        
        dfs(0, 0)
        
        return ret
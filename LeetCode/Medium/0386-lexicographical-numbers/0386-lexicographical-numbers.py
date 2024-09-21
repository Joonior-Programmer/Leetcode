class Solution:
    def lexicalOrder(self, n: int) -> List[int]:
        ret = []
        
        def dfs(curr):
            if curr > n:
                return
            
            ret.append(curr)
            
            dfs(curr * 10)
            
            if curr % 10 != 9:
                dfs(curr + 1)
        
        dfs(1)

        return ret
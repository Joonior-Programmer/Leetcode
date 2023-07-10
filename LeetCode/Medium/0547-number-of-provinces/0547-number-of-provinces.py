class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        n = len(isConnected)
        visited = [False] * n
        ret = 0
        
        def DFS(curr):
            visited[curr] = True
            
            for i in range(len(isConnected)):
                if isConnected[curr][i] and not visited[i]:
                    DFS(i)
        
        for i in range(n):
            if not visited[i]:
                ret += 1
                DFS(i)
        
        return ret
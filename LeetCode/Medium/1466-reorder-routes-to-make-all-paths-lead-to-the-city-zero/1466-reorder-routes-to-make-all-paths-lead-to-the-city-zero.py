class Solution:

    def minReorder(self, n: int, connections: List[List[int]]) -> int:
        graph = [[] for i in range(n)]
        visited = [False] * n

        for connection in connections:
            graph[connection[0]].append(connection[1])
            graph[connection[1]].append(-connection[0])

        def DFS(curr):
            visited[curr] = True

            ret = 0

            for destination in graph[curr]:
                if not visited[abs(destination)]:
                    if destination >= 0:
                        ret += 1
                    ret += DFS(abs(destination))

            return ret

        return DFS(0)
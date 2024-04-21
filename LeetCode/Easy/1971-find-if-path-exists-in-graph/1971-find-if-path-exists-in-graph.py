class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        if source == destination:
            return True

        graph = defaultdict(set)
        visited = set([source])
        stack = [source]
        ret = False
        
        for v0, v1 in edges:
            graph[v0].add(v1)
            graph[v1].add(v0)

        while stack:
            temp = []
            
            while stack:
                now = stack.pop()
                for v in graph[now]:
                    if v not in visited and now in graph[v]:
                        if v == destination:
                            return True
                        visited.add(v)
                        temp.append(v)
            
            stack = temp
        
        return False
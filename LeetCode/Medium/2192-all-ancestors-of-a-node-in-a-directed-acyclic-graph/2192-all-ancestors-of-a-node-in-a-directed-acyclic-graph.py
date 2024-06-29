class Solution:
    def getAncestors(self, n: int, edges: List[List[int]]) -> List[List[int]]:
        graph = [set() for i in range(n)]
        ret = [set() for i in range(n)]
        lev = [0] * n
        q = deque()

        for v0, v1 in edges:
            graph[v0].add(v1)
            lev[v1] += 1
        
        for i in range(n):
            if not lev[i]:
                q.append(i)

        while q:
            curr = q.popleft()

            for v in graph[curr]:
                ret[v].add(curr)
                ret[v].update(ret[curr])
                lev[v] -= 1

                if not lev[v]:
                    q.append(v)

        return [sorted(list(v)) for v in ret]
        

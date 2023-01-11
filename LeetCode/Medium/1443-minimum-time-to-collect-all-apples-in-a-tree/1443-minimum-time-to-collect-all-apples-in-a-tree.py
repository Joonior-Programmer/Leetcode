class Solution:
    def minTime(self, n: int, edges: List[List[int]], hasApple: List[bool]) -> int:
        # tree = {}
        # for v in edges:
        #     if v[0] in tree:
        #         tree[v[0]].append(v[1])
        #     else:
        #         tree[v[0]] = [v[1]]
        #     if v[1] in tree:
        #         tree[v[1]].append(v[0])
        #     else:
        #         tree[v[1]] = [v[0]]


        # def DFS(tree, hasApple, current, count, visited):
        #     visited.add(current)
        #     if current not in tree and hasApple[current]:
        #         return 2
        #     elif current not in tree and not hasApple[current]:
        #         return 0
            
        #     temp = 0
        #     for v in tree[current]:
        #         if v not in visited:
        #             temp += DFS(tree, hasApple, v, count, visited)

        #     if temp > 0 and current != 0:
        #         return temp + 2
        #     elif temp > 0 and current == 0:
        #         return temp
        #     if temp == 0 and hasApple[current] and current != 0:
        #         return 2
        #     else:
        #         return 0
        # return DFS(tree, hasApple, 0, 0, set())
        
        tree = defaultdict(list)
        for v, value in edges:
            tree[v].append(value)
            tree[value].append(v)
        
        def DFS(parent, current):
            steps = 0
            for v in tree[current]:
                if v != parent:
                    steps += DFS(current, v)
            if (steps > 0 or hasApple[current]) and current != 0:
                return steps + 2
            return steps
        return DFS(-1, 0)
    

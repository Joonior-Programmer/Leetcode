class Solution:
    def calcEquation(self, equations: List[List[str]], values: List[float], queries: List[List[str]]) -> List[float]:
        map = defaultdict(lambda : defaultdict(float))
        ret = []

        for i in range(len(equations)):
            v0, v1 = equations[i][0], equations[i][1]
            map[v0][v1] = values[i]
            map[v1][v0] = 1 / values[i]
        
        def DFS(node, target, visited):
            route = map[node]

            if target in route:
                return route[target]

            visited.add(node)

            result = -1

            for k, v in route.items():
                if k not in visited:
                    
                    result = DFS(k, target, visited)

                    if result != -1:
                        result *= v 
                        route[target] = result
                        map[target][node] = 1 / result
                        break

            return result

        for x, y in queries:
            if x not in map or y not in map:
                ret.append(-1)
            elif x == y:
                ret.append(1)
            else:
                temp = DFS(x, y, set())

                if temp == -1:
                    ret.append(-1)
                else:
                    ret.append(temp)
                    map[x][y] = temp
                    map[y][x] = 1 / temp

        return ret
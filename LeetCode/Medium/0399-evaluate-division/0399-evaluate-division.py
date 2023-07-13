class Solution:
    def calcEquation(self, equations: List[List[str]], values: List[float], queries: List[List[str]]) -> List[float]:
        map = defaultdict(lambda : defaultdict(float))
        ret = []

        for i in range(len(equations)):
            v0, v1 = equations[i][0], equations[i][1]
            map[v0][v1] = values[i]
            map[v1][v0] = 1 / values[i]
            map[v0][v0] = 1
            map[v1][v1] = 1

            for k0, value0 in map[v0].items():
                if v0 != k0:
                    map[k0][v1] = (1 / value0) * values[i]
                    map[v1][k0] = 1 / ((1 / value0) * values[i])
            
            for k0, value0 in map[v1].items():
                if v1 != k0:
                    map[k0][v0] = (1 / value0) / values[i]
                    map[v0][k0] = value0 * values[i]

        temp = defaultdict(lambda: defaultdict(float))        

        for k0, v0 in map.items():
            for k1, v1 in v0.items():
                if k0 != k1:                    
                    for k2, v2 in map[k1].items():
                        if k2 in map[k1] and k2 not in map[k0]:
                            temp[k0][k2] = v1 * v2
                            temp[k2][k0] = 1 / (v1 * v2)

        for k0, v0 in temp.items():
            for k1, v1 in v0.items():
                map[k0][k1] = v1

        for v in queries:
            if v[1] in map[v[0]]:
                ret.append(map[v[0]][v[1]])
            else:
                ret.append(-1)    

        return ret
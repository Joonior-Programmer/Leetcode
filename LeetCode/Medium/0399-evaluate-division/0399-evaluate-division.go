func calcEquation(equations [][]string, values []float64, queries [][]string) []float64 {
    route := createMap(equations, values)
    ret := make([]float64, len(queries))
    
    for i := 0; i < len(queries); i++ {
        x := queries[i][0]
        y := queries[i][1]

        if _, ok := route[x]; !ok  {
            ret[i] = -1
        } else if _, ok := route[y]; !ok {
            ret[i] = -1
        } else if x == y {
            ret[i] = 1
        } else {
            temp := dfs(x, y, hashset.New(), route)

            if temp != -1 {
                route[x][y] = temp
                route[y][x] = 1 / temp
            }

            ret[i] = temp
        }
    }

    return ret
}

func createMap(equations [][]string, values []float64) map[string]map[string]float64 {
    route := make(map[string]map[string]float64)
    
    for i := 0; i < len(equations); i++ {
        x := equations[i][0]
        y := equations[i][1]
        
        if v, ok := route[x]; ok {
            v[y] = values[i]
        } else {
            temp := make(map[string]float64)
            temp[y] = values[i]
            route[x] = temp
        }
        
        if v, ok := route[y]; ok {
            v[x] = 1 / values[i]
        } else {
            temp := make(map[string]float64)
            temp[x] = 1 / values[i]
            route[y] = temp
        }
    }
    
    return route
}

func dfs(node string, target string, visited *hashset.Set, route map[string]map[string]float64) float64 {
    if _, ok := route[node]; ok {
        if v, ok := route[node][target]; ok {
            return v
        }
    }

    visited.Add(node)

    var ret float64= -1

    for k, _ := range route[node] {
        if !visited.Contains(k) {
            ret = dfs(k, target, visited, route)
            if ret != -1 {
                ret *= route[node][k]
                route[node][target] = ret
                route[target][node] = 1 / ret
                break
            }
        }
    }

    return ret
}
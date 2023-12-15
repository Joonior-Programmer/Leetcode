func destCity(paths [][]string) string {
    s := make(map[string]string)
    
    for _, v := range paths {
        s[v[0]] = v[1]
    }
    
    for _, v := range paths {
        if _, ok := s[v[1]]; !ok {
            return v[1]
        }
    }
    
    return paths[0][1]
}
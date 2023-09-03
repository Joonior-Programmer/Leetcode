func simplifyPath(path string) string {
    ret := make([]string, 0)
    
    for _, dir := range strings.Split(path, "/") {
        if dir != ".." && dir != "." && dir != "" {
            ret = append(ret, dir)
        } else if dir == ".." && len(ret) > 0 {
            ret = ret[:len(ret)-1]
        }
    }
    
    if len(ret) == 0 { return "/" }


    return "/" + strings.Join(ret, "/")
}
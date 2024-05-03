func compareVersion(version1 string, version2 string) int {
    i := 0
    j := 0

    n := len(version1)
    m := len(version2)

    for i < n || j < m{
        v1 := 0
        v2 := 0

        for i < n && version1[i] != '.' {
            v1 = v1 * 10 + int(version1[i] - '0');
            i++
        }

        for j < m && version2[j] != '.' {
            v2 = v2 * 10 + int(version2[j] - '0')
            j++
        }

        if v1 > v2 {
            return 1
        } else if v2 > v1 { return -1 }

        i++
        j++
    }

    return 0
}
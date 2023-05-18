func gcdOfStrings(str1 string, str2 string) string {
    a := len(str1)
    b := len(str2)
    maxLen := 0
    if a < b {
        maxLen = a
    } else {
        maxLen = b
    }
    
    for i := maxLen; i > 0; i-- {
        if a % i == 0 && b % i == 0 { 
            maxLen = i
            break
        }
    }
    
    if str1 + str2 == str2 + str1 { return str1[:maxLen] }
    return ""
}
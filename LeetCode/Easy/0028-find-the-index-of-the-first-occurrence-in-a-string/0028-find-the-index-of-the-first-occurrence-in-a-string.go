func strStr(haystack string, needle string) int {
    i := 0;
    for i < len(haystack){
        if haystack[i] == needle[0] {
            if i + len(needle) > len(haystack) {
                return -1
            }
            isEqual := true
            isChanged := false
            temp := i;
            for j := 1; j < len(needle); j++ {
                if !isChanged && haystack[i+j] == needle[0] {
                    temp = i + j - 1;
                    isChanged = true;
                }
                if haystack[i+j] != needle[j] {
                    if !isChanged {temp = i + j;}
                    isEqual = false;
                    break;
                }
            }
            if isEqual {return i;}
            i = temp;
        }
        i++;
    }
    return -1;
}
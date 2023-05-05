func maxVowels(s string, k int) int {
    ret := 0
    prev := 0
    temp := 0


    for i := 0; i < k; i++ {
        if (s[i] == 'a' || s[i] == 'e' ||
            s[i] == 'o' || s[i] == 'i' || s[i] == 'u') {temp++}
    }

    ret = temp
    
    if (s[prev] == 'a' || s[prev] == 'e' ||
        s[prev] == 'o' || s[prev] == 'i' || s[prev] == 'u') {temp--}
    prev++

    for i := k; i < len(s); i++ {
        if (s[i] == 'a' || s[i] == 'e' ||
            s[i] == 'o' || s[i] == 'i' || s[i] == 'u') {temp++}

        if ret < temp {ret = temp}

        if (s[prev] == 'a' || s[prev] == 'e' ||
            s[prev] == 'o' || s[prev] == 'i' || s[prev] == 'u') {temp--;}
        prev++
    }

    return ret;
}
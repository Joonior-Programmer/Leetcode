func mostWordsFound(sentences []string) int {
    ret := 0
        
    for _, v := range sentences {
        temp := 0
        for _, c := range v {
            if c == ' ' { temp++ }
        }
        if ret < temp { ret = temp }
    }

    return ret + 1
}
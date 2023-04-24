func detectCapitalUse(word string) bool {
    isLower := false;
    isUpper := true;

    if word[0] > 95 && word[0] < 123{
        isLower = true;
        isUpper = false;
    }
    if isLower {
        for i := 1; i < len(word); i++ {
            if !(word[i] > 95 && word[i] < 123) {return false;}
        }
    } else {
        for i := 1; i < len(word); i++ {
            if (i > 1 && !isLower && word[i] > 95 && word[i] < 123) {
                return false
            } else if (isLower && isUpper && !(word[i] > 95 && word[i] < 123)) {
                return false
            } else if (word[i] > 95 && word[i] < 123) {isLower = true;}
        }
    }
    return true;
}
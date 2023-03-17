func countBits(n int) []int {
    ret := make([]int, n + 1);
    if n == 0 {return ret;}
    ret[1]++;
    if n == 1 {return ret;}
    i := 2;
    n++;
    for (n > i){
        if n >= i * 2 {
            for j := 0; j < i; j++ {ret[i+j] = ret[j] + 1;}
            i *= 2;
        } else {
            for j := 0; j < n - i; j++ {ret[i+j] = ret[j] + 1;}
            i *= 2;
        }
    }
    return ret;
}
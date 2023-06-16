class Solution {
    public int minFlips(int a, int b, int c) {
        int ret = 0;
        while (a > 0 || b > 0 || c > 0){
            if ((c & 1) == 0) 
            ret += (a & 1) + (b & 1);
            else if (((a & 1) | (b & 1)) != 1) ++ret;
            a>>=1;
            b>>=1;
            c>>=1;
        }

        return ret;
    }
}
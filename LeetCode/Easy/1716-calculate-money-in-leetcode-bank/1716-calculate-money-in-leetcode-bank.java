class Solution {
    public int totalMoney(int n) {
        int ret = 0;
        int weeks = n / 7;
        n %= 7;
        
        while (n > 0){
            ret += n + weeks;
            n--;
        }
        
        weeks--;
        
        while (weeks > -1){
            ret += 28 + (weeks * 7);
            weeks--;
        }
        
        return ret;
    }
}
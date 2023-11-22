class Solution {
    public int reverse(int x) {
        if (x == 0) return 0;
        
        boolean minus = x < 0;
        long ret = 0;
        
        if (minus) x *= -1;
        
        while (x % 10 == 0) x /= 10;
        
        while (x > 0){
            ret = ret * 10 + x % 10;
            x /= 10;
        }
        
        if (minus) ret *= -1;
        
        if (ret < Math.pow(-2, 31) || ret > Math.pow(2, 31) - 1) return 0;
        
        return (int) ret;
    }
}
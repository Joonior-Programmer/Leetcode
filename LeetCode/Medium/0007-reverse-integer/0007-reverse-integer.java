class Solution {
    public int reverse(int x) {
        long ret = 0;

        while (x != 0){
            ret = ret * 10 + x % 10;
            x /= 10;
            
        }
        
        if (ret < Math.pow(-2, 31) || ret > Math.pow(2, 31) - 1) return 0;
    
        return (int) ret;
    }
}
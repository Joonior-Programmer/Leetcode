class Solution {
public:
    int reverse(int x) {
        if (x == 0) return 0;
        
        bool minus = x < 0;
        long ret = 0;
        long newX = x;
        
        if (minus) newX *= -1;
        
        while (newX % 10 == 0) newX /= 10;
        
        while (newX > 0){
            ret = ret * 10 + newX % 10;
            newX /= 10;
        }
        
        if (minus) ret *= -1;
        
        if (ret < pow(-2, 31) || ret > pow(2, 31) - 1) return 0;
        
        return (int) ret;
    }
};
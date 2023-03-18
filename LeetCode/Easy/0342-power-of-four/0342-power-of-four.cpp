class Solution {
public:
    bool isPowerOfFour(int n) {
        if (n < 1 || n % 4 != 0) return n == 1;
        while (n > 3) {
            if (n % 4 != 0) return false;
            n /= 4; 
        }
        return n==1;
    }
};
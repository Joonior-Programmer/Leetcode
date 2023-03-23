class Solution {
public:
    bool isPerfectSquare(int num) {
        long l = 1;
        long r = num;
        long mid;
        while(l < r){
            mid = (l + r) / 2;
            if (mid * mid == num) return true;
            else if (mid * mid < num) l = mid + 1;
            else r = mid;
        }
        if (num == 1) return true;
        return false;
    }
};
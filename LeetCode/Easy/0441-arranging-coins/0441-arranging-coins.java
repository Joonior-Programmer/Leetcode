class Solution {
    public int arrangeCoins(int n) {
        long l = 1;
        long r = n;
        long mid;
        long temp;
        while (l <= r){
            mid = (l + r) / 2;
            temp = mid * (mid + 1) / 2;
            if (n >= temp) l = mid + 1;
            else r = mid - 1;
        }
        return (int)r;
    }
}
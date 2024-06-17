class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0;
        long r = (long) Math.ceil(Math.sqrt(c));

        while (l <= r){
            long temp = l * l + r * r;

            if (temp == c) return true;
            else if (temp < c) ++l;
            else r--;
        }

        return false;
    }
}
class Solution {
    public double myPow(double x, int n) {
        long tempN = n;

        if (tempN < 0){
            x = 1 / x;
            tempN *= -1;
        }

        return helper(x, tempN);
    }

    private double helper(double x, long n){
        if (n == 0) return 1;

        double half = helper(x, n / 2);

        if ((n & 1) == 1) return x * half * half;
        return half * half;
    }
}
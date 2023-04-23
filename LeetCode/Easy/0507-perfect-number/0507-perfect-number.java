class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num % 2 != 0 || num < 3) return false;
        int ret = 1;
        for (int i = 2; i < (int) Math.sqrt(num) + 1; ++i){
            if(num % i == 0) ret += i + (num / i);
        }
        return ret == num;
    }
}
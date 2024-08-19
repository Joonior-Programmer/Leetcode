class Solution {
    public int minSteps(int n) {
        int ret = 0;
        
        while (n % 2 == 0) {
            ret += 2;
            n /= 2;
        }
        
        for (int i = 3; i < Math.sqrt(n) + 1; ++i){
            while (n % i == 0){
                ret += i;
                n /= i;
            }
        }
        
        if (n > 1) ret += n;
        
        return ret;
    }
}
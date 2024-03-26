class Solution {
    public int countDigits(int num) {
        int original = num;
        int ret = 0;
        
        while (num > 0){
            if (original % (num % 10) == 0) ++ret;
            num /= 10;
        }
        
        return ret;
    }
}
class Solution {
    public int sumBase(int n, int k) {
        int ret = 0;
        int i = 7;
        
        while (n < Math.pow(k, i))
            i--;

        while (i > 0){
            int temp = (int) Math.pow(k, i);
            ret += n / temp;
            n -= n / temp * temp;
            i--;
        }
        
        return ret + n;
    }
}
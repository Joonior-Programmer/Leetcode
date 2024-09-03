class Solution {
    public int getLucky(String s, int k) {
        int ret = 0;
        
        for (int i = 0; i < s.length(); ++i) {
            int temp = s.charAt(i) - 96;

            while (temp > 0) {
                ret += temp % 10;
                temp /= 10;
            }
        }

        k--;

        while (k > 0){
            int temp = 0;
            
            while (ret > 0) {
                temp += ret % 10;
                ret /= 10;
            }

            ret = temp;
            k--;
        }
        
        return ret;
    }
}
class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        char[] ret = new char[n + m];

        for (int i = 0; i < n; ++i){
            int v0 = num1.charAt(i) - 48;
            for (int j = 0; j < m; ++j){
                int temp = v0 * (num2.charAt(j) - 48);
                ret[i+j+1] += temp;
            }
        }

        int i = ret.length - 1;

        while(i > 0){
            ret[i-1] += ret[i] / 10;
            ret[i] %= 10;
            ret[i--] += '0';
        }

        ret[0] += '0';

        
        int idx = 0;
        while (idx < ret.length && ret[idx] == '0') ++idx;
        
        if (ret.length == idx) return "0";

        return new String(ret).substring(idx, ret.length);
    }
}
class Solution {
    public String largestGoodInteger(String num) {
        String ret = "";
        int i = 0;
        char[] numCharArray = num.toCharArray();
        while (i < num.length() - 2){
            if (numCharArray[i] != numCharArray[i+1]) {
                ++i;
                continue;
            }
            if (numCharArray[i] != numCharArray[i+2]){
                i += 2;
                continue;
            }

            if (ret.length() == 0 || Integer.valueOf(ret) < (int) (numCharArray[i]-'0') * 111) ret = num.substring(i, i+3);
            i += 3;
        }
        
        return ret;
    }
}
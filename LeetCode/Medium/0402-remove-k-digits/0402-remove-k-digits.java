class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        char[] numCharArray = num.toCharArray();
        StringBuilder ret = new StringBuilder();
        ret.append(numCharArray[0]);
        
        for (int i = 1; i < n; ++i){
            char temp = numCharArray[i];
            while (k > 0 && ret.length() > 0){
                if (ret.charAt(ret.length()-1) > temp){
                    ret.deleteCharAt(ret.length()-1);
                    k--;
                } else break;
            }
            
            if (ret.length() > 0 || temp != '0') ret.append(temp);
        }
        
        while (k > 0 && ret.length() > 0) {
            ret.deleteCharAt(ret.length()-1);
            k--;
        }
        
        if (ret.length() == 0) return "0";
        
        return ret.toString();
    }
}
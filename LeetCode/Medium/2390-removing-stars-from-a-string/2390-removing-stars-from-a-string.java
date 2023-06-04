class Solution {
    public String removeStars(String s) {
        int i = s.indexOf("*");
        if (i < 0) return s;
        char[] ret = s.toCharArray();
        
        for (int j = i; j < ret.length; ++j){
            if (ret[j] != '*') ret[i++] = ret[j];
            else if (i > 0) i--;
        }
        return new String(ret,0 , i);
    }
}
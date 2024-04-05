class Solution {
    public String makeGood(String s) {
        StringBuilder ret = new StringBuilder();
        
        for (char v : s.toCharArray()){
            int len = ret.length();
            if (len > 0 && Math.abs(ret.charAt(len-1) - v) == 32) ret.deleteCharAt(len-1);
            else ret.append(v);
        }
        
        return ret.toString();
    }
}
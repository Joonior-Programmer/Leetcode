class Solution {
    public int countSeniors(String[] details) {
        int ret = 0;
        
        for (String v : details)
            if (60 < (v.charAt(11) - 48) * 10 + v.charAt(12) - 48) ++ret;
        
        return ret;
    }
}
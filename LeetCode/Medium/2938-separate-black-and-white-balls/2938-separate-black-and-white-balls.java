class Solution {
    public long minimumSteps(String s) {
        int curr = 0;
        long ret = 0;
        
        for (char v : s.toCharArray())
            if (v == '1') ++curr;
            else ret += curr;
        
        return ret;
    }
}
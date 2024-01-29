class Solution {
    public int countKeyChanges(String s) {
        int ret = 0;
        char prev = s.charAt(0);
        
        for (int i = 1; i < s.length(); ++i){
            char temp = s.charAt(i);
            if (temp - 32 != prev && temp + 32 != prev && temp != prev) ++ret;
            prev = temp;
        }
        
        return ret;
    }
}
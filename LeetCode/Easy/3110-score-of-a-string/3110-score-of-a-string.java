class Solution {
    public int scoreOfString(String s) {
        int ret = 0;
        char prev = s.charAt(0);
    
        for (int i = 1; i < s.length(); ++i){
            char temp = s.charAt(i);
            ret += Math.abs(prev - temp);
            prev = temp;
        }
        

        return ret;
    }
}
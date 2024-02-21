class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ret = 0;
        
        for (String v : operations){
            if (v.charAt(0) == '+' || v.charAt(2) == '+') ++ret;
            else ret--;
        }
        
        return ret;
    }
}
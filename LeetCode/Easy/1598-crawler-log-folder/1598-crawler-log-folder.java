class Solution {
    public int minOperations(String[] logs) {
        int ret = 0;
        
        for (String log : logs){
            if (log.charAt(0) == '.') {
                if (log.charAt(1) == '.')
                    ret = Math.max(0, ret - 1);
            }
            else ++ret;
        }
        
        return ret;
    }
}
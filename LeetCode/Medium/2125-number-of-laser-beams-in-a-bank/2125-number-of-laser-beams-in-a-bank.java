class Solution {
    public int numberOfBeams(String[] bank) {
        int ret = 0;
        int prev = 0;
        
        for (String row : bank){
            int temp = 0;
            for (int i = 0; i < row.length(); ++i) temp += row.charAt(i) - '0';
            
            if (temp > 0){
                ret += prev * temp;
                prev = temp;
            }
        }
        
        return ret;
    }
}
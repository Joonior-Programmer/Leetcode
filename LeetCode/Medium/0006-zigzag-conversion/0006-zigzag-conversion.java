class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        
        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycle = 2 * numRows - 2;
        char[] sCharArray = s.toCharArray();
        
        for (int i = 0; i < numRows; ++i){
            for (int j = 0; j + i < n; j += cycle){
                ret.append(sCharArray[i+j]);
                
                if (i != 0 && i != numRows - 1 && j + cycle - i < n) ret.append(sCharArray[j+cycle-i]);
            }
        }
            
        return ret.toString();
    }
}
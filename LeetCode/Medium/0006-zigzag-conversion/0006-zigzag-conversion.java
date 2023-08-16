class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        
        StringBuilder ret[] = new StringBuilder[numRows];
        int i = 0;
        int n = s.length();
        char[] sCharArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (int j = 0; j < numRows; ++j) ret[j] = new StringBuilder();

        while (i < n){
            for (int idx = 0; idx < numRows && i < n; ++idx) ret[idx].append(sCharArray[i++]);     
            for (int idx = numRows-2; idx > 0 && i < n; idx--) ret[idx].append(sCharArray[i++]);
        }
        
        for (StringBuilder v : ret){
            sb.append(v.toString());
        }
            
        return sb.toString();
    }
}
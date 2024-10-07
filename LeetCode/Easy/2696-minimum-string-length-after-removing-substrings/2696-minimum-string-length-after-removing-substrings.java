class Solution {
    public int minLength(String s) {
        int n = s.length();
        char[] stack = new char[n];
        
        int j = 0;
        
        for (int i = 0; i < n; ++i){
            char v = s.charAt(i);
            
            if (j > 0 && ((stack[j-1] == 'A' && v == 'B') || (stack[j-1] == 'C' && v == 'D'))) j--;
            else stack[j++] = v;
        }
        
        return j;            
    }
}
class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        char[] stack = new char[n];
        int j = 0;
        
        for (char v : s.toCharArray())
            if (j > 0 && stack[j-1] == '(' && v == ')') j--;
            else stack[j++] = v;
        
        return j;
     }
}
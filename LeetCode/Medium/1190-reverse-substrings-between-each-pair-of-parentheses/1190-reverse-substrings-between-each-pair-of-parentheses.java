class Solution {
    int idx = 0;
    int i = 0;
    int n;
    char[] ret;
    char[] s;
    
    public String reverseParentheses(String s) {
        n = s.length();
        ret = new char[n];
        this.s = s.toCharArray();
        
        helper(0);
        
        return new String(ret, 0, idx);
    }
    
    private void helper(int start){
        while (i < n){
            if (s[i] == '(') {
                i++;
                helper(idx);
            }
            else if (s[i] == ')') {
                i++;
                rev(start, idx-1);
                return;
            }
            else {
                ret[idx++] = s[i++];
            }
        }
    }
    
    private void rev(int l, int r){
        while (l < r){
            char temp = ret[l];
            ret[l] = ret[r];
            ret[r] = temp;
            l++;
            r--;
        }
    }
}
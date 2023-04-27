class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()){
            StringBuilder temp = new StringBuilder();
            temp.append(s.substring(i, i+k < s.length() ? i + k : s.length())).reverse();
            sb.append(temp);
            if (i+k > s.length()) break;
            if (i+k+k < s.length()){
                sb.append(s.substring(i+k,i+k+k));
            } else {
                sb.append(s.substring(i+k, s.length()));
            }
            i += k * 2;
        }
        return sb.toString();
    }
}
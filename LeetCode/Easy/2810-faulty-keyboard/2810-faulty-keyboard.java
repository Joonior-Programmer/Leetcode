class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char v : s.toCharArray()){
            if (v == 'i') sb.reverse();
            else sb.append(v);
        }
        
        return sb.toString();
    }
}
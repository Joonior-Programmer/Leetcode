class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for (char v : s.toCharArray()){
            if (v != '*') sb.append(v);
            else if (sb.length() > 0) sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}
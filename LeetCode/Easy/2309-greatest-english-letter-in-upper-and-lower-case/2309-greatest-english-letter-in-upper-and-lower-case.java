class Solution {
    public String greatestLetter(String s) {
        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        
        for (char v : s.toCharArray())
            if (v > 96) lower[v-97] = true;
            else upper[v-65] = true;
        
        for (int i = 25; i > -1; i--)
            if (upper[i] && lower[i]) return Character.toString(i+65);
        
        return "";
    }
}
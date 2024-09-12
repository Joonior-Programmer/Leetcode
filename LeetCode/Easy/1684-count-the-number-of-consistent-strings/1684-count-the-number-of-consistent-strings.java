class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allow = new boolean[26];
        int ret = words.length;
        
        for (int i = 0; i < allowed.length(); ++i) allow[allowed.charAt(i) - 97] = true;
        
        for (String word : words)
            for (char v : word.toCharArray())
                if (!allow[v-97]){
                    ret--;
                    break;
                }
        
        return ret;
    }
}
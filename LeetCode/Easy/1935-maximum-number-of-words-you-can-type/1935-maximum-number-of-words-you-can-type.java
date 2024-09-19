class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int ret = words.length;
        boolean[] broken = new boolean[26];
        
        for (int i = 0; i < brokenLetters.length(); ++i)
            broken[brokenLetters.charAt(i) - 97] = true;
        
        for (String word : words)
            for (char v : word.toCharArray())
                if (broken[v-97]){
                    ret--;
                    break;
                }
        
        return ret;
    }
}
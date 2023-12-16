class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> ret = new HashSet();
        
        for (String word : words){
            StringBuilder sb = new StringBuilder();
            
            for (char v : word.toCharArray()) sb.append(mos[v-'a']);
            
            ret.add(sb.toString());
        }
        
        return ret.size();
    }
}
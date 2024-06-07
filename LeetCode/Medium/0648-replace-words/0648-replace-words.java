class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Trie trie = new Trie();
        String[] ret = sentence.split(" ");
        int idx = 0;
        for (String word : dictionary){
            Trie curr = trie;
            StringBuilder sb = new StringBuilder();
            for (char v : word.toCharArray()){
                int temp = v - 'a';
                
                if (curr.trie[temp] == null) curr.trie[temp] = new Trie();
                sb.append(v);
                curr = curr.trie[temp];
            }
            curr.word = sb.toString();
        }
        
        for (String word : ret){
            Trie curr = trie;
            
            for (char v : word.toCharArray()){
                if (curr.word != null) break;
                
                if (curr.trie[v-'a'] != null) curr = curr.trie[v-'a'];
                else break;
            }
            
            if (curr.word != null) ret[idx] = curr.word;
            ++idx;
        }
        
        return String.join(" ",ret);
    }
}

class Trie {
    String word;
    Trie[] trie = new Trie[26];
}
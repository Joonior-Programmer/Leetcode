class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> seq = new HashMap<>();
        for (int i = 0; i < order.length(); ++i) seq.put(order.charAt(i), i);
        
        for (int i = 0; i < words.length - 1; ++i){
            int nextLength = words[i+1].length() - 1;
            for (int j = 0; j < words[i].length(); ++j){
                if (j > nextLength){
                    return false;
                } else if (seq.get(words[i].charAt(j)) < seq.get(words[i+1].charAt(j))){
                    break;
                } else if (seq.get(words[i].charAt(j)) > seq.get(words[i+1].charAt(j))){
                    return false;
                }
            }
        }
        return true;
    }
}
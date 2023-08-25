class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ret = new ArrayList();
        int n = s.length();
        int wordLen = words[0].length();
        int numWords = words.length;
        int totalLen = wordLen * numWords;
        HashMap<String, Integer> count = new HashMap();
        
        for (int i = 0; i < numWords; ++i) count.put(words[i], count.getOrDefault(words[i], 0) + 1);
        
        for (int i = 0; i < wordLen; ++i){
            int l = i;
            int r = i;
            HashMap<String, Integer> tempCount = new HashMap();
            while (r + wordLen <= n){
                String tempWord = s.substring(r, r+wordLen);
                r += wordLen;
                if (count.containsKey(tempWord)){
                    tempCount.put(tempWord, tempCount.getOrDefault(tempWord, 0) + 1);
                    
                    while (tempCount.get(tempWord) > count.get(tempWord)){
                        String tempKey = s.substring(l, l+wordLen);
                        tempCount.put(tempKey, tempCount.get(tempKey) - 1);
                        l += wordLen;
                    }
                    
                    if (r - l == totalLen){
                        ret.add(l);
                        String tempKey = s.substring(l, l+wordLen);
                        tempCount.put(tempKey, tempCount.get(tempKey) - 1);
                        l += wordLen;
                    }
                    
                } else {
                    tempCount.clear();
                    l = r;
                }
            }
        }
        
        return ret;
    }
}
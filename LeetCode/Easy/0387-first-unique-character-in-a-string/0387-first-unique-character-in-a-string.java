class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> counter = new HashMap<>();
        int result = -1;
        char[] sToChar = s.toCharArray();
        for (int i = 0; i < sToChar.length; ++i){
            counter.put(sToChar[i], counter.getOrDefault(sToChar[i], 0) + 1);
        }
        
        boolean exist = false;
        for (char k : counter.keySet()){
            if (counter.get(k) == 1) {
                exist = true;
                break;
            }
        }
        
        if (!exist) return result;
        
        for (int i = 0; i < sToChar.length; ++i){
            if (counter.get(sToChar[i]) == 1) {
                result = i;
                break;
            }
        }
        return result;
    }
}
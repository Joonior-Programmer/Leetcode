class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> counter = new HashMap<>();
        int ret = 0;
        boolean isOneAdded = false;
        
        for (char v : s.toCharArray()){
            counter.put(v, counter.getOrDefault(v, 0) + 1);
        }
        
        for (char v : counter.keySet()){
            ret += counter.get(v) / 2 * 2;
            if (!isOneAdded && counter.get(v) % 2 == 1) {
                ++ret;
                isOneAdded = true;
            }
        }
        
        return ret;
    }
}
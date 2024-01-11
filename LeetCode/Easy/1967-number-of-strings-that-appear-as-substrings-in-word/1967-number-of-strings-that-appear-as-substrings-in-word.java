class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ret = 0;
        
        for (String pattern : patterns){
            if (word.contains(pattern)) ++ret;
        }
        
        return ret;
    }
}
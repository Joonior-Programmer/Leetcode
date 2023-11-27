class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] types = new boolean[128];
        int ret = 0;
        
        for (char jewel : jewels.toCharArray()) types[jewel] = true;
        
        for (char stone : stones.toCharArray())
            if (types[stone]) ++ret;
        
        return ret;
    }
}
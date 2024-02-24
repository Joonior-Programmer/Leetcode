class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26];
        int ret = 99999;
        
        for (char v : text.toCharArray()) ++count[v-97];
        
        ret = Math.min(ret, count['b'-97]);
        ret = Math.min(ret, count['a'-97]);
        ret = Math.min(ret, count['l'-97] / 2);
        ret = Math.min(ret, count['o'-97] / 2);
        ret = Math.min(ret, count['n'-97]);
        
        return ret;
    }
}
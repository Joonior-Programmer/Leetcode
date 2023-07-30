class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Boolean> exist = new HashMap();
        int ret = 0;
        int count = 0;
        Queue<Character> q = new LinkedList();

        for (char c : s.toCharArray()){
            if (!exist.getOrDefault(c, false)){
                exist.put(c, true);
                ++count;
                q.offer(c);
                ret = Math.max(count, ret);
            } else {
                while (q.peek() != c){
                    exist.put(q.peek(), false);
                    q.poll();
                    count--;
                }
                q.poll();
                q.offer(c);
            }
        }

        return ret;
    }
}
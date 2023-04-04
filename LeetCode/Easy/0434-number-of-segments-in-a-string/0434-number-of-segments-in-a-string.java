class Solution {
    public int countSegments(String s) {
        boolean empty = true;
        int ret = 0;
        for (char v : s.toCharArray()){
            if (v == ' ' && !empty) {
                ++ret;
                empty = true;
            } else if (v != ' ') empty = false;
        }
        if (!empty) ++ret;
        return ret;
    }
}
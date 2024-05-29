class Solution {
    public int numSteps(String s) {
        int ret = 0;
        int lead = 0;
        int r = s.length() - 1;

        while (r > 0){
            int temp = s.charAt(r) - '0' + lead;
            if (temp == 0) {
                ++ret;
                lead = 0;
            } else if (temp == 2) {
                ++ret;
                lead = 1;
            } else {
                ret += 2;
                lead = 1;
            }

            r--;
        }

        if (lead == 1) ++ret;

        return ret;
    }
}


class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-", "").toUpperCase();
        int total = s.length() % k == 0 ? s.length() + s.length() / k - 1 : s.length() + s.length() / k;
        if (total < 1) return "";
        char[] newS = s.toCharArray();
        char[] ret = new char[total];
        int j = total - 1;
        int temp = k;
        for (int i = s.length() - 1; i > -1; i--){
            ret[j--] = newS[i];
            temp--;
            if (temp == 0 && j > -1) {
                ret[j--] = '-';
                temp = k;
            }
        }
        return new String(ret);
    }
}
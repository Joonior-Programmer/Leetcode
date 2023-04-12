class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-", "").toUpperCase();
        StringBuilder sb = new StringBuilder(s).reverse();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < s.length(); i = i + k) {
            if (i + k >= s.length()) {
                ret.append(sb.substring(i, s.length()));
            }
            else {
                ret.append(sb.substring(i, i+k));
                ret.append('-');
            }
        }
        return ret.reverse().toString();
    }
}
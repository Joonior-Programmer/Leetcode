class Solution {
    public int titleToNumber(String columnTitle) {
        int ret = 0;
        int power = columnTitle.length() - 1;
        for (int i = 0; i < columnTitle.length(); ++i){
            ret += (columnTitle.charAt(i) - 64) * Math.pow(26, power);
            --power;
        }
        return ret;
    }
}
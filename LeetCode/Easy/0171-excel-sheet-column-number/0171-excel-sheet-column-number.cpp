class Solution {
public:
    int titleToNumber(string columnTitle) {
        int ret = 0;
        int power = columnTitle.length() - 1;
        for (int i = 0; i < columnTitle.length(); ++i){
            ret += (columnTitle[i] - 64) * pow(26, power);
            --power;
        }
        return ret;
    }
};